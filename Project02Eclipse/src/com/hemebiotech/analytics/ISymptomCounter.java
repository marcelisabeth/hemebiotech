package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * @author melisabeth
 * Interface allowing to count the number of symptoms in the file
 */

public interface ISymptomCounter {
	
/**
 * If no data is available, return an empty List
 * @param listSymptoms
 * @return orders a list of symptoms in alphabetical order, specifying the number of occurrences
 */

	TreeMap <String, Integer> countSymptoms (List <String> listSymptoms);
}
