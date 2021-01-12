package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * Write a symptoms listing order in a text file "FileResult.out"
 * @author melisabeth
 * 
 */

public interface ISymptomWriter {
	

   /**
    * 
    * @param treeMapSymptom File created list of symptoms
    * @throws IOException Input and Output exception
    */
   void	writeSymptom (Map <String, Integer> treeMapSymptom) throws IOException;
	
}
