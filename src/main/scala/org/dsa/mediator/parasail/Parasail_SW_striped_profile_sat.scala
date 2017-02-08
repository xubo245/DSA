package org.dsa.mediator.parasail

import parasail.{RunParasail, Matrix}

/**
  * Created by xubo on 2016/12/22.
  */
class Parasail_SW_striped_profile_sat extends ParasailFather {


}

object Parasail_SW_striped_profile_sat {
  def main(args: Array[String]) {
    if (null == args) {
      throw new Exception(s"input null")
    }

    if (2 != args.length) {
      throw new Exception(s"input should:queryFile,refFile")
    }

    val query = args(0)
    val ref = args(1)
    val parasail_SW_striped_profile_sat = new Parasail_SW_striped_profile_sat()

    parasail_SW_striped_profile_sat.compute(query, ref,12,2,Matrix.blosum50)
  }
}
