package com.Question_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String username = sc.next();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		System.out.println("Enter Mobile No. : ");
		String mobileNo = sc.next();
		
		System.out.println("Enter email : ");
		String email = sc.next();
			
		
		if(validate(username, password, mobileNo, email) {
			Customer c1 = new Customer();
			c1.setUsername(username);;
			c1.setPassword(password);
			c1.setMobileNumber(mobileNo);
			c1.setEmail(email);
			
			System.out.println(c1.getUsername());
			System.out.println(c1.getPassword());
			System.out.println(c1.getMobileNumber());
			System.out.println(c1.getEmail());			
		}
		else {
			System.out.println("Invalid Details");
		}
	}	
	public static boolean validate(String username, String password, String mobileNo, String email) {
		if(!(Pattern.matches("[a-zA-Z]]{8}", username))) {
			return false;
		}
		if(!(Pattern.matches("[a-zA-Z0-9]{9}", password))) {
			return false;
		}
		if(!(Pattern.matches("[6789]{1}[0-9]{9}",mobileNo))) {
			return false;
		}
		if(!(Pattern.matches("[a-zA-Z]]{8}",email))) {
			return false;
		}
		return true;
	};
}

class Customer{
	
	String username;
	String password;
	String mobileNumber;
	String email;
	
	Customer() {}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
