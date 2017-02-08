package org.dsa.analysis

/**
  * Created by xubo on 2016/11/20.
  */
object SparkSWM2M {
  def main(args: Array[String]) {
    val subMatrix = args(0)
    val queryFile = args(1)
    val dbFile = args(2)
    val splitNum = args(3).toInt
    val taskNum = args(4).toInt
    val topK = args(5).toInt
  }
}
