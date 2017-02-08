package org.dsa.utils

import java.io.PrintWriter

import scala.io.Source

/**
  * Created by xubo on 2016/10/28.
  */
object QueryFunction {
  def main(args: Array[String]) {
    val input = "file/input/unirefQuery/R0INU3.fasta"
    val output = "file/input/unirefQuery/R0INU3.file"
    query2Line(input, output)
    //    uniref2Line(args(0), args(1))
  }

  def query2Line(input: String, output: String): Unit = {
    val in = Source.fromFile(input)
    val out = new PrintWriter(output)

    val read = in.bufferedReader()
    var line = read.readLine()
    var startFlag = true
    while (line != null) {
      if (line.startsWith(">")) {
        //        if (startFlag == true) {
        //          startFlag = false
        //        } else {
        //          out.println()
        //        }
        //        out.print(line.split(" ")(0).split(">")(1))
        //        out.print(",")
      } else {
        out.print(line)
      }
      line = read.readLine()
    }
    out.close()
    in.close()
  }
}
