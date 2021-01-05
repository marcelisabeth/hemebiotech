package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;


/**		
 * @author melisabeth
 *
 */

public class SymptomCounter implements ISymptomCounter {

/**		 
 * Si le symptome existe déjà dans la TreeMap, on incrémente la valeur.
 * Si le symptome n'existe pas, on le crée dans la TreeMap.
 * 
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
