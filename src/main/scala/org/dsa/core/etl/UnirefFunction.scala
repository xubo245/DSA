package org.dsa.core.etl

import java.io.PrintWriter
import scala.collection.mutable.{ArrayBuffer, _}
import scala.io.Source

/**
  * Created by xubo on 2016/10/27.
  * 使用scala对uniref数据进行转换等操作
  */

class UnirefFunction {

  /**
    * 将uniref fasta文件地址转换（refName,sequnce）并返回
    *
    * @param fasta fasta文件地址
    * @return 转换后的Array数组
    */
  def uniref2Line(fasta: String): Array[String] = {
    var in = Source.fromFile(fasta)
    var outStr = new ArrayBuffer[String]()
    val read = in.bufferedReader()
    var line = read.readLine()
    var startFlag = true
    var str = new StringBuilder()
    while (line != null) {
      if (line.startsWith(">")) {
        if (startFlag == true) {
          startFlag = false
        } else {
          outStr.append(str.toString())
          str = new StringBuilder()
        }
        str.append(line.split(" ")(0).split(">")(1)).append(",")
      } else {
        str.append(line)
      }
      line = read.readLine()
    }
    outStr.append(str.toString())
    in.close()
    outStr.toArray[String]
  }

  /**
    * 转换 fasta文件为（refName,sequnce），存储到output路径
    *
    * @param fasta
    * @param output
    */
  def uniref2Line(fasta: String, output: String): Unit = {
    val in = Source.fromFile(fasta)
    val out = new PrintWriter(output)

    val read = in.bufferedReader()
    var line = read.readLine()
    var startFlag = true
    while (line != null) {
      if (line.startsWith(">")) {
        if (startFlag == true) {
          startFlag = false
        } else {
          out.println()
        }
        out.print(line.split(" ")(0).split(">")(1))
        out.print(",")
      } else {
        out.print(line)
      }
      line = read.readLine()
    }
    out.close()
    in.close()
  }

  /**
    * 转换 fastq文件为（refName,sequnce），存储到output路径
    *
    * @param fastq
    * @param output
    */
  def fastq2Line(fastq: String, output: String): Unit = {
    val in = Source.fromFile(fastq)
    val out = new PrintWriter(output)

    val read = in.bufferedReader()
    var line = read.readLine()
    var startFlag = true
    while (line != null) {
      if (line.startsWith("@")) {
        if (startFlag == true) {
          startFlag = false
        } else {
          out.println()

        }
        out.print(line.split("\\s+")(0).split("@")(1))
        out.print(",")
      } else {
        out.print(line)
        line = read.readLine()
        line = read.readLine()
      }
      line = read.readLine()
    }
    out.close()
    in.close()
  }


}

object UnirefFunction {
  def main(args: Array[String]) {
    new UnirefFunction().uniref2Line(args(0), args(1))
  }

  def countSum(file: String): BigInt = {
    val input = Source.fromFile(file).getLines().toArray
    var sum: BigInt = 0
    for (i <- 0 until input.length) {
      val str = input(i).split(Array(',', '(', ')'))
      sum = sum + BigInt.apply(str(2).toInt * str(1).toInt)
      //      println(sum)
    }
    sum
  }

  def splitDatabase(input: String, output: String, n: Int, num: Int): Unit = {
    var N = BigInt(n).*(BigInt(math.pow(2, num - 1).toInt))
    val in = Source.fromFile(input)
    val read = in.bufferedReader
    var length = 0
    var outPath = output + "/DL" + num + "Line.fasta"
    var out = new PrintWriter(outPath)
    var line = read.readLine()
    var startFlag = true
    var sum = BigInt(0)
    while (line != null && sum.<(N)) {
      length = length + 1
      out.println(line)
      val strArr = line.split(",")
      sum = sum + BigInt(strArr(1).length)
      line = read.readLine()
    }
    println("input:\t" + input + "\toutPath\t:" + outPath + "\tn:\t" + n + "\tnum:\t" + num + "\tsum:\t" + sum + "\tlength:\t" + length)
    out.close()
    in.close()
  }
}
