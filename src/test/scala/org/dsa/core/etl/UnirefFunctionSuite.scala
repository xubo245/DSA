package org.dsa.core.etl

import org.dsa.utils.DSAFunSuite

/**
  * Created by xubo on 2016/11/24.
  */
class UnirefFunctionSuite extends DSAFunSuite {

  test("UnirefFunction fastq2Line") {
    val input = "file/input/fastq/fix1.fastq"
    val output = "file/input/fastq/fix1Line.fastq"
    val agrs = Array(input, output)
    val unirefFunction = new UnirefFunction()
    unirefFunction.fastq2Line(input, output)

  }

  test("UnirefFunction fastq2Line g38L100c50Nhs20.fastq") {
    val input = "file/input/fastq/g38L100c50Nhs20.fastq"
    val output = "file/input/fastq/g38L100c50Nhs20Line.fastq"
    val agrs = Array(input, output)
    val unirefFunction = new UnirefFunction()
    unirefFunction.fastq2Line(input, output)

  }

  test("UnirefFunction") {
    val input = "file/input/T1.fasta"
    val output = "file/input/T1Linetime2.fasta"
    val agrs = Array(input, output)
    UnirefFunction.main(agrs)
  }

  test("uniref2Line(fasta: String)") {
    val input = "file/input/T1.fasta"
    val unirefFunction = new UnirefFunction()
    val result = unirefFunction.uniref2Line(input)
    assert(result.length == 3)

    val arr = Array("UniRef100_Q6GZX4,MAFSAEDVLKEYDRRRRMEALLLSLYYPNDRKLLDYKEWSPPRVQVECPKAPVEWNNPPSEKGLIVGHFSGIKYKGEKAQASEVDVNKMCCWVSKFKDAMRRYQGIQTCKIPGKVLSDLDAKIKAYNLTVEGVEGFVRYSRVTKQHVAAFLKELRHSKQYENVNLIHYILTDKRVDIQHLEKDLVKDFKALVESAHRMRQGHMINVKYILYQLLKKHGHGPDGPDILTVKTGSKGVLYDDSFRKIYTDLGWKFTPL",
      "UniRef100_Q6GZX3,MSIIGATRLQNDKSDTYSAGPCYAGGCSAFTPRGTCGKDWDLGEQTCASGFCTSQPLCARIKKTQVCGLRYSSKGKDPLVSAEWDSRGAPYVRCTYDADLIDTQAQVDQFVSMFGESPSLAERYCMRGVKNTAGELVSRVSSDADPAGGWCRKWYSAHRGPDQDAALGSFCIKNPGAADCKCINRASDPVYQKVKTLHAYPDQCWYVPCAADVGELKMGTQRDTPTNCPTQVCQIVFNMLDDGSVTMDDVKNTINCDFSKYVPPPPPPKPTPPTPPTPPTPPTPPTPPTPPTPRPVHNRKVMFFVAGAVLVAILISTVRW",
      "UniRef100_Q197F8,MASNTVSAQGGSNRPVRDFSNIQDVAQFLLFDPIWNEQPGSIVPWKMNREQALAERYPELQTSEPSEDYSGPVESLELLPLEIKLDIMQYLSWEQISWCKHPWLWTRWYKDNVVRVSAITFEDFQREYAFPEKIQEIHFTDTRAEEIKAILETTPNVTRLVIRRIDDMNYNTHGDLGLDDLEFLTHLMVEDACGFTDFWAPSLTHLTIKNLDMHPRWFGPVMDGIKSMQSTLKYLYIFETYGVNKPFVQWCTDNIETFYCTNSYRYENVPRPIYVWVLFQEDEWHGYRVEDNKFHRRYMYSTILHKRDTDWVENNPLKTPAQVEMYKFLLRISQLNRDGTGYESDSDPENEHFDDESFSSGEEDSSDEDDPTWAPDSDDSDWETETEEEPSVAARILEKGKLTITNLMKSLGFKPKPKKIQSIDRYFCSLDSNYNSEDEDFEYDSDSEDDDSDSEDDC"
    )
    for (i <- 0 until result.length) {
      assert(result(i).equals(arr(i)))
    }
  }

  test("Count sum") {
    val result = UnirefFunction.countSum("file\\project\\dataDistribution\\input\\uniref100LineLengthCount\\20161124115928895\\part-00000")
    println(result)
    assert(result.equals(BigInt("32408238903")))
  }

  test("Count sum,D1") {
    val result = UnirefFunction.countSum("file\\project\\dataDistribution\\input\\D1LineLengthCount\\20161118234228413\\part-00000")
    println(result)
    assert(result.equals(BigInt("32440643")))
  }
  test("test log") {
    var sum = BigInt("32408238903")
    println(math.log10(100))

    for (i <- 0 until 10) {
      println(sum)
      sum = sum./(BigInt(2))

    }
    assert(sum.equals(BigInt("63297341")./(BigInt(2))))

    println()
    var big = BigInt("30960000")
    for (i <- 0 until 11) {
      println(big)
      big = big.*(BigInt(2))

    }

    println()
    big = BigInt("32000000")
    for (i <- 0 until 11) {
      println(big)
      big = big.*(BigInt(2))

    }
  }

  test("splitDatabase") {
    val input = "file\\input\\D1Line.fasta"
    var output = "file\\output\\split"
    UnirefFunction.splitDatabase(input, output, 320000, 1)

  }

}
