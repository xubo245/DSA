package org.dsa.utils

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/10/31.
  */
object ReduceTest {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("ReduceTest Application").setMaster("local[4]")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(Array(("hello", 1), ("hello", 2), ("world", 5)))
    val result=reduceByKeyTest(sc, rdd)
    println(result)
    sc.stop()
  }

  /**
    *
    * @param sc
    * @param rdd
    * @return
    */
  def reduceByKeyTest(sc: SparkContext, rdd: RDD[(String, Int)]):(String, Int) = {
    val rdd2=rdd.reduce { (a, b) =>
      if (a._1 == b._1) {
        (a._1, a._2 + b._2)
      } else {
        a
      }
    }
    rdd2
  }
}
