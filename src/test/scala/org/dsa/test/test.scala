package org.dsa.test

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/10/27.
  */
object test {
  def main(args: Array[String]) {
    // set application name
    val conf = new SparkConf().setAppName("SparkSW Application").setMaster("local[4]")
    // initialize SparkContext
    val sc = new SparkContext(conf)
    val rdd=sc.textFile("file/input/D3")
    val rdd2=rdd.filter(each=>each!=null)
    val rdd3=rdd.map{each=>
      var str=each.split(",")
      if(str==null||str.length!=2){
        str.foreach(println)
        "*********"
      }else{
        str.length
      }
    }
    println(rdd.count())
    println(rdd2.count())
    println(rdd3.count())
    sc.stop()
  }
}
