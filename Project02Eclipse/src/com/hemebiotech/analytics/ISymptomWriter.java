package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
    * 
    * @author melisabeth
    * 
    * 
    * 
    * 
 */

public interface ISymptomWriter {
	
/**
	 * 
	 * 
	 * 
*/

   void	writeSymptom (Map <String, Integer> treeMapSymptom) throws IOException;
	
}
