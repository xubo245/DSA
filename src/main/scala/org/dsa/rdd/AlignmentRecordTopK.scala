package org.dsa.rdd

/**
  * Created by xubo on 2016/11/28.
  */
class AlignmentRecordTopK {
  private var queryName: String = null
  //  private var query: String = null
  private var topK: Int = 0
  private var alignmentRcoreds: Array[AlignmentRecord] = new Array[AlignmentRecord](1)


  //  def setQuery(query: String) = {
  //    this.query = query
  //  }
  //
  //  def getQuery(): String = {
  //    this.query
  //  }

  def setQueryName(queryName: String) = {
    this.queryName = queryName
  }

  def getQueryName(): String = {
    this.queryName
  }

  def setTopK(topK: Int) = {
    this.topK = topK
  }

  def getTopK(): Int = {
    this.topK
  }

  def setAlignmentRcoreds(alignmentRcoreds: Array[AlignmentRecord]) = {
    this.alignmentRcoreds = alignmentRcoreds
  }

  def getAlignmentRcoreds(): Array[AlignmentRecord] = {
    this.alignmentRcoreds
  }


  override def toString = s"AlignmentRecordTopK($queryName, $topK, $alignmentRcoreds)"
}
