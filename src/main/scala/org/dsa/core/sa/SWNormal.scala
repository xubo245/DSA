package org.dsa.core.sa

import org.dsa.mediator.smithwaterman.SmithWatermanAffine
import org.dsa.rdd.AlignmentRecord

/**
  * Created by xubo on 2016/12/31.
  */
object SWNormal {

  def SSWLocal(query: String, ref: String, scoreMatrix: String, open: Int, gap: Int): AlignmentRecord = {
    val sw = new SmithWatermanAffine(query, ref, scoreMatrix, open, gap)
    val alignmentRecord = new AlignmentRecord()
    alignmentRecord.score1 = sw.maxScore.toInt
    alignmentRecord.cigar = sw.cigarX.toString
    alignmentRecord.read_begin1 = sw.xStart
    alignmentRecord.ref_begin1 = sw.yStart
    alignmentRecord
  }
}
