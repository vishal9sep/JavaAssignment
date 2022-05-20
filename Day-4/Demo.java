package com.masai;

public class Demo {
	
	public Demo() {
		this(0);
		System.out.println("Inside Zero Argument Consturctor");
	}
	public Demo(String S){
		this(5.42f);
		System.out.println("Inside String Argument Constructor");
	}
	public Demo(int n) {
		this("string");
		System.out.println("Inside int Argument Constructor");
	}
	public Demo(float f) {
		System.out.println("Inside float Argument Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
	}

}
