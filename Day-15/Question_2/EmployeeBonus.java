package com.Question_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EmployeeBonus {
	
	static double bonus(String doj) throws InvalidAgeException{
		
		try {
			LocalDate lDate = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate cDate = LocalDate.now();
			int exp = Period.between(lDate, cDate).getYears();
			double bns = 0;
			
			if (lDate.isAfter(cDate)) {
				
				throw new InvalidAgeException("Age should not be in the future");
			}
			
			if(exp < 1) {
				bns = 5000;
				return bns;
			}
			else if (exp >= 1 && exp < 2 ) {
				bns = 8000;
				return bns;
			}
			else {
				bns = 10000;
				return bns;
			}
		} catch (Exception e) {
			
			throw new InvalidAgeException("Please pass the date in the correct format");			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date Of Joining in DD-MM-YYYY format");
		String doj = sc.next();
		
		try {
			double bonus = EmployeeBonus.bonus(doj);
			System.out.println("You have got ₹"+bonus+" Bonus");
		} catch (Exception e) {
			System.out.println("Please pass the date in the correct format");
		}
	}
}

class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String s) {
		super(s);
	}
}