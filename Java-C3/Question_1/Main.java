package com.Question_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of elements in the array");
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			System.out.println("Enter the elements in the array");
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter the index of the array element you want to access;");
			int x = sc.nextInt();
			sc.close();
			System.out.println("The array element at index "+N+" = "+arr[x]);
			
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch (NumberFormatException  nfe) {
			System.out.println("java.lang.NumberFormatException");
		}		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
