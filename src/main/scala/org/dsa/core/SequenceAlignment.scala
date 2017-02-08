package org.dsa.core

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.dsa.rdd.{AlignmentRecordTopK, AlignmentRecord}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by xubo on 2016/11/28.
  */
abstract class SequenceAlignment extends AligmentTrait with Serializable {

  val className = this.getClass().getSimpleName().filter(!_.equals('$'))


  def run(scoreMatrixFile: String, queryFile: String, refFile: String, splitNum: Int, taskNum: Int, topK: Int, sc: SparkContext): Array[AlignmentRecordTopK] = {

    // 1 preprocess

    //1.1 preprocessQuery
    val querys = preprocessQuery(queryFile, sc)

    //1.2 preprocessQuery
    val refRDD = preprocessRef(refFile, splitNum, sc)

    //1.3 preprocessScoreMatrix
    val scoreMatrix = preprocessScoreMatrix(scoreMatrixFile, sc)

    // 2 align
    var result = new ArrayBuffer[AlignmentRecordTopK]()
    querys.foreach { query =>
      result.append(align(query, refRDD, scoreMatrix, topK, sc))
    }

    return result.toArray
  }

  /**
    * 对当条query序列和refRDD进行序列比对，并返回结果
    *
    * @param query       查询序列
    * @param refRDD      ref database
    * @param scoreMatrix 平均矩阵，如蛋白质的blosum50
    * @param topK        topK
    * @param sc          SparkContext
    * @return 比对后的结果
    */
  def align(query: (String, String), refRDD: RDD[(String, String)], scoreMatrix: Array[Array[Int]], topK: Int, sc: SparkContext): AlignmentRecordTopK

  /**
    * 将queryFile读入并进行预处理，返回字符串数组
    *
    * @param queryFile 输入文件名
    * @param sc        SparkContext
    * @return 返回预处理结果
    */
  def preprocessQuery(queryFile: String, sc: SparkContext): Array[(String, String)] = {
    val querySource = sc.textFile(queryFile).map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }
    querySource.toArray()
  }

  /**
    * 对ref文件进行预处理
    *
    * @param refFile  ref文件
    * @param splitNum 读入的partition数
    * @param sc       SparkContext
    * @return 返回预处理结果
    */
  def preprocessRef(refFile: String, splitNum: Int, sc: SparkContext): RDD[(String, String)] = {
    val refSource = sc.textFile(refFile, splitNum)
    val refRDD = refSource.map { eachLine =>
      val eachDbSequence = eachLine.split(",")
      (eachDbSequence(0), eachDbSequence(1))
    }
    refRDD
  }

  /**
    * 对scoreMartix进行预处理
    *
    * @param scoreMatrixFile scoreMartix文件
    * @param sc              SparkContext
    * @return 返回预处理结果
    */
  def preprocessScoreMatrix(scoreMatrixFile: String, sc: SparkContext): Array[Array[Int]]

  //  def preprocessScoreMatrix(scoreMatrixFile: String, sc: SparkContext): Array[Array[Int]] = {
  //    val scoreMatrixRDD = sc.textFile(scoreMatrixFile)
  //    val scoreMatrixArray = scoreMatrixRDD.map { eachLine =>
  //      eachLine.split(",").map { each =>
  //        each.toInt
  //      }
  //    }.toArray()
  //    val scoreMatrix = sc.broadcast(scoreMatrixArray)
  //    scoreMatrix.value
  //  }


}
