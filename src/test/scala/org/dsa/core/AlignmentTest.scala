package org.dsa.core

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.dsa.rdd.AlignmentRecordTopK

/**
  * Created by xubo on 2016/11/28.
  */
class AlignmentTest extends SequenceAlignment {


  //  override val className: String = this.getClass().getSimpleName().filter(!_.equals('$'))
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
  override def align(query: (String, String), refRDD: RDD[(String, String)], scoreMatrix: Array[Array[Int]], topK: Int, sc: SparkContext): AlignmentRecordTopK = null

  /**
    * 对scoreMartix进行预处理
    *
    * @param scoreMatrixFile scoreMartix文件
    * @param sc              SparkContext
    * @return 返回预处理结果
    */
  override def preprocessScoreMatrix(scoreMatrixFile: String, sc: SparkContext): Array[Array[Int]] = null
}

object AlignmentTest {
  def main(args: Array[String]) {
    val alignmentTest = new AlignmentTest()
    println(alignmentTest.className)
    val conf = new SparkConf().setAppName(alignmentTest.className)
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[4]")
    }
    val sc = new SparkContext(conf)
    println(alignmentTest.run("", "", "", 0, 0, 0, sc)(0))
  }
}
