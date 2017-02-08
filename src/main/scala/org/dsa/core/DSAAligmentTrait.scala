package org.dsa.core

import org.apache.spark.SparkContext
import org.dsa.rdd.AlignmentRecordTopK

/**
  * Created by xubo on 2016/11/28.
  */
trait DSAAligmentTrait {

  def run(sc: SparkContext, queryFile: String, refFile: String, scoreMatrixFile: String, open: Int, gap: Int, splitNum: Int, taskNum: Int, topK: Int): Array[AlignmentRecordTopK]

}


