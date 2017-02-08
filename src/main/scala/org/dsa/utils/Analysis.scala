package org.dsa.utils

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}

import scala.sys.process._

/**
  * 分析时间：不同的序列匹配，分析文件
  * SparkSW,NewSW
  *
  * Created by xubo on 2016/10/31.
  */
object Analysis {
  def main(args: Array[String]) {

    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    val in = args(0).replace("/", "_")
    val outStr = "/xubo/project/SparkSW/output/Analysis/" + iString + in

    val conf = new SparkConf().setAppName("Analysis Application:" + args(0) + "==>" + outStr)
    val sc = new SparkContext(conf)
    println(args(0) + "==>" + outStr)
    val arr = Array(1)
    //        val result = "hadoop fs -ls /xubo/project/SparkSW/output/time/timeAnalysis/" !!;
    val run = "hadoop fs -ls " + args(0)
    val result = run !!;
    val out = result.split("\n").filter { each =>
      if (each.contains("topK_5")) {
        true
      } else {
        false
      }
    }.map { each =>
      //      println(each)
      val arr = each.split("\\s+")
      //      println(arr.length + ":" + arr(arr.length - 1))
      arr(arr.length - 1)
    }.filter { each =>
      each != null && each.length > 5
    }

    var str = new StringBuilder()
    if (out.length > 0 && out != null) {
      for (i <- out) {
        val rdd = sc.textFile(i)
        val rdd2 = rdd.filter { each =>
          if (each.startsWith("/xubo/")) {
            true
          } else if (each.startsWith("initTime1") || each.startsWith("threshold")) {
            false
          } else if (each.length < 1) {
            false
          } else {
            true
          }
        }
        val arr = rdd2.collect()
        var str1: String = null
        var str2: String = null
        //      println("arr" + arr)
        if (arr(0).startsWith("initTime1") || arr(0).startsWith("threshold")) {
          str.append(arr(1)).append("\n")
        } else {
          str.append(arr(0)).append("\n")
        }

      }



      val rddSave = sc.parallelize(Array(str.toString()), 1)
      //    rddSave.foreach(println)
      rddSave.saveAsTextFile(outStr)
    }
    println("success")
    sc.stop()
  }
}
