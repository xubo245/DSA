package org.dsa.core.prepare

import java.io.{File, PrintWriter}

import org.apache.spark.{SparkConf, SparkContext}

import scala.io.Source

/**
  * Created by xubo on 2016/11/29.
  * find sequnce from ref database
  */
object FindLocal {
  var intervalVale = 0

  def main(args: Array[String]) {

    var time = 0
    if (args == null || args.length < 2) {
      throw new Exception("input should include: file and output")
    } else if (args.length < 3) {
      time = 100
    } else {
      time = args(2).toInt
    }
    intervalVale = 50
    val arr = (100 to 42965 by intervalVale).toArray
    //    val arr = Array(32771)
    findSaveByLength(args(0), args(1), arr, time)

  }

  def printArr(arr: Array[String]): Unit = {
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
  }


  def findSaveByLength(file: String, output: String, arr: Array[Int], time: Int): Unit = {

    for (i <- 0 until arr.length) {
      val result = findSequnceByLength(file, arr(i))
      if (result != null) {

        val str = result.split(",")
        val strLength = str(1).length + 1000000
        val refOutPath = output + "/RL" + strLength + str(0) + ".file"
        val queryOutPath = output + "/QL" + strLength + str(0) + ".file"
        val file = new File(output)
        if (!file.exists()) {
          //          file.mkdir()
          file.mkdirs()
        }
        val outRef = new PrintWriter(refOutPath)
        for (j <- 0 until time) {
          outRef.println(result)
        }
        outRef.close()

        val outQuery = new PrintWriter(queryOutPath)
        outQuery.println(result)
        outQuery.close()

      }
    }
  }

  /**
    * find sequnce by length in local mode
    *
    * @param file   input file
    * @param length length
    * @return sequnce array
    */
  def findSequnceByLength(file: String, length: Int, interval: Int = intervalVale): String = {
    val sources = Source.fromFile(file)
    val iter = sources.getLines()
    var flag = true
    var min = Integer.MAX_VALUE
    var minStr = ""
    while (iter.hasNext && flag) {
      val str = iter.next()
      val arr = str.split(",")

      if (arr.length == 2 && arr(1).length == length) {
        sources.close()
        return str
      }
      if (arr(1).length > length && arr(1).length < min) {
        minStr = str.toString
        min = arr(1).length
      }
    }
    sources.close()
    if (min - length < interval) {
      return minStr
    }
    null
  }

  def findSequnceByName(file: String, name: String): String = {
    val sources = Source.fromFile(file)
    val iter = sources.getLines()
    var flag = true
    var min = Integer.MAX_VALUE
    var minStr = ""
    while (iter.hasNext && flag) {
      val str = iter.next()
      val arr = str.split(",")
      if (arr.length == 2 && arr(0).equals(name)) {
        sources.close()
        return str
      }
    }
    sources.close()
    println("null")
    null
  }
}

