package com.masai;

import java.util.*;

public class PrimeFactors {
	
	static void primeFact(int n) {
		while( n%2 == 0)
	      {
	          n = n / 2;
	          System.out.print(2 + " ");
	      }
		  for(int i=3; i <= n; i+=2)
		  {
		      while( n%i == 0)
		      {
		          n = n / i;
		          System.out.print(i + " ");
		      }
		  }
	}

	public static void main(String[] args) {
		
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter a Number (2-100) : ");
		  int n = scn.nextInt();
		  
		  primeFact(n);
	}

}
