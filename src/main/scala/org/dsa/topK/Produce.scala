package org.dsa.topK

import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date

import org.apache.commons.lang.RandomStringUtils

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/**
  * Created by xubo on 2016/11/3.
  */
object Produce {
  def main(args: Array[String]) {

    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())

    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      val out = "file/test/TopK/output/random" + iString
      produceN(10000, Math.pow(10, 7).toInt,out)

    } else {
      //    val out = "/xubo/project/TopK/output/topk" + iString
      val out = args(0) + iString
      produceN(args(0).toInt, args(1).toInt,args(2)+"_big"+args(0)+"_num"+args(1)+"_time"+iString)
    }

  }

  /**
    *
    * @param big 产生数据大小的区间 [0，big)
    * @param num 产生数据的数量
    * @return num个数
    */
  def produceN(big: Int, num: Int, out: String):Unit= {
    println("big"+big+"_num"+num)
    var arr = ArrayBuffer[(Int, String)]()
    val file = new PrintWriter(out)

    for (i <- 0 until num) {
      val random = new Random()
      val randomStringUtils = new RandomStringUtils
      RandomStringUtils.random(5, Array('a', 'b', 'c', 'd', 'e', 'f', '1', '2', '3'))
      file.println(random.nextInt(big), (produceRandomString(10) + "_" + i.toString))
    }
    file.close()
  }


  /**
    * 产生'a'.to('z')这26个字母的length随机长度的String
    *
    * @param length Random String的长度
    * @return 随机生成的String
    */
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
}
