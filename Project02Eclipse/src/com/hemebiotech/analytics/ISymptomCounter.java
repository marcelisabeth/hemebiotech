package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 *
 * Interface allowing to count the number of symptoms in the file
 * @author melisabeth
 * 
 */
public interface ISymptomCounter {
	
/**
 * 
 * @param listSymptoms count symptoms in the listing
 * @return orders a list of symptoms in alphabetical order, specifying the number of occurrences
 */

	TreeMap <String, Integer> countSymptoms (List <String> listSymptoms);
}
