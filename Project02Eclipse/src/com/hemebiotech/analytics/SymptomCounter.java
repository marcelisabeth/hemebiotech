package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;


/**
 *
 * If the symptom already exists in the TreeMap, the value is increased.
 * If the symptom does not exist, it is created in the TreeMap.
 * * @author Marc ELISABETH
 */

public class SymptomCounter implements ISymptomCounter {

/**		 
 * @param listSymptoms list of symptoms
 * 
 * @return TreeMap 
 */
	@Override
	    public TreeMap<String, Integer> countSymptoms(List<String> listSymptoms) {
		
		TreeMap<String, Integer> treeMapResult = new TreeMap();
		

		for (String symptom : listSymptoms) {
			Integer currentCount = treeMapResult.get(symptom);
			if (currentCount != null) { 
				currentCount++;
				treeMapResult.put(symptom, currentCount);
			} else { 
				treeMapResult.put(symptom, 1);
			}

		}
	
		return treeMapResult;
	}

}
