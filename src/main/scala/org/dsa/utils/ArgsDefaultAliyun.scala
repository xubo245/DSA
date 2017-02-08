package org.dsa.utils

/**
  * Created by xubo on 2016/12/6.
  */
object ArgsDefaultAliyun {

  val queryDSW = Array(
    "/query/D0DP18691.file",
    "/query/D1DP83140.file",
    "/query/D2DP20738.file",
    "/query/D3DO55746.file",
    "/query/D4DQ6GZW8.file",
    "/query/D5DQ6GZX4.file",
    "/query/D6DQ19LI2.file",
    "/query/D7DQ7TQI7.file",
    "/query/D8DQ8IYD8.file",
    "/query/D9DR0INU3.file")

  val queryDSWLonger = Array(
    "/query/D0DP18691.file",
    "/query/D1DP83140.file",
    "/query/D2DP20738.file",
    "/query/D3DO55746.file",
    "/query/D4DQ6GZW8.file",
    "/query/D5DQ6GZX4.file",
    "/query/D6DQ19LI2.file",
    "/query/D7DQ7TQI7.file",
    "/query/D8DQ8IYD8.file",
    "/query/D9DR0INU3.file",
    "/query/D10DUPI000814841E.file",
    "/query/D11DUPI0007E66D86.file",
    "/query/D12DUPI0006B75FB4.file")

  val queryHDFS = Array(
    "/query/0P18691.file",
    "/query/1P83140.file",
    "/query/2P20738.file",
    "/query/3O55746.file",
    "/query/4Q6GZW8.file",
    "/query/5Q6GZX4.file",
    "/query/6Q19LI2.file",
    "/query/7Q7TQI7.file",
    "/query/8Q8IYD8.file",
    "/query/9R0INU3.file")

  val queryMaster = Array(
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/0P18691.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/1P83140.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/2P20738.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/3O55746.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/4Q6GZW8.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/5Q6GZX4.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/7Q7TQI7.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/8Q8IYD8.file",
    "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/9R0INU3.file")


  val refSparkSW = Array(
    "/D1Line.fasta",
    "/D2Line.fasta",
    "/D3Line.fasta",
    "/D4Line.fasta",
    "/D5Line.fasta",
    "/D6Line.fasta",
    "/D7Line.fasta",
    "/D8Line.fasta",
    "/D9Line.fasta",
    "/D10Line.fasta")

  val refByLength = Array(
    "/Luniref/DL1Line.fasta",
    "/Luniref/DL2Line.fasta",
    "/Luniref/DL3Line.fasta",
    "/Luniref/DL4Line.fasta",
    "/Luniref/DL5Line.fasta",
    "/Luniref/DL6Line.fasta",
    "/Luniref/DL7Line.fasta",
    "/Luniref/DL8Line.fasta",
    "/Luniref/DL9Line.fasta",
    "/Luniref/DL10Line.fasta")

  val subMatrixDSW = "alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt"
  val subMatrixBlosum50 = "BLOSUM50"
  val subMatrixBlosum60 = "BLOSUM60"
  val subMatrixBlosum62 = "BLOSUM62"
  val subMatrixSparkSW = "/xubo/project/SparkSW/hash50.csv"

  val sparkSWQuery = Array(
    Array("/xubo/project/SparkSW/hash50.csv", "~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/0P18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/1P83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/2P20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/3O55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/4Q6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/5Q6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/7Q7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/8Q8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/9R0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5")
  )


  val sparkSWSubject = Array(
    Array("/xubo/project/SparkSW/hash50.csv", "/home/hadoop/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0/query/6Q19LI2.file", "/Luniref/DL1Line.fasta", "16", "1", "5")
  )


  val DSWSubject = Array(
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL1Line.fasta", "16", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL2Line.fasta", "16", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL3Line.fasta", "16", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL4Line.fasta", "16", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL5Line.fasta", "16", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL6Line.fasta", "32", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL7Line.fasta", "64", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL8Line.fasta", "128", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL9Line.fasta", "256", "1", "5"),
    Array("alluxio://Master:19998/xubo/project/SparkSW/BLOSUM50.txt", "alluxio://Master:19998/query/D6DQ19LI2.file", "alluxio://Master:19998/Luniref/DL10Line.fasta", "512", "1", "5")
  )


  val aliyunDSWQueryHDFSD9 = Array(
    Array("BLOSUM50", "/query/D0DP18691.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D1DP83140.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D2DP20738.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D3DO55746.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D4DQ6GZW8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D5DQ6GZX4.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D6DQ19LI2.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D7DQ7TQI7.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D8DQ8IYD8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D9DR0INU3.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2")
  )


  val aliyunDSWQueryHDFSD9Longer = Array(
    Array("BLOSUM50", "/query/D0DP18691.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D1DP83140.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D2DP20738.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D3DO55746.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D4DQ6GZW8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D5DQ6GZX4.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D6DQ19LI2.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D7DQ7TQI7.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D8DQ8IYD8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D9DR0INU3.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D0DP18691.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D1DP83140.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D2DP20738.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D3DO55746.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D4DQ6GZW8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D5DQ6GZX4.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D6DQ19LI2.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D7DQ7TQI7.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D8DQ8IYD8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D9DR0INU3.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D0DP18691.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D1DP83140.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D2DP20738.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D3DO55746.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D4DQ6GZW8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D5DQ6GZX4.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D6DQ19LI2.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D7DQ7TQI7.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D8DQ8IYD8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D9DR0INU3.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D0DP18691.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D1DP83140.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D2DP20738.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D3DO55746.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D4DQ6GZW8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D5DQ6GZX4.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D6DQ19LI2.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D7DQ7TQI7.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D8DQ8IYD8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D9DR0INU3.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D0DP18691.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D1DP83140.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D2DP20738.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D3DO55746.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D4DQ6GZW8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D5DQ6GZX4.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D6DQ19LI2.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D7DQ7TQI7.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D8DQ8IYD8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D9DR0INU3.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D0DP18691.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D1DP83140.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D2DP20738.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D3DO55746.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D4DQ6GZW8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D5DQ6GZX4.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D6DQ19LI2.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D7DQ7TQI7.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D8DQ8IYD8.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D9DR0INU3.file", "/Luniref/DL9Line.fasta", "128", "1", "5", "11", "1")
  )

  val aliyunDSWQueryHDFSD8 = Array(
    Array("BLOSUM50", "/query/D0DP18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D1DP83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D2DP20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D3DO55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D4DQ6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D5DQ6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D6DQ19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D7DQ7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D8DQ8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D9DR0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2")
  )

  val aliyunDSWQueryHDFSD8Longer = Array(
    Array("BLOSUM50", "/query/D0DP18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D1DP83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D2DP20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D3DO55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D4DQ6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D5DQ6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D6DQ19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D7DQ7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D8DQ8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D9DR0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM50", "/query/D0DP18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D1DP83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D2DP20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D3DO55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D4DQ6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D5DQ6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D6DQ19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D7DQ7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D8DQ8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM50", "/query/D9DR0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D0DP18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D1DP83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D2DP20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D3DO55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D4DQ6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D5DQ6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D6DQ19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D7DQ7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D8DQ8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D9DR0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM60", "/query/D0DP18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D1DP83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D2DP20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D3DO55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D4DQ6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D5DQ6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D6DQ19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D7DQ7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D8DQ8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM60", "/query/D9DR0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D0DP18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D1DP83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D2DP20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D3DO55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D4DQ6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D5DQ6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D6DQ19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D7DQ7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D8DQ8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D9DR0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "12", "2"),
    Array("BLOSUM62", "/query/D0DP18691.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D1DP83140.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D2DP20738.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D3DO55746.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D4DQ6GZW8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D5DQ6GZX4.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D6DQ19LI2.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D7DQ7TQI7.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D8DQ8IYD8.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1"),
    Array("BLOSUM62", "/query/D9DR0INU3.file", "/Luniref/DL8Line.fasta", "128", "1", "5", "11", "1")
  )

  val aliyunDSWQueryD9L10240N4 = Array(
    Array("BLOSUM62", "/queryD/D9L10240N4", "/Luniref/DL9Line.fasta", "1024", "1", "5", "11", "1")
  )

  //  val aliyunDSWQueryD9L10240N4 = Array(
  //    Array("BLOSUM62", "/queryD/D9L10240N4", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1")
  //  )


  //  Array("BLOSUM62", "/queryD/D9L392N40", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
  //  Array("BLOSUM62", "/queryD/D9L10240N4", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
  //  Array("BLOSUM62", "/queryD/D9L392N40", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1")


  val aliyunDSWQueryD9L392N40 = Array(
    Array("BLOSUM62", "/queryD/D9L392N40", "/Luniref/DL9Line.fasta", "1024", "1", "5", "11", "1")
  )

  //  val aliyunDSWQueryD9L392N40 = Array(
  //    Array("BLOSUM62", "/queryD/D9L392N40", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1")
  //  )

  //  val aliyunDSWQueryD8Small = Array(
  //    //    Array("BLOSUM50", "/queryD/D9L392N1", "/Luniref/DL9Line.fasta", "256", "1", "5", "12", "2"),
  //    //        Array("BLOSUM62", "/queryD/D9L10240N1", "/queryD/D9L10240N4", "256", "1", "5", "11", "1")
  //    Array("BLOSUM62", "/queryD/D9L10240N4", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
  //    //    Array("BLOSUM62", "/queryD/D9L10240avg", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
  //    Array("BLOSUM62", "/queryD/D9L392N40", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1"),
  //    Array("BLOSUM62", "/queryD/D9L392N100", "/Luniref/DL9Line.fasta", "256", "1", "5", "11", "1")
  //  )

  //  val aliyunDSWQueryD8Small = Array(
  //    Array("BLOSUM50", "/queryD/D9L392N1", "/Luniref/DL9Line.fasta", "256", "1", "5", "12", "2"),
  //    Array("BLOSUM50", "/queryD/D9L392N10", "/Luniref/DL9Line.fasta", "256", "1", "5", "12", "2"),
  //    Array("BLOSUM50", "/queryD/D9L392N100", "/Luniref/DL9Line.fasta", "256", "1", "5", "12", "2")
  //  )

  val DSWQueryD8Small = Array(
    Array("BLOSUM50", "/query/D0DP18691.file", "/Luniref/DL1Line.fasta", "128", "1", "5", "12", "2")
  )
  val DSWQueryD9Small = Array(
    Array("BLOSUM50", "alluxio://Master:19998/query/D0DP18691.file", "alluxio://Master:19998/Luniref/DL9Line.fasta", "128", "1", "5", "12", "2")
  )


  def main(args: Array[String]) {

    computeDSWQueryHDFS
    //    aliyunDSWQueryHDFS.foreach {
    //      each =>
    //        each.foreach {
    //          each => print(each + " ")
    //        }
    //        println()
    //    }


  }

  def computeDSW(): Unit = {

  }

  def computeDSWQueryLonger(): Unit = {
    val ref = refByLength(8)
    //    val ref = refByLength(8)
    val queryDSW1 = queryDSW
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum50 + "\"", "\"" + pre + each + "\"", "\"" + pre + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum50 + "\"", "\"" + pre + each + "\"", "\"" + pre + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum60 + "\"", "\"" + pre + each + "\"", "\"" + pre + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum60 + "\"", "\"" + pre + each + "\"", "\"" + pre + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum62 + "\"", "\"" + pre + each + "\"", "\"" + pre + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW1.map {
      each =>
        ("\"" + subMatrixBlosum62 + "\"", "\"" + pre + each + "\"", "\"" + pre + ref + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }


  def computeDSWQuery(): Unit = {
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum50 + "\"", "\"" + pre + each + "\"", "\"" + pre + refByLength(7) + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }


  val pre = "alluxio://Master:19998"

  def computeDSWSubject(): Unit = {
    refByLength.map {
      each =>
        ("\"" + subMatrixDSW + "\"", "\"" + pre + queryDSW(6) + "\"", "\"" + pre + each + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  val preHDFS = "hdfs://Master:9000"

  def computeDSWQueryHDFS(): Unit = {
    val refOne = refByLength(7)
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum50 + "\"", "\"" + each + "\"", "\"" + refOne + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum50 + "\"", "\"" + each + "\"", "\"" + refOne + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum60 + "\"", "\"" + each + "\"", "\"" + refOne + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum60 + "\"", "\"" + each + "\"", "\"" + refOne + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum62 + "\"", "\"" + each + "\"", "\"" + refOne + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 12 + "\"", "\"" + 2 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
    queryDSW.map {
      each =>
        ("\"" + subMatrixBlosum62 + "\"", "\"" + each + "\"", "\"" + refOne + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"", "\"" + 11 + "\"", "\"" + 1 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  def computeDSWSubjectHDFS(): Unit = {
    refByLength.map {
      each =>
        ("\"" + preHDFS + subMatrixSparkSW + "\"", "\"" + preHDFS + queryDSW(6) + "\"", "\"" + preHDFS + each + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  def computeSparkSWQuery(): Unit = {
    queryMaster.map {
      each =>
        ("\"" + subMatrixSparkSW + "\"", "\"" + each + "\"", "\"" + refByLength(7) + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }

  //  var map= map()
  def computeSparkSWSubject(): Unit = {
    refByLength.map {
      each =>
        ("\"" + subMatrixSparkSW + "\"", "\"" + queryMaster(6) + "\"", "\"" + each + "\"", "\"" + 128 + "\"", "\"" + 1 + "\"", "\"" + 5 + "\"")
    }.foreach {
      each => println("Array" + each + ",")
    }
  }
}
