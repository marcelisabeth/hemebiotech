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
 * @author melisabeth
 *
 */
public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		List<String> lineList = new ArrayList<String>();
       
		
/**
     * Lecture du fichier d'entrée représentant la liste des symptomes présent
     * dans le dossier Project02Eclipse
     * 
     * @param ReadSymptomDataFromFile
    
     */
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");	
        lineList = reader.getSymptoms();
        
/**
      * Création et initialisation d'une Treemap
      * permettant de compter et trier les symptomes
      */
        TreeMap <String, Integer> treeMapCounter = new TreeMap <String, Integer> () ;
        SymptomCounter symptomCounter = new SymptomCounter () ;
        treeMapCounter = symptomCounter.countSymptoms(lineList);
        
/**
       * Ecriture dans le fichier de sortie
       */
        SymptomWriter writer = new SymptomWriter () ;
        writer.writeSymptom(treeMapCounter);
  
        
	}
}