package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Map;
import java.util.TreeSet;

public class SymptomWriter implements ISymptomWriter{

	@Override
	public void writeSymptom(TreeSet treeSetSymptom) {
		FileWriter fileWriter = new FileWriter("Project02Eclipse/FileResult.out");
		BufferedWriter out = new BufferedWriter(fileWriter); // ajout code
		
		
		for (Map.Entry<String, String> entry : sortMap.entrySet()) { //ajout code
			System.out.println( entry.getKey() + " : " + entry.getKey() + "\n" ); //ajout code
			System.out.println("Le comptage est terminé."); // ajout code
			
			out.flush(); //ajout code
		}

		out.close(); //ajout code

			     
			 }
	
	}


