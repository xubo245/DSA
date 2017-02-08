package org.dsa.core.adam

import org.dsa.mediator.parasail.ParasailScala
import org.dsa.rdd.AlignmentRecord
import parasail.Matrix

/**
  * Created by xubo on 2016/12/16.
  */
class AdamDSG extends Adam {
  override def sa(query: String, ref: String): AlignmentRecord = {
    ParasailScala.alignSG(query, ref, 12, 2, Matrix.blosum50)
  }
}
