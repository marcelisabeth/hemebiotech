package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SymptomCounter implements ISymptomCounter {

	@Override
	public TreeMap<String, Integer> countSymptoms(List<String> listSymptoms) {
		
		TreeMap<String, Integer> treeMapResult = new TreeMap();
		for (String symptom : listSymptoms) {
			Integer currentCount = treeMapResult.get(symptom);
			if (currentCount != null) { // Si le symptome existe deja dans la TreeMap,on incrémente la valeur
				currentCount++;
				treeMapResult.put(symptom, currentCount);
			} else { // Si le symptome n'existe pas ,on le crée dans la TreeMap
				treeMapResult.put(symptom, 1);
			}

		}

		return treeMapResult;
	}

}
