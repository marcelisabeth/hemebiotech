package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SymptomCounter implements ISymptomCounter {


	@Override
	    public TreeMap<String, Integer> countSymptoms(List<String> listSymptoms) {
		
		TreeMap<String, Integer> treeMapResult = new TreeMap();
		
/**		
     * 
     * Si le symptome existe déjà dans la TreeMap, on incrémente la valeur.
     * Si le symptome n'existe pas, on le crée dans la TreeMap.
     * 
 */
		for (String symptom : listSymptoms) {
			Integer currentCount = treeMapResult.get(symptom);
			if (currentCount != null) { 
				currentCount++;
				treeMapResult.put(symptom, currentCount);
			} else { 
				treeMapResult.put(symptom, 1);
			}

		}

/**
		 *  @return une instance de TreeMap suite à une boucle.
		 *  
		 *
*/
	
		return treeMapResult;
	}

}
