package org.dsa.test

import com.google.common.collect.{Ordering => GuavaOrdering}

import scala.collection.JavaConversions._


/**
  * Created by xubo on 2016/12/10.
  */
object takeOrderedTest {
  def main(args: Array[String]) {
    var arr = Array(new Person(11, "a"), new Person(21, "v"), new Person(5, "c")).toIterator
    var result = takeOrdered[Person](arr, 2)(AgeOreder)
    result.foreach(println)
  }

  def takeOrdered[T](input: Iterator[T], num: Int)(implicit ord: Ordering[T]): Iterator[T] = {
    val ordering = new GuavaOrdering[T] {
      override def compare(l: T, r: T): Int = ord.compare(l, r)
    }
    collectionAsScalaIterable(ordering.leastOf(asJavaIterator(input), num)).iterator
  }


}

class Person {
  var age = 0;
  var name = ""

  def this(age: Int, name: String) {
    this()
    this.age = age
    this.name = name
  }


  override def toString = s"Person($age, $name)"
}

object AgeOreder extends Ordering[Person]{
  def compare(a: Person, b: Person): Int =
    implicitly[Ordering[Int]].compare(a.age, b.age)
}
