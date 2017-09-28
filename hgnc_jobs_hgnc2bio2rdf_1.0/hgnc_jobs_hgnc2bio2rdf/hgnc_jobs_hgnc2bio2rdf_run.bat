%~d0
 cd %~dp0
java -Xms256M -Xmx1024M -cp classpath.jar; bio2rdf.hgnc_jobs_hgnc2bio2rdf_1_0.hgnc_jobs_hgnc2bio2rdf --context=Default %* 