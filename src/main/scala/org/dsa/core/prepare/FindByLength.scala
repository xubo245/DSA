package org.dsa.core.prepare

/**
  * Created by xubo on 2016/12/27.
  */
object FindByLength {
  def main(args: Array[String]) {
    val result=FindLocal.findSequnceByLength(args(0),args(1).toInt)
    println("result")
    println(result)

  }
}
