package com.Question_2;

import java.util.Scanner;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public static void main(String[] args) {
		new Mobile().searchOutdatedModel();
	}
	
	void searchOutdatedModel() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the company : ");
		String companyName = input.next();
		System.out.println("Enter the model no. : ");
		String modelNo = input.next();
		String device = "note" + modelNo;
		
		for(String i: outdatedModels) {
			if(i.equals(device)) {
				System.out.println(device + "_OUTDATED");
				break;
			}
		}
		
	}
}