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


/**
 * 
 * Read file "symptoms.txt" without particular order
 * @author melisabeth
 */
public class AnalyticsCounter {
	
    /**
     * 
     * @param args string array arguments
     * @throws Exception java.lang.Exception
     */
	public static void main(String[] args) throws Exception {
		List<String> lineList = new ArrayList<String>();
       
		
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");	
        lineList = reader.getSymptoms();
        

        TreeMap <String, Integer> treeMapCounter = new TreeMap <String, Integer> () ;
        SymptomCounter symptomCounter = new SymptomCounter () ;
        treeMapCounter = symptomCounter.countSymptoms(lineList);
        
        SymptomWriter writer = new SymptomWriter () ;
        writer.writeSymptom(treeMapCounter);
  
        
	}
}