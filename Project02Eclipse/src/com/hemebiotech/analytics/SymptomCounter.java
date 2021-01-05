package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SymptomCounter implements ISymptomCounter {


	@Override
	    public TreeMap<String, Integer> countSymptoms(List<String> listSymptoms) {
		
		TreeMap<String, Integer> treeMapResult = new TreeMap();
		
/**		
     * 
     * Si le symptome existe d�j� dans la TreeMap, on incr�mente la valeur.
     * Si le symptome n'existe pas, on le cr�e dans la TreeMap.
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
		 *  @return une instance de TreeMap suite � une boucle.
		 *  
		 *
*/
	
		return treeMapResult;
	}

}
