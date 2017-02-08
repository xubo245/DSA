package org.dsa.core.prepare

import java.io.PrintWriter

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/12/31.
  */
object MergeFind {
  def main(args: Array[String]) {

    //    C:\all\idea\DSA\file\input\queryD\D9L10210
    val conf = new SparkConf().setAppName(this.getClass().getSimpleName().filter(!_.equals('$')))
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[16]")
    }

    val sc = new SparkContext(conf)
    val input = "file/input/queryD/D9L"
    val outPath = input + "10240N4"

    compute(input, outPath, sc)

    sc.stop()
  }

  def compute(input: String, outPath: String, sc: SparkContext): Unit = {
    val arr = Array(
      (10247, 1),
      (10244, 1),
      (10240, 1),
      (10229, 1)
    )

    var out = new PrintWriter(outPath)
    for (i <- 0 until (arr.length)) {
      val rdd = sc.textFile(input + arr(i)._1.toString)
      println(i)
      rdd.take(1).foreach(println)

      val str = rdd.take(1)
      out.println(str(0))
    }
    out.close()
  }

  //  val arr = Array(
  //    (10275, 1),
  //    (10258, 1),
  //    (10252, 1),
  //    (10247, 1),
  //    (10244, 1),
  //    (10240, 1),
  //    (10231, 2),
  //    (10229, 1),
  //    (10215, 1),
  //    (10210, 1))
}
