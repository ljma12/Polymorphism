package com.generation;

import java.util.HashMap;

public class SalesManager {

	HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
	
	 public double calculateComission(){
	      double totalCommission=0.0;
		 for(SalesRep rep : salesTeam.values()) {
			  totalCommission = rep.calculateComission();	
			 }
		return totalCommission * 0.03;
		 // 0.03 * all sales made by team
	   }
	
}//class SalesManager