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
 * @author melisabeth
 * Read file "symptoms.txt" without particular order
 */


public class AnalyticsCounter {
	
/**
 * Création et initialisation d'une Treemap
 * permettant de compter et trier les symptomes
 * 
 * 
 * @throws
 * @param treeMapCounter
 * 
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