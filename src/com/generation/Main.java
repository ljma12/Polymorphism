package com.generation;

public class Main {

	public static void main(String[] args) {
		Employee Juan = new Employee("Juan", "Antonio", 2223, 26, 200, 0, 2000, 4);
		Employee Thor = new Employee("Thor", "Torres", 1415, 25, 150, 2, 1800, 2);
		
		 System.out.println(Juan);
		 System.out.println("Nombre: " + Juan.getFirstName() + " " + Juan.getLastName());
	     System.out.println("Bonus: " + Juan.calculateBonus());
	     System.out.println("Comision: " + Juan.calculateComission());
	     System.out.println("");
	     System.out.println(Thor);
		 System.out.println("Nombre: " + Thor.getFirstName() + " " + Thor.getLastName());
	     System.out.println("Bonus: " + Thor.calculateBonus());
	     System.out.println("Comision: " + Thor.calculateComission());
	}//main

}//classMain