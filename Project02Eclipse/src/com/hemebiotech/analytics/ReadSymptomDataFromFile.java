package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile {
	
	// Ce fichier récupére le résultat de l'opération de classement		
			String fileResult = "Project02Eclipse/FileResult.out";

	// Déclaration de ma variable liste		
			List<String> lineList = new ArrayList<String>();
			while ((listSymptoms = bufferedReader.readLine()) != null) {
				lineList.add(listSymptoms);

			}
			fileReader.close();
	// Classement par ordre alphabétique

			Set<String> lt = new TreeSet<String>(lineList);

			FileWriter fileWriter = new FileWriter(fileResult);
//			PrintWriter out = new PrintWriter(fileWriter);
			for (String s : lt) {
//				out.println(s + ": " + Collections.frequency(lineList, s));
				fileWriter.write(s + ": " + Collections.frequency(lineList, s) + "\n");
				
			}
//			out.flush();
//			out.close();
			fileWriter.close();
			
}