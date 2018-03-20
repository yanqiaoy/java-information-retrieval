/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author yanqiaoy
 */
public class FileDocSource extends io.DocSource { //arraylist of files

    public ArrayList<File> _files;

    public FileDocSource(String address) {
        if (new File(address).exists() == false) 
            System.out.println("wrong directory");
         else 
            _files = FileFinder.GetAllFiles(address);
        
    }

    public int getNumDocs() { //get the length of the document
        return _files.size();
    }
        
	public String getDoc(int id) {  //get the file from the file list at the given id
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader( _files.get(id))); //(File) _files.get(id)
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("could not read file");
        }
        return sb.toString();
    }
}
