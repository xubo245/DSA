package org.dsa.core.adam

import org.dsa.mediator.ssw.SSWScala
import org.dsa.rdd.AlignmentRecord

/**
  * Created by xubo on 2016/12/16.
  */
class AdamDSW extends Adam {
  override def sa(query: String, ref: String): AlignmentRecord = {
    SSWScala.align(query, ref)
  }
}
