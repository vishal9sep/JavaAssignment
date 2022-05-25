package com.Ques1;

import java.util.Scanner;

public class Main {
	
	public static String reverseString(String s) {
		
		String bag = "";
		for(int i = s.length() - 1; i >= 0 ; i--) {
			bag += s.charAt(i);
		}
		return bag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String originalString = scn.next();
		
		String result = reverseString(originalString);
		
		System.out.println("Original String is: "+originalString);
		System.out.println("Reversed String is: "+result);
		scn.close();
	}
}
