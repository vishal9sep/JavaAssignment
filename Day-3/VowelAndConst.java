package com.masai;

import java.util.Scanner;

public class VowelAndConst {
	
	void vowelConst(char c) {
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
			System.out.println("It`s a Vowel");			
		}
		else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println("It`s a Consonent");
		}
		else {
			System.out.println("Wrong Input");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char c = scn.next().charAt(0);
		
		VowelAndConst x = new VowelAndConst();
		
		x.vowelConst(c);		
		
	}

}
