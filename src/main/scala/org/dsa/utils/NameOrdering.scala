package org.dsa.utils

import org.dsa.rdd.AlignmentRecord

/**
  * Created by xubo on 2016/12/28.
  */
object NameOrdering extends Ordering[AlignmentRecord] {
  def compare(a: AlignmentRecord, b: AlignmentRecord): Int =
    implicitly[Ordering[Int]].compare(a.score1, b.score1)
}
