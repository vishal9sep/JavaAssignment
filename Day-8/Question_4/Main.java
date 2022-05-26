package com.Question_4;

public class Main {
	
	public static void main(String[] args){
		//create an array of Animal class with size 3
		//initialize all 3 elements of this Animal class
		//with //Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		
		Animal[] arr = new Animal[3];
		
		arr[0] = new Dog();
		arr[1] = new Cat();
		arr[2] = new Tiger();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].eat();
			arr[i].walk();
			arr[i].makeNoise();
			System.out.println("=====================================");
		}		
	}
}
