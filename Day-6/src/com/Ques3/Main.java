package com.Ques3;

import java.util.Arrays;

public class Main{
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
		int[] ansArr = new int[0];
		for(int i: inputArray) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				ansArr = Arrays.copyOf(ansArr, ansArr.length + 1);
				ansArr[ansArr.length - 1] = i;
			}
		}
		return ansArr;
	}
	public static void main(String[] args){
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,15};
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
		Main obj = new Main();
		int[] result = obj.findAndReturnPrimeNumbers(arr);
		if(result.length == 0) {
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			for(int i: result) {
				System.out.println(i);
			}
		}
		
	}
}
