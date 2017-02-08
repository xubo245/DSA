package org.dsa.test


import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/11/6.
  */
object testReadFile {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')))
      .setMaster("local[4]")
    val sc = new SparkContext(conf)
    val rdd = sc.textFile("file\\test\\SparkSW\\input\\part-00000.txt")
    rdd.take(5).foreach(println)
    println()
    val rdd2 = rdd.map { each =>
      val str = each.split(Array(',', '(', ')'))
      //      println("test:" + str(1) + ":" + str(2))
      (str(1).toInt, str(2))
    }
    println()
    rdd2.top(5).foreach(println)
    println()
    rdd2.sortByKey(false).take(6).foreach(println)
    sc.stop()


  }
}
