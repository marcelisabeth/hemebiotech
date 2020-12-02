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
import java.util.TreeSet;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {

//déclaration de mes deux fichiers textes

//Ce fichier représente la liste des symptomes		
		String fileListSymptoms = "Project02Eclipse/symptoms.txt";

// Ce fichier récupére le résultat de l'opération de classement		
		String fileResult = "Project02Eclipse/FileResult.out";

// Lecture de ma liste de symptomes par le programme
		FileReader fileReader = new FileReader(fileListSymptoms);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String listSymptoms;

// Déclaration de ma variable liste		
		List<String> lineList = new ArrayList<String>();
		while ((listSymptoms = bufferedReader.readLine()) != null) {
			lineList.add(listSymptoms);

// Affichage a l'écran de ma liste de symptomes dans mon fichier original			
			System.out.println(listSymptoms);
		}
		fileReader.close();

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