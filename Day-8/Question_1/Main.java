package com.Question_1;

public class Main{
	
	public static void main(String[] args){
		
		Bird b1 = new Parrot();
		//with this b1 reference call the fly method of
		//Parrot
		//and after downcasting this b1 reference to the
		//Parrot class object, call the sing method also
		
		b1.fly();
		Parrot p1 = (Parrot)b1;
        p1.sing();
		
	}
}
