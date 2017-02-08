package org.dsa.core.adam

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.bdgenomics.adam.rdd.ADAMContext._
import org.dsa.core.SequenceAlignment
import org.dsa.rdd.{AlignmentRecord, AlignmentRecordTopK}
import org.dsa.utils.NameOrdering

/**
  * Created by xubo on 2016/12/16.
  */
abstract class Adam extends SequenceAlignment {
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
      val alignment = sa(query._2, ref._2)
      //      (alignment.score1, alignment)
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

  def sa(query: String, ref: String): AlignmentRecord

  /**
    * 对scoreMartix进行预处理
    *
    * @param scoreMatrixFile scoreMartix文件
    * @param sc              SparkContext
    * @return 返回预处理结果
    */
  override def preprocessScoreMatrix(scoreMatrixFile: String, sc: SparkContext): Array[Array[Int]] = null

  /**
    * 将queryFile读入并进行预处理，返回字符串数组
    *
    * @param queryFile 输入文件名
    * @param sc        SparkContext
    * @return 返回预处理结果
    */
  override def preprocessQuery(queryFile: String, sc: SparkContext): Array[(String, String)] = {
    sc.loadAlignments(queryFile).map { each =>
      (each.getReadName, each.getSequence)
    }.collect()
  }

  /**
    * 对ref文件进行预处理
    *
    * @param refFile  ref文件
    * @param splitNum 读入的partition数
    * @param sc       SparkContext
    * @return 返回预处理结果
    */
  override def preprocessRef(refFile: String, splitNum: Int, sc: SparkContext): RDD[(String, String)] = {
    sc.loadAlignments(refFile).map { each =>
      (each.getContig.getContigName, each.getSequence)
    }
  }
}
