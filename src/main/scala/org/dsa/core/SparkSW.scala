package org.dsa.core

/**
  * Created by Guoguang Zhao on 2014/09/05.
  * The Smith-Waterman (SW) algorithm is universally used for a database search owing to its high sensitively. The widespread impact of the algorithm is reflected in over 8000 citations that the algorithm has received in the past decades. However, the algorithm is prohibitively high in terms of time and space complexity, and so poses significant computational challenges. Apache Spark is an increasingly popular fast big data analytics engine, which has been highly successful in implementing large-scale data-intensive applications on commodity hardware. This paper presents the first ever reported system that implements the SW algorithm on Apache Spark based computing framework, with a couple of off-the-shelf commercial clusters. The scalability and load balancing efficiency of the system were investigated by realistic ultra-large database from the state-of-the-art UniRef100. The experimental results indicated that the system shows efficient load balancing and horizontal scalability. This study revealed Spark framework provides a which is facilitate coping with ever increasing sizes of biological sequence databases.
  */

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark._
import org.dsa.core.sparkSW.{SparkSW => SparkSWPaper}

object SparkSW {
  val alg = "SparkSW"
  var startTime = System.currentTimeMillis()
  var stopTime = System.currentTimeMillis()
  var outStr = new String
  var appName = new String
  var outFile = new StringBuilder

  def main(args: Array[String]) {
    // arguments for input files and references

    val subMatrix = args(0)
    val queryFile = args(1)
    val dbFile = args(2)
    val splitNum = args(3).toInt
    val taskNum = args(4).toInt
    val topK = args(5).toInt

    run(subMatrix, queryFile, dbFile, splitNum, taskNum, topK)
  }

  def run(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int) {

    val queryArr = queryFile.toString.split("/")
    val dbArr = dbFile.toString.split("/")

    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())

    outStr = if (System.getProperties.getProperty("os.name").contains("Windows")) {
      "file/project/SparkSW/output/time/" +
        iString + alg + "_" + "queryFile_" + queryArr(queryArr.length - 1) +
        "_dbFile_" + dbArr(dbArr.length - 1) + "_splitNum_" + splitNum.toString +
        "_taskNum_" + taskNum.toString + "_topK_" + topK.toString
    } else {
      "/xubo/project/SparkSW/output/time/" +
        iString + alg + "_" + "queryFile_" + queryArr(queryArr.length - 1) +
        "_dbFile_" + dbArr(dbArr.length - 1) + "_splitNum_" + splitNum.toString +
        "_taskNum_" + taskNum.toString + "_topK_" + topK.toString
    }

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

    val argsArr = Array(subMatrix, queryFile, dbFile, splitNum.toString, taskNum.toString, topK.toString)
    SparkSWPaper.main(argsArr)


    //     set application name
    //    val conf = new SparkConf().setAppName(appName)
    //    if (System.getProperties.getProperty("os.name").contains("Windows")) {
    //      conf.setMaster("local[16]")
    //    }
    //    // initialize SparkContext
    //    val spark = new SparkContext(conf)
    //    SparkSWTime.compute(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int, spark)


    stopTime = System.currentTimeMillis()
    outFile.append((stopTime - startTime) / 1000.0 + "\t").append(outStr + "\t")
    saveResult(outFile.toString())
    outFile.clear()
  }

  def saveResult(str: String): Unit = {

    val conf = new SparkConf().setAppName(alg + " Application:saveResult,out:" + outStr)
    // initialize SparkContext
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[16]")
    }
    val sc = new SparkContext(conf)
    val rddSave = sc.parallelize(Array(str.toString()), 1)
    rddSave.saveAsTextFile(outStr)
    sc.stop

  }
}

//end of object
