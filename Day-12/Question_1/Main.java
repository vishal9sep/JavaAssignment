package com.Question_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a paragraph");
		String userPara = input.nextLine();
		int count = 0;
		Pattern pattern = Pattern.compile("Java");
		Matcher match = pattern.matcher(userPara);
		while(match.find()) {
			count++;
			System.out.println(match.start() + "-------" + match.end() + "-------" + match.group());
		}
		
		System.out.println("Total number of occurencies of Java - " + count);
	}
}
