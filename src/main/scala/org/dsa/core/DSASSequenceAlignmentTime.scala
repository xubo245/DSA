package org.dsa.core

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/12/4.
  */
abstract class DSASSequenceAlignmentTime extends DSASSequenceAlignment {
  val alg = this.getClass().getSimpleName().filter(!_.equals('$'))
  var startTime = System.currentTimeMillis()
  var stopTime = System.currentTimeMillis()
  var outStr = new String
  var appName = new String
  var outFile = new StringBuilder

  def runWithIime(scoreMatrix: String, queryFile: String, refFile: String ,scoreMatrixFile: String = defaultScoreMatrix, open: Int = defaultOpen, gap: Int = defaultGap, splitNum: Int = defaultSplitNum, taskNum: Int =defaultTaskNum, topK: Int =defaultTopK) {

    val queryArr = queryFile.toString.split("/")
    val dbArr = refFile.toString.split("/")

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
      ",dbFile=" + refFile.toString + ",splitNum=" + splitNum.toString +
      ",taskNum=" + taskNum.toString + ",topK=" + topK.toString


    startTime = System.currentTimeMillis()
    // set application name
    val conf = new SparkConf().setAppName(appName)

    // initialize SparkContext
    val sc = new SparkContext(conf)
    //    val argsArr = Array(subMatrix, queryFile, dbFile, splitNum.toString, taskNum.toString, topK.toString)
    //    SparkSWPaper.main(argsArr)
    val result = run(sc, queryFile, refFile, scoreMatrix, open, gap, splitNum, taskNum, topK)
    //    (subMatrix, queryFile, dbFile, splitNum, taskNum, topK, sc)
    //     set application name
    //    val conf = new SparkConf().setAppName(appName)
    //    if (System.getProperties.getProperty("os.name").contains("Windows")) {
    //      conf.setMaster("local[16]")
    //    }
    //    // initialize SparkContext
    //    val spark = new SparkContext(conf)
    //    SparkSWTime.compute(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int, spark)
    result.foreach { each =>
      print("topK:" + each.getTopK() + " Query:" + each.getQueryName() + "\t")
      each.getAlignmentRcoreds().foreach { alignmentRecord =>
        print(alignmentRecord + "\t")
      }
    }
    sc.stop()
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
