package org.dsa.core

import org.apache.spark.{SparkContext, SparkConf}
import org.bdgenomics.adam.rdd.ADAMContext._

/**
  * Created by xubo on 2016/12/16.
  */

object DSAAdamTest {
  def main(args: Array[String]) {

    val conf = new SparkConf().setMaster("local[8]").setAppName("adam")
      .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
    val sc = new SparkContext(conf)
    //    val input = "file/input/fastq/fix1.fastq"
    val input = "file/input/fastq/g38L100c50Nhs20.fastq"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
    sc.stop()

  }
}
