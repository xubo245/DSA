package org.dsa.mediator.ssw

import com.google.common.collect.{Ordering => GuavaOrdering}
import org.dsa.rdd.AlignmentRecord
import org.dsa.utils.NameOrdering

import scala.collection.JavaConversions._
import scala.io.Source

/**
  * Created by xubo on 2016/11/30.
  */
object SSWRunTopK {
  def main(args: Array[String]) {
    if (null == args) {
      throw new Exception(s"input null")
    }

    if (3 != args.length) {
      throw new Exception(s"input should:queryFile,refFile,topK")
    }

    print("query:\t" + args(0))
    print("\tref:\t" + args(1))
    val start = System.currentTimeMillis()

    var topScore = 0
    var topName = ""
    val topK = args(2).toInt
    val sources = Source.fromFile(args(0))
    val querys = sources.getLines().toArray.map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }

    val refs = Source.fromFile(args(1)).getLines().toArray.map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }

    var queryLength = 0
    var refLength = 0
    val querysResult = querys.map { query =>
      val queryResult = refs.map { ref =>
        if (refLength == 0) {
          refLength = ref._2.length
          queryLength = query._2.length
        }
        //        println("query\t" + query._2 + "\nref:\t" + ref._2)
        val result = SSWScala.align(query._2, ref._2)
        //        if (result.score1 > topScore) {
        //          topScore = result.score1
        //          topName = ref._1
        //        }
        result.refName = ref._1
        result
      }
      val out = takeOrdered[AlignmentRecord](queryResult.toIterator, topK)(NameOrdering)
      out
    }

    //    print("\tSuccess")

    val stop = System.currentTimeMillis()

    print("\tqueryLength:\t" + queryLength)
    print("\trefLength:\t" + refLength)
    print("\ttopScore:" + topScore)
    print("\ttopName:" + topName)
    print("\ttime:\t" + (stop - start) + "\tms\n")

    for (i <- 0 until querysResult.length) {
      println()
      querysResult(i).foreach(println)
    }
  }

  def takeOrdered[T](input: Iterator[T], num: Int)(implicit ord: Ordering[T]): Iterator[T] = {
    val ordering = new GuavaOrdering[T] {
      override def compare(l: T, r: T): Int = ord.reverse.compare(l, r)
    }
    collectionAsScalaIterable(ordering.leastOf(asJavaIterator(input), num)).iterator
  }
}


