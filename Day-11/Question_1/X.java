package com.Question_1;

public interface X {
	
	abstract void funX1();
	
	default void funX2(){
		System.out.println("Inside default method of X");
	}
	
	static void funX3() {
		System.out.println("Inside Static method of X");
	}

}
