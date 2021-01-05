package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class SymptomWriter implements ISymptomWriter{

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


