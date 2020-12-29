package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		List<String> lineList = new ArrayList<String>();
  
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");	
        lineList = reader.getSymptoms();
        
        TreeMap <String, Integer> treeMapCounter = new TreeMap <String, Integer> () ;
        SymptomCounter symptomCounter = new SymptomCounter () ;
        treeMapCounter = symptomCounter.countSymptoms(lineList);

  
// Ce fichier récupére le résultat de l'opération de classement		
		String fileResult = "Project02Eclipse/FileResult.out";



// Classement par ordre alphabétique

		Set<String> lt = new TreeSet<String>(lineList);

		FileWriter fileWriter = new FileWriter(fileResult);
//		PrintWriter out = new PrintWriter(fileWriter);
		for (String s : lt) {
//			out.println(s + ": " + Collections.frequency(lineList, s));
			fileWriter.write(s + ": " + Collections.frequency(lineList, s) + "\n");
			
		}
//		out.flush();
//		out.close();
		fileWriter.close();
        
	}
}