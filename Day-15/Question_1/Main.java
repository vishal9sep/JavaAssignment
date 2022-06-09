package com.Question_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	
	static int findAge(String dob) throws InvalidDateFormat{
		
		try {
			LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate cDate = LocalDate.now();
			Period diff = Period.between(d1, cDate);
			if(d1.isBefore(cDate)) {
				return diff.getYears();
			}else {
				
				System.out.println("Age should not be in the future");
				return 0;
			}
			
			
		} catch (DateTimeParseException e) {
			
			throw new InvalidDateFormat("Wrong date Formate");
//			System.out.println(idf.getMessage());
		}
		
	};
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String dob= sc.next();
		
		sc.close();
		
		try {
			int age =  Main.findAge(dob);
			System.out.println(age);
		} catch(InvalidDateFormat idf) {
			 System.out.println(idf.getMessage());
		 }
	}

}

class InvalidDateFormat extends Exception{
	
	InvalidDateFormat(String s){
		super(s);
	}
}
