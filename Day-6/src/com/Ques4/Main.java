package com.Ques4;

public class Main {
	public static void main(String[] args) {
		int len = args.length;
		int fact = 1;
		if(len == 1) {
			for(int i = 1; i <= Integer.valueOf(args[0]); i++) {
				fact *= i;
			}
			System.out.println(fact);
		}
		else if(len == 2) {
			int absDiff = Math.abs(Integer.valueOf(args[0]) - Integer.valueOf(args[1]));
			for(int i = 1; i <= absDiff; i++) {
				fact *= i;
			}
			System.out.println(fact);
		}
		else if(len > 2) {
			System.out.println("Error");
		}
	}
}
