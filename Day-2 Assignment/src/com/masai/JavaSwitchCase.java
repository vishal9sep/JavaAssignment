package com.masai;

import java.util.Scanner;

public class JavaSwitchCase {
	
	static void switchCase(String city) {
		
		switch (city) {
		case "Mumbai":System.err.println("Financial city");			
			break;
		case "Kolkata": System.out.println("City of Joy");
			break;
		case "Delhi": System.out.println("Capital of the Country");
			break;
		case "Bangalore" : System.out.println("Cyber City");
			break;
		default: System.out.println("May be Other Indian City");
			break;
		}
	}
	
	
	public static void main(String[] args) {		
		
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter Your City Name : ");
	    String city = scn.next();
	    
		switchCase(city);		
	}
}
