package org.dsa.api

import org.apache.spark.{SparkConf, SparkContext}
import org.dsa.core.adam.{AdamDSG, AdamDNW, AdamDSW}
import org.dsa.core.etl.UnirefFunction
import org.dsa.core.{DNW, DSG, DSW}
import org.dsa.rdd.AlignmentRecordTopK

/**
  * application programming interfaces(APIs) of DSA system
  *
  * Created by xubo on 2016/12/16.
  */
class DSA {

  /**
    * converte fasta to DSA format
    *
    * @param fastaFile fasta File
    * @param output    output path
    */
  def fasta2DSA(fastaFile: String, output: String): Unit = {
    new UnirefFunction().uniref2Line(fastaFile, output)
  }

  /**
    * converte fastq to DSA format
    *
    * @param fastqFile fastq File
    * @param output    output path
    */
  def fastq2DSA(fastqFile: String, output: String): Unit = {
    new UnirefFunction().fastq2Line(fastqFile, output)
  }


  /**
    * DSW:distributed Smith-Waterman (SW) algorithm
    *
    * @param queryFile       query file
    * @param refFile         reference file
    * @param sc              SparkContext
    * @param splitNum        split number
    * @param taskNum         task num
    * @param topK            top K
    * @param scoreMatrixFile score Matrix File
    * @param open            open score
    * @param gap             gap score
    * @return Array[AlignmentRecordTopK]
    */
  def dsw(queryFile: String, refFile: String, sc: SparkContext, splitNum: Int = 128, taskNum: Int = 1, topK: Int = 5, scoreMatrixFile: String = null, open: Int = 12, gap: Int = 2): Array[AlignmentRecordTopK] = {
    val dsw = new DSW
    val result = dsw.run(scoreMatrixFile, queryFile, refFile, splitNum, taskNum, topK, sc)
    result
  }

  /**
    *
    * dswAdam:distributed Smith-Waterman (SW) algorithm with Adam format
    *
    * @param queryAdamFile   query file
    * @param refAdamFile     reference file
    * @param sc              SparkContext
    * @param splitNum        split number
    * @param taskNum         task num
    * @param topK            top K
    * @param scoreMatrixFile score Matrix File
    * @param open            open score
    * @param gap             gap score
    * @return Array[AlignmentRecordTopK]
    */
  def dswAdam(queryAdamFile: String, refAdamFile: String, sc: SparkContext, splitNum: Int = 128, taskNum: Int = 1, topK: Int = 5, scoreMatrixFile: String = null, open: Int = 12, gap: Int = 2): Array[AlignmentRecordTopK] = {
    val dsw = new AdamDSW
    val result = dsw.run(scoreMatrixFile, queryAdamFile, refAdamFile, splitNum, taskNum, topK, sc)
    result
  }

  /**
    * DNW: distributed Needleman-Wunsch (NW) algorithm
    *
    * @param queryFile       query file
    * @param refFile         reference file
    * @param sc              SparkContext
    * @param splitNum        split number
    * @param taskNum         task num
    * @param topK            top K
    * @param scoreMatrixFile score Matrix File
    * @param open            open score
    * @param gap             gap score
    * @return Array[AlignmentRecordTopK]
    */
  def dnw(queryFile: String, refFile: String, sc: SparkContext, splitNum: Int = 128, taskNum: Int = 1, topK: Int = 5, scoreMatrixFile: String = null, open: Int = 12, gap: Int = 2): Array[AlignmentRecordTopK] = {
    val dnw = new DNW
    val result = dnw.run(scoreMatrixFile, queryFile, refFile, splitNum, taskNum, topK, sc)
    result
  }

  /**
    *
    * dnwAdam:distributed Needleman-Wunsch (NW) algorithm with Adam format
    *
    * @param queryAdamFile   query file
    * @param refAdamFile     reference file
    * @param sc              SparkContext
    * @param splitNum        split number
    * @param taskNum         task num
    * @param topK            top K
    * @param scoreMatrixFile score Matrix File
    * @param open            open score
    * @param gap             gap score
    * @return Array[AlignmentRecordTopK]
    */
  def dnwAdam(queryAdamFile: String, refAdamFile: String, sc: SparkContext, splitNum: Int = 128, taskNum: Int = 1, topK: Int = 5, scoreMatrixFile: String = null, open: Int = 12, gap: Int = 2): Array[AlignmentRecordTopK] = {
    val dnw = new AdamDNW
    val result = dnw.run(scoreMatrixFile, queryAdamFile, refAdamFile, splitNum, taskNum, topK, sc)
    result
  }

  /**
    * DSG:distributed Semi-global(SG) alignment algorithm
    *
    * @param queryFile       query file
    * @param refFile         reference file
    * @param sc              SparkContext
    * @param splitNum        split number
    * @param taskNum         task num
    * @param topK            top K
    * @param scoreMatrixFile score Matrix File
    * @param open            open score
    * @param gap             gap score
    * @return Array[AlignmentRecordTopK]
    */
  def dsg(queryFile: String, refFile: String, sc: SparkContext, splitNum: Int = 128, taskNum: Int = 1, topK: Int = 5, scoreMatrixFile: String = null, open: Int = 12, gap: Int = 2): Array[AlignmentRecordTopK] = {
    val dsg = new DSG
    val result = dsg.run(scoreMatrixFile, queryFile, refFile, splitNum, taskNum, topK, sc)
    result
  }

  /**
    *
    * dsgAdam:distributed Semi-global(SG) alignment algorithm with Adam format
    *
    * @param queryAdamFile   query file
    * @param refAdamFile     reference file
    * @param sc              SparkContext
    * @param splitNum        split number
    * @param taskNum         task num
    * @param topK            top K
    * @param scoreMatrixFile score Matrix File
    * @param open            open score
    * @param gap             gap score
    * @return Array[AlignmentRecordTopK]
    */
  def dsgAdam(queryAdamFile: String, refAdamFile: String, sc: SparkContext, splitNum: Int = 128, taskNum: Int = 1, topK: Int = 5, scoreMatrixFile: String = null, open: Int = 12, gap: Int = 2): Array[AlignmentRecordTopK] = {
    val dsg = new AdamDSG
    val result = dsg.run(scoreMatrixFile, queryAdamFile, refAdamFile, splitNum, taskNum, topK, sc)
    result
  }

}

object DSA {
  def main(args: Array[String]) {
    val dsa = new DSA()
    val conf = new SparkConf().setAppName("DSA").set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
    if (System.getProperties.getProperty("os.name").contains("Windows")) {
      conf.setMaster("local[16]")
    }

    val sc = new SparkContext(conf)
    val dsaType = args(0)
    val queryFile = args(1)
    val refFile = args(2)

    var result = new Array[AlignmentRecordTopK](0);
    if (dsaType.equals("dsw")) {
      result = dsa.dsw(queryFile, refFile, sc)
      printArray(result)
    } else if (dsaType.equals("dnw")) {
      result = dsa.dnw(queryFile, refFile, sc)
      printArray(result)
    } else if (dsaType.equals("dsg")) {
      result = dsa.dsg(queryFile, refFile, sc)
      printArray(result)
    } else if (dsaType.equals("dswAdam")) {
      result = dsa.dswAdam(queryFile, refFile, sc)
      printArray(result)
    } else if (dsaType.equals("dnwAdam")) {
      result = dsa.dnwAdam(queryFile, refFile, sc)
      printArray(result)
    } else if (dsaType.equals("dsgAdam")) {
      result = dsa.dsgAdam(queryFile, refFile, sc)
      printArray(result)
    } else {
      println("dsa type error")
    }
    sc.stop()
    println("end")
  }

  def printArray(result: Array[AlignmentRecordTopK]): Unit = {
    result.foreach { each =>
      println(each.getQueryName())
      println(each.getTopK())
      each.getAlignmentRcoreds().foreach(println)
    }
  }
}