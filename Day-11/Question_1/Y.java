package com.Question_1;

public interface Y {
	
	abstract void funY1();
	
	default void funY2(){
		System.out.println("Inside default method of Y");
	}
	
	static void funY3() {
		System.out.println("Inside Static method of Y");
	}

}
