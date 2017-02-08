package org.dsa.mediator.parasail

import parasail._

import scala.io.Source

/**
  * Created by xubo on 2016/12/22.
  */
class ParasailFather {
  def compute(query: String, ref: String, open: Int, gap: Int, matrix: Matrix = Matrix.blosum50): Unit = {
    print("query:\t" + query)
    print("\tref:\t" + ref)
    val start = System.currentTimeMillis()

    var topScore = 0
    var topName = ""
    val sources = Source.fromFile(query)
    val querys = sources.getLines().toArray.map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }

    val refs = Source.fromFile(ref).getLines().toArray.map { each =>
      val str = each.split(",")
      (str(0), str(1))
    }

    var queryLength = 0
    var refLength = 0


    //    val profile = Profile.create_8(query, matrix);
    querys.map { query =>
      //      val profile =  val profile = createProfile(query._2, matrix)
      val profile = RunParasail.createProfile(query._2, "blosum50")
      refs.map { ref =>
        if (refLength == 0) {
          refLength = ref._2.length
          queryLength = query._2.length
        }

        val result = run(profile, ref._2, open, gap)

        if (result.getScore > topScore) {
          topScore = result.getScore
          topName = ref._1
        }

      }
    }
    val stop = System.currentTimeMillis()

    print("\tqueryLength:\t" + queryLength)
    print("\trefLength:\t" + refLength)

    print("\ttopScore:" + topScore)
    print("\ttopName:" + topName)
    //    print("\tSuccess")

    print("\ttime:\t" + (stop - start) + "\tms\n")
  }

  def createProfile(query: String, matrix: Matrix): Profile = {
    new Profile(JNIparasail.profile_create_sat(query, Matrix.getCPtr(matrix)), true)
  }

  def run(profile: Profile, ref: String, open: Int, gap: Int): Result = {
    RunParasail.runSW_striped_profile_sat(profile, ref, open, gap)
  }
}


