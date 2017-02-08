package org.dsa.test

/**
  * Created by xubo on 2016/12/20.
  */
object StringTest {
  def main(args: Array[String]) {
    var outFile = new StringBuilder
    outFile.append("a").append("\t").append("d").append("\t").append("c").append("\t").append("\n")
      .append("1").append("\t").append("2").append("\t").append("3").append("\t")
    println(outFile)
    var strArr=outFile.split('\n')
    println(outFile.split('\n').length)
    println(strArr(0))

    println(outFile.toString().split('\n').length)

  }
}
