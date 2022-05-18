package com.masai;

import java.util.Scanner;

public class CricketScore {
	
	static void cricketScore(int s, int d, int t, int f, int six) {
		
		int total = s + d*2 + t*3 + f*4 + six*6;
		
		System.out.println("Total Score is : "+total);
	}
	
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of Singles : ");
		int s = scn.nextInt();
		System.out.println("Enter no. of Doubles : ");
		int d = scn.nextInt();
		System.out.println("Enter no. of Triples : ");
		int t = scn.nextInt();
		System.out.println("Enter no. of Fours : ");
		int f = scn.nextInt();
		System.out.println("Enter no. of Sixes : ");
		int six = scn.nextInt();
		
		cricketScore(s,d,t,f,six);
	}

}
