package com.jpay.media.automation.web.utilities;

import java.util.Comparator;

public class SequenceComparator implements Comparator<TestNgInsertResultSet> {

	
public int compare(TestNgInsertResultSet set1, TestNgInsertResultSet set2) {
		
		//sort on suitid
		int result = Integer.compare(Integer.parseInt(set1.getSuiteID()), Integer.parseInt(set2.getSuiteID()));
		if (result !=0) {
			return result;
		}
		
		//sort on testCaseid
		result = Integer.compare(Integer.parseInt(set1.getTestCaseID()), Integer.parseInt(set2.getTestCaseID()));
		if (result !=0) {
		   return result;
		}
		
		
		//sort on row number
		result = Integer.compare(Integer.parseInt(set1.getRownum()), Integer.parseInt(set2.getRownum()));
		if (result !=0) {
			 return result;
		}
		
		
		//sort on step sequence number
		return 	result = Integer.compare(Integer.parseInt(set1.getStepSequence()), Integer.parseInt(set2.getStepSequence()));
		
	}


}
