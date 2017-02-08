package org.dsa.rdd

/**
  * Created by xubo on 2016/12/1.
  */
class AlignmentRecordSimple {
  var refName = ""
  var maxScore = 0

  def this(refName: String, maxScore: Int) {
    this()
    this.refName = refName
    this.maxScore = maxScore
  }
}
