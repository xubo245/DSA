# DSA
DSA

The code will be upload after the paper has been published

##prepare
we should prepare before run DSA.
###1. Apache Spark
Please refer: https://github.com/apache/spark
###2. Alluxio
Please refer: http://www.alluxio.org/
###3. SSW
Please refer: https://github.com/mengyao/Complete-Striped-Smith-Waterman-Library

We should obtain libsswjni.so, and libssw.so.
##run

    spark-submit \
    --conf "spark.executor.extraJavaOptions=-Djava.library.path=/home/hadoop/disk2/xubo/lib" \
    --jars /home/hadoop/cloud/adam/lib/adam-apis_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-cli_2.10-0.18.3-SNAPSHOT.jar,/home/hadoop/cloud/adam/lib/adam-core_2.10-0.18.3-SNAPSHOT.jar \
    --class "org.dsw.api.DSA" \
    --master spark://MasterIP:7077 \
    --executor-memory 8G \
    DSA.jar DSAType queryFile refFile
 
 DSAType includes: dsw, dnw, dsg, dswAdam,  dnwAdam, dsgAdam.

  queryFile and refFile should be paths in Alluxio.


##Tutorial

the Tutorial or docs is being written.
