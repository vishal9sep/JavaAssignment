package com.masai;

import java.util.Scanner;

public class OddEven {
	
	void checkOddEven(int x){
		if(x < 0) {
			System.out.println("Error");
		}
		else if(x%2 != 0) {
			System.out.println(x);
		}
		else {
			int d = x/10;
			int ans = d*10 + 10;
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n = in.nextInt();
		OddEven obj = new OddEven();
		obj.checkOddEven(n);

	}

}
