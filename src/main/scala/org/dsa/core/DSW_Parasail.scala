package org.dsa.core

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.dsa.mediator.parasail.ParasailScala
import org.dsa.rdd.AlignmentRecordTopK
import org.dsa.utils.NameOrdering

/**
  * Created by xubo on 2016/12/4.
  */
class DSW_Parasail extends SequenceAlignmentTime{
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
      val alignment = ParasailScala.align(query._2, ref._2)
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

  /**
    * 对scoreMartix进行预处理
    *
    * @param scoreMatrixFile scoreMartix文件
    * @param sc              SparkContext
    * @return 返回预处理结果
    */
  override def preprocessScoreMatrix(scoreMatrixFile: String, sc: SparkContext): Array[Array[Int]] = null
}

object DSW_Parasail {
  def main(args: Array[String]) {
    val subMatrix = args(0)
    val queryFile = args(1)
    val dbFile = args(2)
    val splitNum = args(3).toInt
    val taskNum = args(4).toInt
    val topK = args(5).toInt
    val dsw_parasail = new DSW_Parasail()
    dsw_parasail.runWithIime(subMatrix: String,queryFile: String, dbFile: String,splitNum: Int, taskNum: Int, topK: Int)
  }
}
