package com.Question_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo main = new Demo();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Mobile No. : ");
		String mobile = sc.next();
		System.out.println("Enter Aadhar No. : ");
		String aadhar = sc.next();
		
		if(main.validate(name, mobile, aadhar)) {
			Citizen citizen = new Citizen();
			citizen.setName(name);
			citizen.setMobileNumber(mobile);
			citizen.setAadharNumber(aadhar);
			
			System.out.println(citizen.getName());
			System.out.println(citizen.getMobileNumber());
			System.out.println(citizen.getAadharNumber());
		}
		else {
			System.out.println("Invalid details");
		}
	}
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(!(Pattern.matches("[0-9]{12}", aadharCard))) {
			return false;
		}
		if(!(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum))) {
			return false;
		}
		return true;
	};

}

class Citizen{
	
	private String name;
	private String aadharNumber;
	private String mobileNumber;
	
	Citizen(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
