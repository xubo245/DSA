package org.dsa.test

/**
  * Created by xubo on 2016/12/4.
  */
object StringBuilderTest {
  def main(args: Array[String]) {
    var str=new StringBuilder
    println(str)
    str.append("hello")
    println(str)
    str.append(",world")
    println(str)
    str.clear()
    println(str)
    println("end")
  }
}
