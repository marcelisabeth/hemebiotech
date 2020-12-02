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

//d�claration de mes deux fichiers textes
		
//Ce fichier repr�sente la liste des symptomes		
		String fileListSymptoms = "Project02Eclipse/symptoms.txt";
		
// Ce fichier r�cup�re le r�sultat de l'op�ration de classement		
		String fileResult = "Project02Eclipse/FileResult.out";

// Lecture de ma liste de symptomes par le programme
		FileReader fileReader = new FileReader(fileListSymptoms);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String listSymptoms;
		
		
// D�claration de ma variable liste		
		List<String> lineList = new ArrayList<String>();
		while ((listSymptoms = bufferedReader.readLine()) != null) {
			lineList.add(listSymptoms);
			
// Affichage a l'�cran de ma liste de symptomes dans mon fichier original			
			System.out.println (listSymptoms);
		}
		fileReader.close();
		
		
//D�compte des symptomes		
		
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
	 		
		
		
		
// Classement par odre alphab�tique
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