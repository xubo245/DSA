package org.dsa.utils

import java.text.SimpleDateFormat
import java.util.Date

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.bdgenomics.adam.rdd.ADAMContext

/**
  * Created by xubo on 2016/10/26.
  */
object Transform {

  def main(args: Array[String]): Unit = {
    assert(args.length == 2, "Must input fasta path and out path.")
    val start=System.currentTimeMillis()
    fasta2fileAndSaveNoAdam(args(0), args(1))
    val end=System.currentTimeMillis()
    println(args(0)+":"+(end-start)/1000.0+"s")
    //    var input = "file/input/T1.fasta"
    //    var output = "file/output/T1"

    //    var input = "file/input/D1.fasta"
    //    var output = "file/output/D1"

    //        var input = "file/input/T2.fasta"
    //        var output = "file/output/T2"

    //    fasta2fileAndSaveNoAdam(input, output)
    println("success")
  }

  def fasta2fileAndSaveNoAdam(fasta: String, out: String): Unit = {
    val conf = new SparkConf().setAppName("fasta2fileAndSaveNoAdam Application")
    val sc = new SparkContext(conf)
    val result = fasta2fileNoAdam(fasta, sc)
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    var outPath1 = out + "/string" + iString.toString
    var outPath2 = out + "/wordCount" + iString.toString
    result.saveAsTextFile(outPath1)
    wordCount(result, outPath2, sc)
    println("string count:" + result.count())
    sc.stop()
  }

  def wordCount(rdd: RDD[String], out: String, sc: SparkContext): Unit = {
    var rdd1 = rdd.map { each =>
      var str=each.split(",")
      if (each!=null && str.length>=2){
        (str(1).length, 1)
      }else{
        (0,1)
      }
    }.reduceByKey(_ + _).sortByKey(ascending = false, numPartitions = 1)
    rdd1.saveAsTextFile(out)
  }

  def fasta2fileAndSave(fasta: String, out: String): Unit = {
    val conf = new SparkConf().setAppName("fasta2file Application")
    val sc = new SparkContext(conf)
    val result = fasta2file(fasta, sc)
    val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
    var outPath = out + "/" + iString.toString
    result.saveAsTextFile(outPath)
    sc.stop()
  }

  def fasta2file(fasta: String, sc: SparkContext): RDD[String] = {
    val ac = new ADAMContext(sc)
    var rdd = ac.loadFasta(fasta, 100000)
    val result = rdd.map(each => (each.getContig.getContigName + "," + each.getFragmentSequence))
    result
  }

  /**
    *
    *  //无法解决最后一个序列的每段都是一样长度的
    *  无法解决两个block数据，因为会导致两个block衔接对不上
    * @param fasta
    * @param sc
    * @return
    */
  def fasta2fileNoAdam(fasta: String, sc: SparkContext): RDD[String] = {
    val rdd = sc.textFile(fasta, 1)
    var str: StringBuffer = new StringBuffer()
    var flag = false
    var has = false
    var length = 0
    val rdd2 = rdd.map { each =>
      var out: String = new String()
      if (each.startsWith(">")) {
        if (str != null && !str.equals("") && has == false) {
          out = str.toString
          has = true
        }
        str = new StringBuffer()
        var name = each.split(" ")(0).split(">")
        str.append(name(1)).append(",")
        length = 0
      } else {

        //无法解决最后一个序列的每段都是一样长度的
        str = str.append(each)
        if (length != 0 && each.length() != length) {
          out = str.toString
          has = true
        } else {
          has = false
        }
        length = each.length()
      }
      out
    }

    rdd2.filter(each => each != null && !each.equals(""))
  }


}
