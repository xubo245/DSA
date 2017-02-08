package org.dsa.core.etl

import java.io.PrintWriter

import scala.io.Source

/**
  * Created by xubo on 2017/1/9.
  */
object ToFasta {
  def main(args: Array[String]) {
    uniref2Line(args(0), args(1))
  }

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
        out.print(">" + line.split(" ")(0).split(">")(1))
        //        out.print(",")
        out.println()
      } else {
        out.print(line)
      }
      line = read.readLine()
    }
    out.close()
    in.close()
  }
}
