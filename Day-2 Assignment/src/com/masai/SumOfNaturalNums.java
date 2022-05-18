package com.masai;

import java.util.Scanner;

public class SumOfNaturalNums {
	
	static void sumOfNatualNo(int n) {
		int sum = (n*(n+1))/2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int N = scn.nextInt();
		
		sumOfNatualNo(N);

	}

}
