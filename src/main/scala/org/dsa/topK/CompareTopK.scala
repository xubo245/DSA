package org.dsa.topK

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/11/3.
  */
object CompareTopK {
  def main(args: Array[String]) {
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    val conf = new SparkConf().setAppName("CompareTopK")
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[4]")
    }

    val sc = new SparkContext(conf)

    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      val out = "file/test/TopK/output/topk" + iString + ".txt"
      compute("file/test/TopK/output/random20161103200827511", out, 3, sc)
    } else {
      val out = args(1) + iString
      compute(args(0), out, args(2).toInt, sc)
    }
    sc.stop()
  }

  def compute(input: String, out: String, K: Int, sc: SparkContext): Unit = {
    val rdd = sc.textFile(input).map { each =>
      val str = each.split(Array(',', '(', ')'))
      (str(1).toInt, str(2))
    }
    //methods 1
    var startTime = System.currentTimeMillis()
    val arrTopK1 = rdd.top(K)
    var endTime = System.currentTimeMillis()
    arrTopK1.foreach(each => println("\t\t" + each._1+","+each._2))
    val time1 = (endTime - startTime)
    println("\tK=" + K + "_top method 1 Time:" + time1 + " ms");

    //methods 2
    startTime = System.currentTimeMillis()
    var arrTopK2 = rdd.sortByKey(false, 1).take(K)
    arrTopK1.foreach(each => println("\t\t" + + each._1+","+each._2))
    endTime = System.currentTimeMillis()
    val time2 = (endTime - startTime)
    println("\tK=" + K + " sortByKey method 2 Time:" + time2 + " ms");
  }

}
