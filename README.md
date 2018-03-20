# java-information-retrieval

The overall project is to build an in-memory information retrieval system using a HashMap-based inverted
index and the TF-IDF scoring rule from information retrieval.

FileDocSource loads all files from a directory name provided in the constructor as a
String. 

The TFIDFScoringFun uses the TF-IDF term scoring rule from the lecture slides where TFIDFd,t =
log10(1 + TF(d,t)) · log10(N/DFt) (used Java’s Math.log10() for this). Here TF(d,t) is the frequency (count)
of term t in document d, DFt is the frequency (count) of the number of documents in the corpus
(data set) that contain term t and N is the total number of documents. 
