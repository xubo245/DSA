package org.dsa.core.etl

import scala.io.Source

/**
  * blosum ETL
  * Created by xubo on 2016/11/26.
  */
object BlosumETL {
  def main(args: Array[String]) {
    //    val ssw=new SSW()
    //    printArr(computeSSWMatrix())
    //    printArr(computeSSWMatrix())
    computeMatrixBase()
  }

  def computeSSWMatrix(strArr: Array[Array[String]]): Array[Array[Int]] = {

    var result = Array.ofDim[Int](128, 128);

    val m = strArr.length
    val n = strArr(0).length

    for (i <- 0 until result.length) {
      for (j <- 0 until result(i).length) {
        result(i)(j) = strArr(m - 1)(n - 1).toInt
      }
    }
    for (i <- 0 until m) {
      var char = strArr(i)(0).charAt(0)
      for (j <- 0 until result.length) {
        result(char.toInt)(j) = strArr(i)(strArr(i).length - 1).toInt
        result(j)(char.toInt) = strArr(i)(strArr(i).length - 1).toInt
      }
    }

    //    println(result(0)(0))
    for (i <- 0 until m) {
      var strI = strArr(i)(0).charAt(0)
      //       strArr(i)(0).toCharArray

      var valueI = strArr(i)(0).charAt(0).toInt
      //      println(strI + "=" + valueI + "=" + strArr(i)(0).charAt(0).toInt)

      for (j <- 1 until n) {

        var valueJ = strArr(j - 1)(0).charAt(0).toInt
        val tmp = strArr(i)(j).toInt
        result(valueI)(valueJ) = tmp
        //        arr(value)(j)

      }
    }

    //println(result(0)(0))
    result
  }

  def produceResult(): Unit = {
    //    var result={
    //      {"A","5","-2","-1","-2","-1","-1","-1","0","-2","-1","-2","-1","-1","-3","-1","1","0","-3","-2","0","-2","-2","-1","-1","-5"},
    //      {"R","-2","7","-1","-2","-4","1","0","-3","0","-4","-3","3","-2","-3","-3","-1","-1","-3","-1","-3","-1","-3","0","-1","-5"},
    //      {"N","-1","-1","7","2","-2","0","0","0","1","-3","-4","0","-2","-4","-2","1","0","-4","-2","-3","5","-4","0","-1","-5"},
    //      {"D","-2","-2","2","8","-4","0","2","-1","-1","-4","-4","-1","-4","-5","-1","0","-1","-5","-3","-4","6","-4","1","-1","-5"},
    //      {"C","-1","-4","-2","-4","13","-3","-3","-3","-3","-2","-2","-3","-2","-2","-4","-1","-1","-5","-3","-1","-3","-2","-3","-1","-5"},
    //      {"Q","-1","1","0","0","-3","7","2","-2","1","-3","-2","2","0","-4","-1","0","-1","-1","-1","-3","0","-3","4","-1","-5"},
    //      {"E","-1","0","0","2","-3","2","6","-3","0","-4","-3","1","-2","-3","-1","-1","-1","-3","-2","-3","1","-3","5","-1","-5"},
    //      {"G","0","-3","0","-1","-3","-2","-3","8","-2","-4","-4","-2","-3","-4","-2","0","-2","-3","-3","-4","-1","-4","-2","-1","-5"},
    //      {"H","-2","0","1","-1","-3","1","0","-2","10","-4","-3","0","-1","-1","-2","-1","-2","-3","2","-4","0","-3","0","-1","-5"},
    //      {"I","-1","-4","-3","-4","-2","-3","-4","-4","-4","5","2","-3","2","0","-3","-3","-1","-3","-1","4","-4","4","-3","-1","-5"},
    //      {"L","-2","-3","-4","-4","-2","-2","-3","-4","-3","2","5","-3","3","1","-4","-3","-1","-2","-1","1","-4","4","-3","-1","-5"},
    //      {"K","-1","3","0","-1","-3","2","1","-2","0","-3","-3","6","-2","-4","-1","0","-1","-3","-2","-3","0","-3","1","-1","-5"},
    //      {"M","-1","-2","-2","-4","-2","0","-2","-3","-1","2","3","-2","7","0","-3","-2","-1","-1","0","1","-3","2","-1","-1","-5"},
    //      {"F","-3","-3","-4","-5","-2","-4","-3","-4","-1","0","1","-4","0","8","-4","-3","-2","1","4","-1","-4","1","-4","-1","-5"},
    //      {"P","-1","-3","-2","-1","-4","-1","-1","-2","-2","-3","-4","-1","-3","-4","10","-1","-1","-4","-3","-3","-2","-3","-1","-1","-5"},
    //      {"S","1","-1","1","0","-1","0","-1","0","-1","-3","-3","0","-2","-3","-1","5","2","-4","-2","-2","0","-3","0","-1","-5"},
    //      {"T","0","-1","0","-1","-1","-1","-1","-2","-2","-1","-1","-1","-1","-2","-1","2","5","-3","-2","0","0","-1","-1","-1","-5"},
    //      {"W","-3","-3","-4","-5","-5","-1","-3","-3","-3","-3","-2","-3","-1","1","-4","-4","-3","15","2","-3","-5","-2","-2","-1","-5"},
    //      {"Y","-2","-1","-2","-3","-3","-1","-2","-3","2","-1","-1","-2","0","4","-3","-2","-2","2","8","-1","-3","-1","-2","-1","-5"},
    //      {"V","0","-3","-3","-4","-1","-3","-3","-4","-4","4","1","-3","1","-1","-3","-2","0","-3","-1","5","-3","2","-3","-1","-5"},
    //      {"B","-2","-1","5","6","-3","0","1","-1","0","-4","-4","0","-3","-4","-2","0","0","-5","-3","-3","6","-4","1","-1","-5"},
    //      {"J","-2","-3","-4","-4","-2","-3","-3","-4","-3","4","4","-3","2","1","-3","-3","-1","-2","-1","2","-4","4","-3","-1","-5"},
    //      {"Z","-1","0","0","1","-3","4","5","-2","0","-3","-3","1","-1","-4","-1","0","-1","-2","-2","-3","1","-3","5","-1","-5"},
    //      {"X","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-1","-5"},
    //      {"*","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","-5","1"}
    //    }
  }

  def computeSSWMatrix(): Array[Array[Int]] = {
    val file = Source.fromFile("file\\input\\subMatrix\\blosum62base.txt")
    val line = file.getLines().toArray
    var result = Array.ofDim[Int](128, 128);


    val m = line.length
    val n = line(0).split(",").length
    var strArr = Array.ofDim[String](m, n);
    for (i <- 0 until line.length) {
      val arr = line(i).split(",")
      for (j <- 0 until arr.length) {
        strArr(i)(j) = arr(j)
      }
    }

    for (i <- 0 until result.length) {
      for (j <- 0 until result(i).length) {
        result(i)(j) = strArr(m - 1)(n - 1).toInt
      }
    }
    for (i <- 0 until m) {
      var char = strArr(i)(0).charAt(0)
      for (j <- 0 until result.length) {
        result(char.toInt)(j) = strArr(i)(strArr(i).length - 1).toInt
        result(j)(char.toInt) = strArr(i)(strArr(i).length - 1).toInt
      }
    }

    //    println(result(0)(0))
    for (i <- 0 until m) {
      var strI = strArr(i)(0).charAt(0)
      //       strArr(i)(0).toCharArray

      var valueI = strArr(i)(0).charAt(0).toInt
      //      println(strI + "=" + valueI + "=" + strArr(i)(0).charAt(0).toInt)

      for (j <- 1 until n) {

        var valueJ = strArr(j - 1)(0).charAt(0).toInt
        val tmp = strArr(i)(j).toInt
        result(valueI)(valueJ) = tmp
        //        arr(value)(j)

      }
    }

    //println(result(0)(0))
    result
  }


  def computeSSWMatrix2(): Array[Array[Int]] = {
    val file = Source.fromFile("file\\input\\subMatrix\\blosum50V2base.txt")
    val line = file.getLines().toArray
    var result = Array.ofDim[Int](128, 128);


    val m = line.length
    val n = line(0).split("\\s++").length
    var strArr = Array.ofDim[String](m, n);
    for (i <- 0 until line.length) {
      val arr = line(i).split("\\s++")
      for (j <- 0 until arr.length) {
        strArr(i)(j) = arr(j)
      }
    }

    for (i <- 0 until result.length) {
      for (j <- 0 until result(i).length) {
        result(i)(j) = strArr(m - 1)(n - 1).toInt
      }
    }
    for (i <- 0 until m) {
      var char = strArr(i)(0).charAt(0)
      for (j <- 0 until result.length) {
        result(char.toInt)(j) = strArr(i)(strArr(i).length - 1).toInt
        result(j)(char.toInt) = strArr(i)(strArr(i).length - 1).toInt
      }
    }

    //    println(result(0)(0))
    for (i <- 0 until m) {
      var strI = strArr(i)(0).charAt(0)
      //       strArr(i)(0).toCharArray

      var valueI = strArr(i)(0).charAt(0).toInt
      //      println(strI + "=" + valueI + "=" + strArr(i)(0).charAt(0).toInt)

      for (j <- 1 until n) {

        var valueJ = strArr(j - 1)(0).charAt(0).toInt
        val tmp = strArr(i)(j).toInt
        result(valueI)(valueJ) = tmp
        //        arr(value)(j)

      }
    }

    //println(result(0)(0))
    result
  }

  def printArr(result: Array[Array[Int]]): Unit = {

    for (i <- 0 until result.length) {
      print("{")
      for (j <- 0 until result(i).length) {
        print(result(i)(j) + ",")
      }
      println(result(i)(result(i).length - 1) + "},")
    }

  }

  def computeMatrixBase(): Unit = {
    val file = Source.fromFile("file\\input\\subMatrix\\blosum62base")
    val line = file.getLines().toArray

    for (i <- 0 until line.length) {
      val arr = line(i).replace(" ", "").split(",")
      val j = 0
      print("{")
      for (j <- 0 until arr.length - 1) {
        print("\"" + arr(j) + "\",")
      }
      println("\"" + arr(arr.length - 1) + "\"},")
    }
  }

  def computeMatrixBasebackup1(): Unit = {
    val file = Source.fromFile("file\\input\\subMatrix\\blosum50V3base.txt")
    val line = file.getLines().toArray

    for (i <- 0 until line.length) {
      val arr = line(i).replace(" ", "").split(",")
      val j = 0
      print("{")
      for (j <- 0 until arr.length - 1) {
        print("\"" + arr(j) + "\",")
      }
      println("\"" + arr(arr.length - 1) + "\"},")
    }
  }
}
