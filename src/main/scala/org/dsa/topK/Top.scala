package org.dsa.topK

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xubo on 2016/10/31.
  */

//class Top {
//
//}

object Top {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("topK Application").setMaster("local[4]")
    val sc = new SparkContext(conf)
    var arr = sc.parallelize(Array((31, "a"), (32, "b"), (33, "c"), (35, "d"), (35, "e"), (1, "a"), (35, "b"), (35, "c"), (35, "d"), (5, "e"), (6, "f"), (11, "a"), (12, "b"), (13, "c"), (14, "d"), (15, "e"), (16, "f")), 2)

    for (i <- arr.partitions) {
      println("index:"+i.index)
    }

    arr.top(3).foreach(println)


//    arr.max()
//    val result = topK(3, arr, sc)
//    println("result:")
//    result.foreach(println)
    sc.stop
  }

  def topK(topK: Int, rdd: RDD[(Int, String)], sc: SparkContext): Array[(Int, String)] = {

    if (topK == 0) {
      Array.empty
    } else {
      val accum = sc.accumulator(0, "My Accumulator")
      var arrStr = new Array[String](topK)
      var arrMaxScore = new Array[Int](topK)
      //      var arr=new Array[(Int,String)](topK)
      rdd.top(3)
      val size = rdd.count()
//      println("size:" + size)
      //      rdd.reduce{(a,b)=>
      //      a._1+b._1
      //      }
      //      rdd.foreach()
      //      rdd.reduceByKey()
      val rdd1 = rdd.foreach { each =>

        var flag = true
//        print("\neach=" + each + ":")
        for (i <- 0 until topK) {
//          print("\n\ti=" + i + ",flag=" + flag + ",each._1=" + each._1 + ",arrMaxScore(i)=" + arrMaxScore(i))
          if (flag == true && each._1 > arrMaxScore(i)) {
            for (j <- i + 1 until topK reverse) {
              arrMaxScore(j) = arrMaxScore(j - 1)
              arrStr(j) = arrStr(j - 1)
            }
            arrMaxScore(i) = each._1
            arrStr(i) = each._2
            flag = false
          }
        }
//        println()
//        for (i <- 0 until topK) {
//          println("\t\t" + arrMaxScore(i) + " " + arrStr(i))
//        }
        //println(accum.value)
        //        if(accum.value>=size-1){
        //          (accum.value,arrMaxScore,arrStr)
        //        }else{
        //          (null,null)
        //        }
        accum += 1
      }

      //      rdd1.foreach(println)
      val out = arrMaxScore.zip(arrStr)
      return out
    }
  }
}
