package org.dsa.test

import org.apache.commons.lang.RandomStringUtils

import scala.util.Random

/**
  * Created by xubo on 2016/10/31.
  */
object Test1 {
  def main(args: Array[String]) {

    println(1.compareTo(2))
    println(produceRandomString(10))

  }

  def produceRandomString(length: Int): String = {
    var array: Array[Char] = new Array[Char](26)
    var arr = Array('a'.to('z').toArray)
    arr.foreach { each =>
      if (each != null && each.length > 25) {
        for (i <- 0 until each.length) {
          array(i) = each(i)
        }
      }
    }
    val random = RandomStringUtils.random(length, array)
    random
  }

  def produceRandom(): Unit = {
    val random = new Random()
    println(random.nextString(2))
    println(random.nextString(5))
    println(random.nextPrintableChar())
  }

  def getOsName(): Unit = {
    val pro = System.getProperties
    println(pro.getProperty(("os.name")))
    println(pro.getProperty("os.name").contains("Windows"))
    println(System.getProperties.getProperty("os.name").contains("Windows"))
  }

  def maxValue(): Unit = {
    var sum: Long = 1
    for (i <- 1 to 18) {
      sum = sum * 10
      println(sum)
    }
  }

  def getMaxScore(topK: Int): Unit = {
    var arrMaxScore = new Array[Int](topK)
    var arrStr = new Array[String](topK)
    arrMaxScore.foreach(println)
    arrStr.foreach(println)
    for (i <- 0 until topK) {
      println(i)
    }
    println()
    for (i <- 0 until topK reverse) {
      println(i)
    }
  }
}
