package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Collections;
import java.util.Map;
import java.util.TreeSet;

public class SymptomWriter implements ISymptomWriter{

	@Override
	public void writeSymptom(TreeSet treeSetSymptom) {
		FileWriter fileWriter = new FileWriter("Project02Eclipse/FileResult.out");

		// TODO Auto-generated method stub
		for (String s : treeSetSymptom) {
//			out.println(s + ": " + Collections.frequency(lineList, s));
			fileWriter.write(s + ": " + Collections.frequency(lineList, s) + "\n");
			
							
		}
		
		
		
	}

}
