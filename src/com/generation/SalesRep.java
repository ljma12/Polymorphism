package com.generation;

public class SalesRep {
	double salesMade;
	
	public SalesRep(double salesMade) {
		super();
		this.salesMade = salesMade;
	}//constructor
	
	

	public double getSalesMade() {
		return salesMade;
	}//getSalesMade



	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade



	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + "]";
	}//toString



	public int calculateComission(){
		int comission = (int) (0.1*salesMade);
	      
		return comission;
	   }//calculateComission

}//classSalesRep