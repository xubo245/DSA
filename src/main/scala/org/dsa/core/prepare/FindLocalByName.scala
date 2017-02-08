package org.dsa.core.prepare

/**
  * Created by xubo on 2017/1/1.
  */
object FindLocalByName {
  def main(args: Array[String]) {
    val result = FindLocal.findSequnceByName(args(0), args(1))
    println("result")
    println(result)
  }
}
