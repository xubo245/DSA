package org.dsa.core

import org.apache.spark.SparkContext
import org.dsa.rdd.{AlignmentRecordTopK, AlignmentRecord}

/**
  * Created by xubo on 2016/11/28.
  */
trait AligmentTrait {

  def run(queryFile: String, refFile: String, scoreMatrixFile: String, splitNum: Int, taskNum: Int, topK: Int, sc: SparkContext): Array[AlignmentRecordTopK]

}


