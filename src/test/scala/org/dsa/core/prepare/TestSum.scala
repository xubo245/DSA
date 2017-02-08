package org.dsa.core.prepare

/**
  * Created by xubo on 2016/12/31.
  */
object TestSum {
  def main(args: Array[String]) {
    val arr = Array(
      (10275, 1),
      (10258, 1),
      (10252, 1),
      (10247, 1),
      (10244, 1),
      (10240, 1),
      (10231, 2),
      (10229, 1),
      (10215, 1),
      (10210, 1))

    var sum=0
    var n=0.0
    for(i<-0 until(arr.length)){
      n=n+1
      sum=sum+arr(i)._1

      println(arr(i)._1-10240)
    }

    println(sum/arr.length.toDouble)
    println(sum/n)
    println(arr.length)
  }
}
