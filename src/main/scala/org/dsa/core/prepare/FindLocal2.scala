package org.dsa.core.prepare

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Created by xubo on 2016/11/29.
  * find sequnce from ref database
  */
object FindLocal2 {
  var intervalValue = 0

  def main(args: Array[String]) {

    var time = 0
    if (args == null || args.length < 2) {
      throw new Exception("input should include: file and output")
    } else if (args.length < 3) {
      time = 100
    } else {
      time = args(2).toInt
    }
    intervalValue = 2000
    val arr = (0 to 42965 by intervalValue).toArray

    findSaveByLength(args(0), args(1), arr, time)

  }

  //  C:\all\idea\DSA\file\input\D1Line.fasta
  def printArr(arr: Array[String]): Unit = {
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
  }

  var arrMin = new Array[Int](1)
  var arrSeqName = new Array[String](1)
  var arrSeqString = new Array[String](1)

  def findSaveByLength(file: String, output: String, arr: Array[Int], time: Int): Unit = {

    val arrLength = arr.length

    var flag = new Array[Boolean](arrLength)

    arrMin = new Array[Int](arrLength)
    arrSeqName = new Array[String](arrLength)
    arrSeqString = new Array[String](arrLength)

    for (i <- 0 until arrMin.length) {
      arrMin(i) = Int.MaxValue
    }

    val sources = Source.fromFile(file)
    val iter = sources.getLines()
    var flagFile = true
    var min = Integer.MAX_VALUE
    var minStr = ""
    while (iter.hasNext) {
      val str = iter.next()
      val arr = str.split(",")

      var index = (arr(1).length + intervalValue / 2) / intervalValue


      if (flag(index) == false) {
        if (arr(1).length % intervalValue == 0) {
          flag(index) == true
          arrSeqName(index) = arr(0)
          arrSeqString(index) = arr(1)
          arrMin(index) = 0
        } else if (math.abs(arr(1).length - index * intervalValue) < arrMin(index)) {
          arrMin(index) = math.abs(arr(1).length - index * intervalValue)
          arrSeqName(index) = arr(0)
          arrSeqString(index) = arr(1)
        }
      }
    }
    sources.close()

    val fileOut = new File(output)
    if (!fileOut.exists()) {
      fileOut.mkdirs()
    }

    for (i <- 0 until flag.length) {
      if (arrSeqName(i) != null) {
        var outLength = arrSeqString(i).length + 1000000
        var refOutPath = output + "/RL" + outLength.toString + arrSeqName(i) + ".file"
        var queryOutPath = output + "/QL" + outLength.toString + arrSeqName(i) + ".file"
        val outRef = new PrintWriter(refOutPath)

        for (j <- 0 until time) {
          outRef.println(arrSeqName(i) + "," + arrSeqString(i))
        }
        outRef.close()

        val outQuery = new PrintWriter(queryOutPath)
        outQuery.println(arrSeqName(i) + "," + arrSeqString(i))
        outQuery.close()
      }
    }

  }

}

