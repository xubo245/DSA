package org.dsa.core.etl

import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date

import scala.io.Source

/**
  * Created by xubo on 2016/11/24.
  * 划分数据
  */
class Split {

  /**
    * 将ref进行划分，默认按长度划分为[0,100),[100.200),...不同区间的数据集
    *
    * @param input  ref file
    * @param output 输出路径，需要存在
    */
  def splitRef(input: String, output: String): Unit = {
    val in = Source.fromFile(input)
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    var out = new Array[PrintWriter](20)
    for (i <- 0 until out.length) {
      out(i) = new PrintWriter(output + "/uniref100L" + 100 * (i + 1))
      //      + "/split" + iString
    }
    val read = in.bufferedReader()
    var line = read.readLine()
    var startFlag = true
    while (line != null) {
      val strArr = line.split(",")
      if (strArr(1).length / 100 <= 19) {
        out(strArr(1).length / 100).println(line)
      }
      line = read.readLine()
    }

    for (i <- 0 until out.length) {
      out(i).close()
    }
    in.close()
  }

}

object Split {
  def main(args: Array[String]) {
    new Split().splitRef(args(0), args(1))
  }
}
