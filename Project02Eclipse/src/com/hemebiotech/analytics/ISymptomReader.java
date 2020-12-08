package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	//Ce fichier représente la liste des symptomes		
			String fileListSymptoms = "Project02Eclipse/symptoms.txt";

	// Ce fichier récupére le résultat de l'opération de classement		
			String fileResult = "Project02Eclipse/FileResult.out";
			
	// Lecture de ma liste de symptomes par le programme
			FileReader fileReader = new FileReader(fileListSymptoms);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String listSymptoms;
	
}
