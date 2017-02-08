package org.dsa.core

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.dsa.mediator.parasail.ParasailScala
import org.dsa.rdd.{AlignmentRecord, AlignmentRecordTopK}
import org.dsa.utils.NameOrdering
import parasail.{Matrix, RunParasail}
import ssw.SSW

/**
  * Created by xubo on 2016/12/4.
  */
class DSW_Train extends SequenceAlignmentTime {
  var threshold = 0


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
  override def align(query: (String, String), refRDD: RDD[(String, String)], scoreMatrix: Array[Array[Int]], topK: Int, sc: SparkContext): AlignmentRecordTopK = {
    //1 compute
    var alignmentRecordTopK = new AlignmentRecordTopK()
    val mapRDD = refRDD.map { ref =>
      //      implicit val ord = implicitly[NameOrdering]

      var alignment: AlignmentRecord = new AlignmentRecord()
      if (query._2.length * ref._2.length < threshold) {
        //        alignment.score1 = RunParasail.run(query._2, ref._2)
        alignment.score1 = RunParasail.runSW(query._2, ref._2, 12, 2, Matrix.blosum50)
      } else {
        alignment = new AlignmentRecord(SSW.align(query._2, ref._2))
      }
      alignment.refName = ref._1
      alignment
    }

    val alignmendRecordArray = mapRDD.top(topK)(NameOrdering)

    //2 transform
    alignmentRecordTopK.setTopK(topK)
    alignmentRecordTopK.setQueryName(query._1)
    alignmentRecordTopK.setAlignmentRcoreds(alignmendRecordArray)

    //3 return
    alignmentRecordTopK

  }

  /**
    * 对scoreMartix进行预处理
    *
    * @param scoreMatrixFile scoreMartix文件
    * @param sc              SparkContext
    * @return 返回预处理结果
    */
  override def preprocessScoreMatrix(scoreMatrixFile: String, sc: SparkContext): Array[Array[Int]] = null

  override def saveResult(str: String): Unit = {
    val strArr = str.split('\n')
    var strSave = new StringBuilder().append("threshold" + "\t" + strArr(0)).append("\n").append(threshold.toString + "\t" + strArr(1)).toString()
    super.saveResult(strSave)
  }
}

object DSW_Train {
  def main(args: Array[String]) {
    val subMatrix = args(0)
    val queryFile = args(1)
    val dbFile = args(2)
    val splitNum = args(3).toInt
    val taskNum = args(4).toInt
    val topK = args(5).toInt
    val dsw_train = new DSW_Train()

    for (i <- 0 to 300000 by 10000) {
      dsw_train.threshold = i
      dsw_train.runWithIime(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int)
      println()
      print("threshold=" + dsw_train.threshold)
      println("appName:" + dsw_train.appName)
    }

    dsw_train.threshold = Int.MaxValue
    //    dsw_train.threshold = 40000
    //    println("threshold=" + dsw_train.threshold)
    dsw_train.runWithIime(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int)
    println()
    print("threshold=" + dsw_train.threshold + "\t")
    println("appName:" + dsw_train.appName)
    println()
  }
}
