package org.apache.spark

import scala.math.Ordering
import org.apache.spark.util.BoundedPriorityQueue
import com.google.common.collect.{Ordering => GuavaOrdering}
import scala.collection.JavaConversions._
import scala.reflect.ClassTag

/**
  * Created by xubo on 2016/11/3.
  */
object IteratorLearning {
  //  val ordering = new GuavaOrdering[T] {
  //    override def compare(l: T, r: T): Int = ord.compare(l, r)
  //  }

  def main(args: Array[String]) {
    var arr = Array(11, 2, 5, 4, 3, 8, 7, 9)
    val it = arr.toIterator
    val topK = 4
    val out = util.collection.Utils.takeOrdered(it, topK)
    val queue = new BoundedPriorityQueue[Int](topK)
    println("first:")
    queue.foreach(println)
    queue ++= out
    println("second:")
    println(queue)
    queue.foreach(println)
    //    ordering.leastOf(asJavaIterator(it), 2)
    out.foreach(println)
    testAddAdd(topK)
  }

  def take1(): Unit = {
    val topK = 2
    var arr1 = Array(11, 2, 5, 4, 3, 8, 7, 9)
    var arr2 = Array(111, 112, 115, 114, 113, 118, 117, 119)
    //    val out1=takeOrdered[Int](arr1.toIterator, topK)
  }

  def takeOrdered[T](input: Iterator[T], num: Int)(implicit ord: Ordering[T]): Iterator[T] = {
    val ordering = new GuavaOrdering[T] {
      override def compare(l: T, r: T): Int = ord.compare(l, r)
    }
    collectionAsScalaIterable(ordering.leastOf(asJavaIterator(input), num)).iterator
  }

  def testAddAdd(topK: Int)(implicit ord: Ordering[Int]): Unit = {

    var arr1 = Array(11, 2, 5, 4, 3, 8, 7, 9)
    var arr2 = Array(111, 112, 115, 114, 113, 118, 117, 119)
    val queue1 = new BoundedPriorityQueue[Int](topK)(ord)
    val queue2 = new BoundedPriorityQueue[Int](topK)(ord)
    val out1 = util.collection.Utils.takeOrdered(arr1.toIterator, topK)(ord.reverse)
    val out2 = util.collection.Utils.takeOrdered(arr2.toIterator, topK)(ord.reverse)

    queue1 ++= out1
    queue2 ++= out2
    println("before:queue1 " + queue1)
    out1.foreach(println)
    //    arr1.foreach(println)
    println("before:queue2 " + queue2)
    queue1 ++= queue2
    println("after:" + queue1)
    queue1.toArray.reverse.foreach(println)
  }
}
