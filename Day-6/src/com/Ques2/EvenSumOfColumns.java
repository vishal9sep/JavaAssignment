package com.Ques2;

public class EvenSumOfColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<3; i++) {
			int s = 0;
			for(int j=0; j<3; j++) {
				if(arr[j][i] % 2 == 0) {
					s += arr[j][i];
				}
			}
			System.out.println(s);
		}
	}
}
