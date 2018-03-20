/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

/**
 *
 * @author yanqiaoy
 */
public class SortedDocScore extends index.DocScore implements Comparable{
    
    public SortedDocScore(double score, int doc_id, String content) {
        super(score, doc_id, content);//cannot directly give those values to the parent class; have to use super method
        
    }


     public int compareTo(Object o) {    //rank the stuff using scores and contents
        if (!(o instanceof SortedDocScore))
                return 0;
        SortedDocScore n = (SortedDocScore) o;
        
        if (_score > n._score)
            return 1;
        
        if ( _score < n._score)
            return -1;
        
        return _content.compareToIgnoreCase(n._content);
    }

    public boolean equals(Object o) {  //check if the two are exactly the same
        if (!(o instanceof SortedDocScore))
            return false;
        
        SortedDocScore n = (SortedDocScore)o;
        if( (n._score == _score)&&(n._content.equals(_content))&&(n._docID == _docID))
            return true;
        
        return false;      
     }


}
