package org.dsa.core

import org.dsa.utils.{AdamFunSuite, DSAFunSuite}
import org.bdgenomics.adam.rdd.ADAMContext._

/**
  * Created by xubo on 2016/12/16.
  */
class DSWAdamSuite extends AdamFunSuite {

  test("read fastq") {
    val input = "file/input/fastq/fix1.fastq"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect()(0))
  }

  test("read fastq count") {
    val input = "file/input/fastq/fix1.fastq"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
  }

  test("read portain to Adam:T1") {
    val input = "file\\input\\T1.fasta"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
  }

  test("read portain to Adam:T2 fastq") {
    val input = "file/input/fastq/T2.fastq"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
  }

  test("read portain to Adam:T2 fastq and save adam") {
    val input = "file/input/fastq/T2.fastq"

    val rdd = sc.loadAlignments(input)
    val output = "file/input/fastq/T2.adam"
    rdd.adamParquetSave(output)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
  }

  test("read portain to Adam:T2  adam") {

    val input = "file/input/fastq/T2.adam"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
  }

  test("read portain to Adam:T2 fasta") {
    //    val input = "file/input/fasta/T2.fasta"
    val input = "file/input/fasta/T2.fasta"
    val output = "file/input/fasta/T2.adam"
    val rdd = sc.loadAlignments(input)
    rdd.adamParquetSave(output)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
  }

  test("read portain to Adam:T2 adam") {
    //    val input = "file/input/fasta/T2.fasta"
    val input = "file/input/fasta/T2.adam"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.foreach(println)
    println(rdd.collect().length)
    rdd.map{each=>
      (each.getContig.getContigName,each.getSequence)
    }.foreach(println)
  }
  test("read portain to Adam:D1") {
    val input = "file\\input\\D1.fasta"
    val rdd = sc.loadAlignments(input)
    //    println(rdd)
    rdd.take(10).foreach(println)
    println(rdd.collect().length)
  }
}
