package com.Question_4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the bank : ");
		String bankName = input.next();
		Bank account = getBank(bankName);
		System.out.println("-----------------");
		account.displayDetails();
		System.out.println("-----------------");
		if(account instanceof AxisBank) {
			AxisBank acc1 = (AxisBank)account;
			acc1.getCreditCard();
		}

	}
	
	public static Bank getBank(String bank) {
		Scanner input = new Scanner(System.in);
		
		if(bank.equals("axis")) {
			AxisBank b1 = new AxisBank();
			System.out.print("Enter your IFSC Code : ");
			b1.IfscCode = (input.next());
			System.out.print("Enter your branch name : ");
			b1.branchName = input.next();
			System.out.print("Enter your rate of interest : ");
			b1.rateOfInterest = input.nextDouble();
			return b1;
			
		}
		else if(bank.equals("icici")) {
			ICICIBank b1 = new ICICIBank();
			System.out.print("Enter your IFSC Code : ");
			b1.IfscCode = (input.next());
			System.out.print("Enter your branch name : ");
			b1.branchName = input.next();
			System.out.print("Enter your rate of interest : ");
			b1.rateOfInterest = input.nextDouble();
			return b1;
		}
		else {
			Bank b1 = null;
			return b1;
		}
		
	}
}


class Bank{
	String branchName;
	String IfscCode;
	
	public void displayDetails() {
		System.out.println(branchName);
		System.out.println(IfscCode);
	}
	

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}
	
	
}

class AxisBank extends Bank{
	double rateOfInterest;
	
	
	@Override
	public void displayDetails() {
		System.out.println("Branch name is " + branchName);
		System.out.println("IFSC code is " + IfscCode);
		System.out.println("Rate of Interest is " + rateOfInterest + "%");
	}


	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}



class ICICIBank extends Bank{
	double rateOfInterest;
	
	@Override
	public void displayDetails() {
		System.out.println("Branch name is " + branchName);
		System.out.println("IFSC code is " + IfscCode);
		System.out.println("Rate of Interest is " + rateOfInterest + "%");
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
}