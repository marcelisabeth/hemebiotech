package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Créer automatiquement un fichier de sortie
 * permettant de stocker la liste de symptomes.
 * 
 * @author melisabeth
*/

public class SymptomWriter implements ISymptomWriter{

	
	/**
	    * 
	    * 
	    * @param treeMapSymtom order symptoms listing
	    * 
	 */
	
	@Override
	public void writeSymptom(Map <String, Integer> treeMapSymptom) throws IOException {
		FileWriter fileWriter = new FileWriter("Project02Eclipse/FileResult.out");
		BufferedWriter out = new BufferedWriter(fileWriter);
		
		
		for (Entry <String, Integer> entry : treeMapSymptom.entrySet()) { 
			System.out.println( entry.getKey() + " : " + entry.getValue() + "\n" ); 
			fileWriter.write(entry.getKey() + " : " + entry.getValue() + "\n" );
			
			out.flush(); 
		}

		out.close();  
			     
			 }
	
	}


