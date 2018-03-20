/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author yanqiaoy
 */
public class InvertedIndex extends Index {
    
private HashMap<String,HashMap<Integer,Integer>> _index;
private HashMap<String,Integer> _docFreq;

public InvertedIndex(io.DocSource doc_source, tokenizer.Tokenizer tokenizer, score.TermScoringFun scoring) {
        super(doc_source, tokenizer, scoring);
    }

    //public String toString() {
       
   // }

    public void buildIndex() { //build _index(query, docid-> its fre in that doc)
        _index = new HashMap();
        _docFreq = new HashMap();
        
        int numberDoc = _docSource.getNumDocs();
        TreeSet<String> tokens = new TreeSet<String>();
        
        for (int i = 0; i< numberDoc;i++){
            tokens.addAll(this._tokenizer.tokenize(_docSource.getDoc(i))); //add all tokens to the given treeset of tokens(ordered) 
            
        }
        
    }

    public int getDocumentFreq(String term) {
        return this._docFreq.get(term);
    }

    public ArrayList<index.DocScore> getSortedSearchResults(String query) {
        return null;
    }
     
    
}
    

