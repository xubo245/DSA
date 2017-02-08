package org.dsa.core

import org.dsa.rdd.{AlignmentRecordSimple, AlignmentRecord}
import parasail.RunParasail
import ssw.SSW

/**
  * Created by xubo on 2016/12/1.
  */
class DSWScala {
  def align(query: String, ref: String, threshold: Int): Int = {
    if (query.length * ref.length < threshold) {
      RunParasail.run(query, ref)

    } else {
      val alignment = SSW.align(query, ref)
      alignment.score1
    }
    0
  }
}
