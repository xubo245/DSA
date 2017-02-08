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
    DSA.jar DSAType queryFile refFile
 
 DSAType includes: dsw, dnw, dsg, dswAdam,  dnwAdam, dsgAdam.

  queryFile and refFile should be paths in Alluxio.


##Tutorial

the Tutorial or docs is being written.
