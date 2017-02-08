package org.dsa.core

/**
  * Created by xubo on 2016/11/29.
  */
class SparkSWSuite extends DSWSuite {

  test("SparkSW suite 1") {
    sc.stop()
    val subMatrix = "file/input/subMatrix/hash50.csv"
    val queryFile = "file/input/query/Test/query"
    val dbFile = "file/input/query/Test/ref"
    val splitNum = "128"
    val taskNum = "1"
    val topK = "1"

    val argsArr = Array(subMatrix, queryFile, dbFile, splitNum, taskNum, topK)
    SparkSW.main(argsArr)

  }


  test("SparkSW suite ") {
    sc.stop()
    val subMatrix = "file/input/subMatrix/hash50.csv"
    val queryFile = "file/input/query/0P18691.file"
    val dbFile = "file/input/D1Line.fasta"
    val splitNum = "128"
    val taskNum = "1"
    val topK = "5"

    val argsArr = Array(subMatrix, queryFile, dbFile, splitNum, taskNum, topK)
    SparkSW.main(argsArr)

  }

  test("SparkSW score big ,small") {
    sc.stop()
    val subMatrix = "file/input/subMatrix/hash50.csv"
    val queryFile = "file/project/SparkSW/input/query/UPI000814841Esmall.file"
    val dbFile = "file/project/SparkSW/input/uniref/bigScoreRef.fasta"
    val splitNum = "1"
    val taskNum = "1"
    val topK = "3"

    val argsArr = Array(subMatrix, queryFile, dbFile, splitNum, taskNum, topK)
    SparkSW.main(argsArr)

  }

  test("SparkSW score big ") {
    sc.stop()
    val subMatrix = "file/input/subMatrix/hash50.csv"
    val queryFile = "file/project/SparkSW/input/query/UPI000814841E.file"
    val dbFile = "file/project/SparkSW/input/uniref/bigScoreRef.fasta"
    val splitNum = "1"
    val taskNum = "1"
    val topK = "1"

    val argsArr = Array(subMatrix, queryFile, dbFile, splitNum, taskNum, topK)
    SparkSW.main(argsArr)

  }


}
