package org.dsa.test

import breeze.linalg.DenseVector
import breeze.stats.mean

/**
  * Created by xubo on 2016/11/15.
  */
object testTo {
  def main(args: Array[String]) {
    val diff = "133,22,378,4,557,6,790,855,9,10,141,1122,143"
    val arr = scala.collection.mutable.ArrayBuffer[Double]()
    val converList = diff.split(",")
    for (listvalue <- converList) {
      arr += listvalue.toFloat
    }
    val tb1 = DenseVector.apply(arr.toArray)
    val Sd = breeze.stats.stddev(tb1).toString().toDouble
    val Mean = mean(tb1).toString().toDouble
    val arrlen = arr.length - 1
    val sum2 = (for (i <- 0 to arrlen) yield (math.pow((arr(i) - Mean), 3))).sum
    println(sum2)
    //c.reduce((x, y) => x+y)
    val rus = arr.reduce((x, y) => (x + (math.pow((y - Mean), 3)))) + math.pow(arr(0) - Mean, 3) - arr(0)
    println(rus)


  }
}
