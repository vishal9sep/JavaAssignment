package com.Question_2;

import java.util.Scanner;

public class UserRegistration {
	
	void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}else {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String username = sc.next();
		System.out.println("Enter Your Country");
		String country = sc.next();
		
		UserRegistration ur = new UserRegistration();
		try {
			ur.registerUser(username, country);
		} catch (InvalidCountryException ice) {			
			System.out.println(ice.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

class InvalidCountryException extends Exception{
	
	public InvalidCountryException(String s){
		super(s);
	}
	
}
