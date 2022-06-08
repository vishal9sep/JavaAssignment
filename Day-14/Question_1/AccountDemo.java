package com.Question_1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.accountNumber = "1234 5678 4321";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to be Deposited :");
		int x = sc.nextInt();
		System.out.println("Enter Amount to be Withdrawn :");
		int y = sc.nextInt();
		sc.close();
		try {
			a1.deposite(x);
			a1.withdraw(y);
			
		} 
		catch (InsufficientFundException  ife) {
			System.out.println(ife);
		}
		
		
	}

}

class InsufficientFundException extends Exception {
	
	public InsufficientFundException(String s) {
		super(s);
	}

}

class Account {
	
	String accountNumber;
	double balance;
	
	void deposite(int amount) {
		this.balance += amount;
//		System.out.println("Your current Available Balance is : "+balance);
	}
	
	void withdraw(int amount) throws InsufficientFundException {		
		
		if(this.balance < amount) {
			throw new InsufficientFundException("You have low Balance : "+balance);		
		}
		else {
			this.balance -= amount;	
			System.out.println("Your current Available Balance is : "+balance);
		}
	}
}
