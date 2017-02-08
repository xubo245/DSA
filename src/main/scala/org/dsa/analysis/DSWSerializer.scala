package org.dsa.analysis

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}
import org.dsa.core.DSW
import org.dsa.rdd.AlignmentRecord


/**
  * @author xubo
  *         2016.11.29
  *  use Kryo Serializer
  */

object DSWSerializer {
  var startTime = System.currentTimeMillis()
  var stopTime = System.currentTimeMillis()
  var outStr = new String
  var appName = new String
  var outFile = new StringBuilder
  var alg = "DSWSerializer"

  def main(args: Array[String]) {

    val subMatrix = args(0)
    val queryFile = args(1)
    val dbFile = args(2)
    val splitNum = args(3).toInt
    val taskNum = args(4).toInt
    val topK = args(5).toInt

    val dsw = new DSW()

    val queryArr = queryFile.toString.split("/")
    val dbArr = dbFile.toString.split("/")

    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())

    //    val alg = "DSWSerializer"
    outStr = "/xubo/project/SparkSW/output/time/" +
      iString + alg + "_" + "queryFile_" + queryArr(queryArr.length - 1) +
      "_dbFile_" + dbArr(dbArr.length - 1) + "_splitNum_" + splitNum.toString +
      "_taskNum_" + taskNum.toString + "_topK_" + topK.toString

    outFile.append("initTime1\t")
      .append("alg" + "\t")
      .append("data" + "\t")
      .append("query" + "\t")
      .append("splitNum" + "\t")
      .append("taskNum" + "\t")
      .append("org/dsw/topK" + "\t")
      .append("totalTime\t")
      .append("fileName\t")
      .append("\n")

    outFile.append(iString + "\t")
      .append(alg + "\t")
      .append(dbArr(dbArr.length - 1) + "\t")
      .append(queryArr(queryArr.length - 1) + "\t")
      .append(splitNum.toString + "\t")
      .append(taskNum.toString + "\t")
      .append(topK.toString + "\t")

    appName = alg + " Application:" + "queryFile=" + queryFile.toString +
      ",dbFile=" + dbFile.toString + ",splitNum=" + splitNum.toString +
      ",taskNum=" + taskNum.toString + ",topK=" + topK.toString


    startTime = System.currentTimeMillis()
    // set application name
    val conf = new SparkConf().setAppName(appName)
    conf.set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")

    // initialize SparkContext
    val spark = new SparkContext(conf)

    val result = dsw.run(queryFile: String, dbFile: String, subMatrix: String, splitNum: Int, taskNum: Int, topK: Int, spark)

    result.foreach { each =>
      println("topK:" + each.getTopK() + " Query:" + each.getQueryName())
      each.getAlignmentRcoreds().foreach { alignmentRecord =>
        println(alignmentRecord)
      }
      println()
    }
    stopTime = System.currentTimeMillis()
    outFile.append((stopTime - startTime) / 1000.0 + "\t").append(outStr + "\t")
    spark.stop()
    saveResult(outFile.toString())
  }

  def saveResult(str: String): Unit = {

    val conf = new SparkConf().setAppName(alg + " Application:saveResult,out:" + outStr)
    // initialize SparkContext
    val sc = new SparkContext(conf)
    val rddSave = sc.parallelize(Array(str.toString()), 1)
    rddSave.saveAsTextFile(outStr)
    sc.stop

  }


}
