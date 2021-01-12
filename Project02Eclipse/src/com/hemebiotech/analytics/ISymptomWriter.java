package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
    * @author melisabeth
    * Write a symptoms listing order in a text file "FileResult.out"
    * 
 */

public interface ISymptomWriter {
	
/**
	 * 
	 * @throws
	 * 
*/

   void	writeSymptom (Map <String, Integer> treeMapSymptom) throws IOException;
	
}
