package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomCounter {

	TreeMap <String, Integer> countSymptoms (List <String> listSymptoms);
}
