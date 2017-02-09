更多代码请见：https://github.com/xubo245/SparkLearning

#1 DSA基本API测试

## 1.1 测试类
org.dsw.api.DSA

	object DSA {
	  def main(args: Array[String]) {
	    val dsa = new DSA()
	    val conf = new SparkConf().setAppName("DSA")
	    if (System.getProperties.getProperty("os.name").contains("Windows")) {
	      conf.setMaster("local[16]")
	    }
	
	    val sc = new SparkContext(conf)
	    val dsaType = args(0)
	    val queryFile = args(1)
	    val refFile = args(2)
	
	    var result = new Array[AlignmentRecordTopK](0);
	    if (dsaType.equals("dsw")) {
	      result = dsa.dsw(queryFile, refFile, sc)
	      printArray(result)
	    } else if (dsaType.equals("dnw")) {
	      result = dsa.dnw(queryFile, refFile, sc)
	      printArray(result)
	    } else if (dsaType.equals("dsg")) {
	      result = dsa.dsg(queryFile, refFile, sc)
	      printArray(result)
	    } else {
	      println("dsa type error")
	    }
	    sc.stop()
	    println("end")
	  }
	
	  def printArray(result: Array[AlignmentRecordTopK]): Unit = {
	    result.foreach { each =>
	      println(each.getQueryName())
	      println(each.getTopK())
	      each.getAlignmentRcoreds().foreach(println)
	    }
	  }
	}

###基本脚本：

hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ cat testDSA.sh 

	#!/bin/bash
	
	#sbt clean
	#sbt package
	#/home/zgg/lib/spark-1.0.1-bin-hadoop2/bin/spark-submit \
	  spark-submit \
	  --conf "spark.executor.extraJavaOptions=-Djava.library.path=/home/hadoop/disk2/xubo/lib" \
	  --class "org.dsw.api.DSA" \
	  --master spark://MasterIp:7077 \
	  --executor-memory 8G \
	  DSA.jar $1 $2 $3


##1.2 测试1
###1.2.1 测试脚本1

	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ cat DSA.sh 
	
	
	./testDSA.sh dsw alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta
	./testDSA.sh dnw alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta
	./testDSA.sh dsg alluxio://Master:19998/xubo/project/SparkSW/input/query/D0DP18691.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL1Line.fasta


## 1.2.2 测试结果1：

	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ ./DSA.sh 
	P18691                                                                          
	5
	AlignmentRecord(UniRef100_P18691, 8M, 67, 0, 0, 7, 0, 7, 0)
	AlignmentRecord(UniRef100_P18560, 8M, 51, 24, 0, 260, 0, 7, 105)
	AlignmentRecord(UniRef100_P0C9G3, 8M, 51, 21, 0, 260, 0, 7, 117)
	AlignmentRecord(UniRef100_P0C9G2, 8M, 51, 21, 0, 260, 0, 7, 117)
	AlignmentRecord(UniRef100_Q7K480, 8M, 50, 29, 0, 1123, 0, 7, 1021)
	end
	P18691                                                                          
	5
	AlignmentRecord(UniRef100_P18691, , 67, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P82152, , 12, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P81815, , 11, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q7LZC4, , 5, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P80813, , 4, 0, 0, 0, 0, 0, 0)
	end
	P18691                                                                          
	5
	AlignmentRecord(UniRef100_P18691, , 67, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P18560, , 51, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P0C9G2, , 51, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P0C9G3, , 51, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q7K480, , 50, 0, 0, 0, 0, 0, 0)
	end

## 1.2.3 截图

![](http://i.imgur.com/Wek4gxz.png)
## 1.3 第二次测试
### 1.3.1 脚本

hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ cat DSA.sh 


	./testDSA.sh dsw alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta
	./testDSA.sh dnw alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta
	./testDSA.sh dsg alluxio://Master:19998/xubo/project/SparkSW/input/query/D6DQ19LI2.file alluxio://Master:19998/xubo/project/SparkSW/input/Luniref/DL8Line.fasta

## 1.3.2 结果

	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ ./DSA.sh 
	Q19LI2                                                                          
	5
	AlignmentRecord(UniRef100_Q19LI2, 512M, 3496, 1750, 0, 511, 0, 511, 254)
	AlignmentRecord(UniRef100_Q9EPH1, 512M, 3098, 1568, 0, 511, 0, 511, 254)
	AlignmentRecord(UniRef100_Q9EPH1-2, 416M, 2535, 988, 0, 415, 0, 415, 158)
	AlignmentRecord(UniRef100_P04217, 83M3I15M10I33M1I23M1D160M5I177M, 1418, 577, 0, 491, 0, 509, 234)
	AlignmentRecord(UniRef100_Q2KJF1, 96M10I38M1I26M1D109M1D8M1I223M, 1376, 620, 0, 501, 0, 511, 244)
	end
	Q19LI2                                                                          
	5
	AlignmentRecord(UniRef100_Q19LI2, , 3496, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1, , 3086, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1-2, , 2461, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P04217, , 1412, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q2KJF1, , 1364, 0, 0, 0, 0, 0, 0)
	end
	Q19LI2                                                                          
	5
	AlignmentRecord(UniRef100_Q19LI2, , 3496, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1, , 3098, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1-2, , 2526, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P04217, , 1414, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q2KJF1, , 1376, 0, 0, 0, 0, 0, 0)
	end
	hadoop@Master:~/disk2/xubo/project/alignment/SparkSW/SparkSW20161114/alluxio-1.3.0$ ./DSA.sh 
	Q19LI2                                                                          
	5
	AlignmentRecord(UniRef100_Q19LI2, 512M, 3496, 1750, 0, 511, 0, 511, 254)
	AlignmentRecord(UniRef100_Q9EPH1, 512M, 3098, 1568, 0, 511, 0, 511, 254)
	AlignmentRecord(UniRef100_Q9EPH1-2, 416M, 2535, 988, 0, 415, 0, 415, 158)
	AlignmentRecord(UniRef100_P04217, 83M3I15M10I33M1I23M1D160M5I177M, 1418, 577, 0, 491, 0, 509, 234)
	AlignmentRecord(UniRef100_Q2KJF1, 96M10I38M1I26M1D109M1D8M1I223M, 1376, 620, 0, 501, 0, 511, 244)
	end
	Q19LI2                                                                          
	5
	AlignmentRecord(UniRef100_Q19LI2, , 3496, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1, , 3086, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1-2, , 2461, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P04217, , 1412, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q2KJF1, , 1364, 0, 0, 0, 0, 0, 0)
	end
	Q19LI2                                                                          
	5
	AlignmentRecord(UniRef100_Q19LI2, , 3496, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1, , 3098, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q9EPH1-2, , 2526, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_P04217, , 1414, 0, 0, 0, 0, 0, 0)
	AlignmentRecord(UniRef100_Q2KJF1, , 1376, 0, 0, 0, 0, 0, 0)
	end



参考

	【1】http://spark.apache.org/
	【2】https://github.com/xubo245/SparkLearning
	【3】https://github.com/xubo245/DSA