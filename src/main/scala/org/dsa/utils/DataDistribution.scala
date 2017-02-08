package org.dsa.utils

import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
  * Created by xubo on 2016/11/19.
  */


class DataDistribution {
  /**
    * 计算数据分布的区间数量和加权平均值
    *
    * @param input 处理好的分布数据
    * @param sc    parkContext
    * @return 区间、Sum和加权平均值的数组
    */
  def countSumAndAvg(input: String, sc: SparkContext): Array[Array[Double]] = {
    val RDD = sc.textFile(input).map {
      each =>
        val strArr = each.split(Array(')', ',', '('))
        (strArr(1), strArr(2))
    }
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())

    var max = 0
    RDD.toArray().foreach { each =>
      if (each._1.toInt > max) {
        max = each._1.toInt
      }
    }
    var out = Array.ofDim[Double](max / 100 + 1, 3)
    for (i <- 1 to out.length) {
      out(i - 1)(0) = 100 * i
    }
    RDD.toArray().foreach { each =>
      out(each._1.toInt / 100)(1) = out(each._1.toInt / 100)(1) + each._2.toDouble
      out(each._1.toInt / 100)(2) = out(each._1.toInt / 100)(2) + each._2.toDouble * each._1.toInt
    }
    for (i <- 1 to out.length) {
      out(i - 1)(2) = (out(i - 1)(2)) / out(i - 1)(1)
    }
    out
  }
}

object DataDistribution {
  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("CompareTopK")
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[8]")
    }

    val sc = new SparkContext(conf)

    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      //      val file = "file\\project\\dataDistribution\\input\\D1LineLengthCount\\20161118234228413"
      //      val out = "file\\project\\dataDistribution\\output\\dataDistribution"
      val file = "file\\input\\WordCount\\DL1LengthCount\\20161230233851512"
      val out = "file\\project\\dataDistribution\\output\\dataDistribution/WordCound"
      //      refDataDistribution(file, out, sc)
      compute(file, out, sc)
    } else {
      val out = args(1)
      refDataDistribution(args(0), args(1), sc)
    }
    sc.stop()
  }

  def compute(file: String, out: String, sc: SparkContext): Unit = {

    val fileArr = Array(
      "file\\input\\WordCount\\DL1LengthCount\\20161230233851512",
      "file\\input\\WordCount\\DL2LengthCount\\20161230233908197",
      "file\\input\\WordCount\\DL3LengthCount\\20161230233925494",
      "file\\input\\WordCount\\DL4LengthCount\\20161230233952508",
      "file\\input\\WordCount\\DL5LengthCount\\20161230234006528",
      "file\\input\\WordCount\\DL6LengthCount\\20161230234024448",
      "file\\input\\WordCount\\DL7LengthCount\\20161230234051788",
      "file\\input\\WordCount\\DL8LengthCount\\20161230234121419",
      "file\\input\\WordCount\\DL9LengthCount\\20161230234157899",
      "file\\input\\WordCount\\DL10LengthCount\\20161230234236762"
    )

//    val fileArr = Array("file\\project\\dataDistribution\\input\\D1LineLengthCount\\20161118234228413",
//      "file\\project\\dataDistribution\\input\\D2LineLengthCount\\20161028230129343",
//      "file\\project\\dataDistribution\\input\\D3LineLengthCount\\20161028230156164",
//      "file\\project\\dataDistribution\\input\\D4LineLengthCount\\20161028230226247",
//      "file\\project\\dataDistribution\\input\\D5LineLengthCount\\20161028230254231",
//      "file\\project\\dataDistribution\\input\\D6LineLengthCount\\20161028230320171",
//      "file\\project\\dataDistribution\\input\\D7LineLengthCount\\20161028230402806",
//      "file\\project\\dataDistribution\\input\\D8LineLengthCount\\20161028230438554",
//      "file\\project\\dataDistribution\\input\\D9LineLengthCount\\20161028230618460",
//      "file\\project\\dataDistribution\\input\\D10LineLengthCount\\20161028230840727"
//    )
    for (i <- fileArr) {
      refDataDistribution(i, out, sc)
    }
  }

  def refDataDistribution(file: String, out: String, sc: SparkContext): Unit = {
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())

    val RDD = sc.textFile(file)
    val count = RDD.map { each =>
      val str = each.split(Array('(', ')', ','))
      str(2).toInt
    }.reduce(_ + _).toDouble

    println(file)
    println(count)
    val disRDD = RDD.map { each =>
      val str = each.split(Array('(', ')', ','))
      (str(1).toInt, str(2).toInt / count)
    }.repartition(1).sortByKey()

    var arrTup = disRDD.toArray()

    val martix = Array.ofDim[Double](arrTup.length, 2)

    var sum = 0.0
    var tmp = 100;
    var index = 0;
    var arrayBuffer = new ArrayBuffer[String]()
    for (i <- 0 until martix.length) {
      sum = sum + arrTup(i)._2
      martix(i)(0) = arrTup(i)._1
      martix(i)(1) = sum
      while (martix(i)(0) > tmp) {
        arrayBuffer.append(tmp.toString + "," + ((sum + martix(i)(1)) / 2.0).toString)
        tmp = tmp + 100
      }
    }

    arrayBuffer.take(10).foreach(println)

    val save = martix.map { each =>
      //      (each(0).toInt, each(1))
      each(0).toInt.toString + "," + each(1).toString
    }
    val path = out + "time" + iString + "Count" + count.toInt
    sc.parallelize(save).repartition(1).saveAsTextFile(path)
    val pathTotal = out + "time" + iString + "Count" + count.toInt + "total"
    sc.parallelize(arrayBuffer.toArray[String]).repartition(1).saveAsTextFile(pathTotal)
  }


}
