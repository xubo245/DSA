package org.dsa.core.etl

/**
  * Created by xubo on 2016/12/5.
  */
object SplitDatabase {
  def main(args: Array[String]) {
    for (i <- 1 to 10) {
      UnirefFunction.splitDatabase(args(0), args(1), args(2).toInt, i)
    }
  }
}
