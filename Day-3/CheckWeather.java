package com.masai;

import java.util.Scanner;

public class CheckWeather {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("isRaining : ");
		boolean r = scn.nextBoolean();
		System.out.println("isSnowing : ");
		boolean s = scn.nextBoolean();
		System.out.println("What is the Temp(F) : ");
		double temp = scn.nextDouble();		
		scn.close();
		
		if ((s == false && r == false) && temp >= 50) {
			System.out.println("Let's go out!");			
		}else {
			System.out.println("Let`s stay home.");
		}		

	}

}
