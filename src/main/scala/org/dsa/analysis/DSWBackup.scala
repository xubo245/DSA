package org.dsa.analysis

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/11/19.
  */

object DSWBackup {
  val alg = "DSW"
  var startTime = System.currentTimeMillis()
  var stopTime = System.currentTimeMillis()
  var outPath = new String
  var appName = new String
  var outStr = new StringBuilder

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

  def
  run(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int) {

    val queryArr = queryFile.toString.split("/")
    val dbArr = dbFile.toString.split("/")

    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())

    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      outPath = "file/output/DSW/" + iString + alg + "_" + "queryFile_" + queryArr(queryArr.length - 1) +
        "_dbFile_" + dbArr(dbArr.length - 1) + "_splitNum_" + splitNum.toString +
        "_taskNum_" + taskNum.toString + "_topK_" + topK.toString
    } else {
      outPath = "/xubo/project/SparkSW/output/time/" +
        iString + alg + "_" + "queryFile_" + queryArr(queryArr.length - 1) +
        "_dbFile_" + dbArr(dbArr.length - 1) + "_splitNum_" + splitNum.toString +
        "_taskNum_" + taskNum.toString + "_topK_" + topK.toString
    }
    outStr.append("initTime1\t")
      .append("alg" + "\t")
      .append("data" + "\t")
      .append("query" + "\t")
      .append("splitNum" + "\t")
      .append("taskNum" + "\t")
      .append("org/dsw/topK" + "\t")
      .append("totalTime\t")
      .append("fileName\t")
      .append("\n")

    outStr.append(iString + "\t")
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
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[8]")
    }
    // initialize SparkContext
    val spark = new SparkContext(conf)

    compute(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int, spark)
    stopTime = System.currentTimeMillis()
    outStr.append((stopTime - startTime) / 1000.0 + "\t").append(outPath + "\t")
    saveResult(outStr.toString())
  }


  def compute(subMatrix: String, queryFile: String, dbFile: String, splitNum: Int, taskNum: Int, topK: Int, spark: SparkContext) {

    // read substitution matrix file blosum50 from HDFS
    val blosumFile = spark.textFile(subMatrix)
    val blosum = blosumFile.map { eachLine =>
      eachLine.split(",").map { each =>
        each.toInt
      }
    }.toArray()
    //    val blosumFile = inFile.map(line => {
    //      val reader = new CSVReader(new StringReader(line))
    //      reader.readNext()
    //    })
    //    val blosumFileArray = blosumFile.collect()
    //    val blosum = new Array[Array[Int]](26)
    //
    //    for (i <- 0 to 25) {
    //      blosum(i) = new Array[Int](26)
    //    }
    //
    //    for (i <- 0 to 25) {
    //      for (j <- 0 to 25) {
    //        blosum(i)(j) = blosumFileArray(i)(j).toInt
    //      }
    //    }

    // create broadcast variable for blosum50 matrix
    val bcBlosum = spark.broadcast(blosum)
    val bcBlosumValue = bcBlosum.value

    // read query sequence file from HDFS
    //    val querySource = Source.fromFile(queryFile, "UTF-8")
    //    val queryContent = querySource.mkString
    val querySource = spark.textFile(queryFile)
    var querys = querySource.toArray()
    outPath = outPath + "_queryNumber_" + querys.length.toString
    //    val brContent = spark.broadcast(queryContent)
    //    val querySeqCon = brContent.value
    //    var querySeqLen = querySeqCon.length + 1

    // read database sequence file from HDFS
    val proteinFile = spark.textFile(dbFile, splitNum)

    // map process of SparkSW
    //    val partitionDefault=proteinFile.partitions.length
    //    val everyScore = proteinFile.coalesce(numPartitions=partitionDefault*4,shuffle=true).map { eachLine => {
    val proteinRDD = proteinFile.map { eachLine =>
      val eachDbSequence = eachLine.split(",")
      (eachDbSequence(0), eachDbSequence(1))
    }
    //    proteinRDD.persist()
    querys.foreach { query =>
      sw(proteinRDD, query, bcBlosumValue, topK, spark)
    }
    //    proteinRDD.unpersist()
    spark.stop()
  }

  def sw(refRDD: RDD[(String, String)], querySeqCon: String, bcBlosumValue: Array[Array[Int]], topK: Int, spark: SparkContext) {

    val everyScore = refRDD.map { each => {

      val eachDbSeqName = each._1
      val eachDbSeqCon = each._2

      val querySeqLen = querySeqCon.length + 1
      // get name and content of each database sequences
      //      val eachDbSeqName = eachDbSequence(0)
      //      val eachDbSeqCon = eachDbSequence(1)
      var eachDbSeqLen = eachDbSeqCon.length + 1

      // new arrays and initialize them for matrices
      var F = new Array[Array[Int]](eachDbSeqLen)
      var E = new Array[Array[Int]](eachDbSeqLen)
      var H = new Array[Array[Int]](eachDbSeqLen)
      for (i <- 0 until eachDbSeqLen) {
        F(i) = new Array[Int](querySeqLen)
        F(i)(0) = 0
        E(i) = new Array[Int](querySeqLen)
        E(i)(0) = 0
        H(i) = new Array[Int](querySeqLen)
        H(i)(0) = 0
      }
      for (i <- 0 until querySeqLen) {
        F(0)(i) = 0
        E(0)(i) = 0
        H(0)(i) = 0
      }
      // initialize one maximum score to zero
      var maxScore = 0

      // core of SW algorithm
      for (i <- 1 to (eachDbSeqLen - 1)) {
        for (j <- 1 to (querySeqLen - 1)) {
          //                    F(i)(j) = Array((F(i - 1)(j) - 2), (H(i - 1)(j) - 12)).max
          //                    E(i)(j) = Array((E(i)(j - 1) - 2), (H(i)(j - 1) - 12)).max
          var f1 = F(i - 1)(j) - 2
          val h1 = H(i - 1)(j) - 12
          F(i)(j) = if (f1 > h1) {
            f1
          } else {
            h1
          }

          var e2 = E(i)(j - 1) - 2
          var h2 = H(i)(j - 1) - 12
          E(i)(j) = if (e2 > h2) {
            e2
          } else {
            h2
          }

          //          H(i)(j) = Array(0, E(i)(j), F(i)(j), (H(i - 1)(j - 1) + score(eachDbSeqCon(i - 1).toInt, querySeqCon(j - 1).toInt))).max

          //max
          var maxTmp = 0
          val eTmp = E(i)(j)
          if (eTmp > maxTmp) {
            maxTmp = eTmp
          }

          val fTmp = F(i)(j)
          if (fTmp > maxTmp) {
            maxTmp = fTmp
          }

          val hTmp = H(i - 1)(j - 1) + score(eachDbSeqCon(i - 1).toInt, querySeqCon(j - 1).toInt)
          if (hTmp > maxTmp) {
            maxTmp = hTmp
          }
          H(i)(j) = maxTmp

          if (H(i)(j) > maxScore) {
            maxScore = H(i)(j)
          }
        }
      }

      def score(up: Int, left: Int): Int = {
        var score = bcBlosumValue(left - 65)(up - 65)
        return score
      }
      (maxScore, eachDbSeqName)
    } // end of eachLine
    } // end of proteinFile.map

    // cache everyScoreFiltered in memory
    everyScore.persist()


    val TopScore = everyScore.top(topK)
    println(appName)
    TopScore.foreach(println)
    println()

    stopTime = System.currentTimeMillis();

  }

  // end of main

  def saveResult(str: String): Unit = {

    val conf = new SparkConf().setAppName(alg + " Application:saveResult,out:" + outPath)
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[8]")
    }
    // initialize SparkContext
    val sc = new SparkContext(conf)
    val rddSave = sc.parallelize(Array(str.toString()), 1)
    rddSave.saveAsTextFile(outPath)
    sc.stop

  }
}

//end of object

