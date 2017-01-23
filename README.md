# DSA
DSA

The code will be upload after the paper has been published


##run

  spark-submit \
  --conf "spark.executor.extraJavaOptions=-Djava.library.path=/home/hadoop/disk2/xubo/lib" \
  --jars /home/hadoop/cloud/adam/lib/adam-apis_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-cli_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-core_2.10-0.18.3-SNAPSHOT.jar \
  --class "org.dsw.api.DSA" \
  --master spark://MasterIP:7077 \
  --executor-memory 8G \
  DSA.jar $1 $2 $3
  
  
  
  ## other
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
    } else if (dsaType.equals("dswAdam")) {
      result = dsa.dswAdam(queryFile, refFile, sc)
      printArray(result)
    } else if (dsaType.equals("dnwAdam")) {
      result = dsa.dnwAdam(queryFile, refFile, sc)
      printArray(result)
    } else if (dsaType.equals("dsgAdam")) {
      result = dsa.dsgAdam(queryFile, refFile, sc)
      printArray(result)
    } else {
      println("dsa type error")
    }

