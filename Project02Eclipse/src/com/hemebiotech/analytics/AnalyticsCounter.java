package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
			System.out.println (listSymptoms);
		}
		fileReader.close();
		
		
//Décompte des symptomes		
		
public class countFrequencies {
	
	public static void countFrequencies(ArrayList<String> List)
    {
 

        Set<String> st = new HashSet<String>(List);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(List, s));
    }
 
    public static void main(String[] args)
    {
     
        ArrayList<String> lineList = new ArrayList<String>();
        countFrequencies(lineList);
    }
	
}
	 		
		
		
		
// Classement par odre alphabétique
		Collections.sort(lineList);

		FileWriter fileWriter = new FileWriter(fileResult);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String outputLine : lineList) {
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();

	}
}