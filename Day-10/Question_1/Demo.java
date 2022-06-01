package com.Question_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Budget");
		int amount = sc.nextInt();
		
		if (amount >= 200) {
			
			Demo d1 = new Demo();
			Hotel h1 = d1.provideFood(amount);
			h1.chickenBiryani();
			h1.masalaDosa();
			
			if (h1 instanceof TajHotel) {
				
				TajHotel taj = (TajHotel) h1;
				taj.welcomeDrink();				
			}
		}
		else {
			System.out.println("Please enter a Valid amount !");
		}
	}
	
	public Hotel provideFood(int amount) {
		
		if(amount > 1000) {
			Hotel th = new TajHotel();
			return th;
		}
		else if (amount > 200) {
			
			Hotel rsh = new RoadSideHotel();
			return rsh;			
		}
		else {
			return null;
		}
		
	}

}
