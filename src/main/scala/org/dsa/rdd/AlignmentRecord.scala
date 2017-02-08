package org.dsa.rdd

import parasail.Result
import ssw.Alignment

/**
  * Created by xubo on 2016/11/28.
  */
class AlignmentRecord extends Serializable {

  var refName: String = ""
  var refSequence:String=""
  var cigar: String = ""

  var score1: Int = 0

  var score2: Int = 0

  /**
    * 0-based best alignment beginning position on reference;	ref_begin1 = -1 when the best alignment beginning position is not available
    */
  var ref_begin1: Int = 0

  /**
    * 0-based best alignment ending position on reference
    */
  var ref_end1: Int = 0

  /**
    * 0-based best alignment beginning position on read; read_begin1 = -1 when the best alignment beginning
    * position is not available
    */
  var read_begin1: Int = 0

  /**
    * 0-based best alignment ending position on read
    */
  var read_end1: Int = 0

  /**
    * 0-based sub-optimal alignment ending position on read
    */
  var ref_end2: Int = 0

  def this(alignment: Alignment) = {
    this()
    this.cigar = alignment.cigar

    this.score1 = alignment.score1;

    this.score2 = alignment.score2

    /**
      * 0-based best alignment beginning position on reference;	ref_begin1 = -1 when the best alignment beginning position is not available
      */
    this.ref_begin1 = alignment.read_begin1;

    /**
      * 0-based best alignment ending position on reference
      */
    this.ref_end1 = alignment.ref_end1;

    /**
      * 0-based best alignment beginning position on read; read_begin1 = -1 when the best alignment beginning
      * position is not available
      */
    this.read_begin1 = alignment.read_begin1;

    /**
      * 0-based best alignment ending position on read
      */
    this.read_end1 = alignment.read_end1;

    /**
      * 0-based sub-optimal alignment ending position on read
      */
    this.ref_end2 = alignment.ref_end2
  }

  def this(result: Result) = {
    this()
    this.score1=result.getScore
  }


//  override def toString = s"AlignmentRecord($refName, $cigar, $score1, $score2, $ref_begin1, $ref_end1, $read_begin1, $read_end1, $ref_end2)"
override def toString = s"AlignmentRecord(refName=$refName, refSequence.take(100)=${refSequence.take(100)}, cigar=$cigar, score1=$score1, score2=$score2, ref_begin1=$ref_begin1, ref_end1=$ref_end1, read_begin1=$read_begin1, read_end1=$read_end1, ref_end2=$ref_end2)"
}
