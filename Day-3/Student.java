package com.masai;

import java.util.*;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is : "+roll);
		
		System.out.println("Name is : "+name);
		
		System.out.println("Marks is: "+marks);
		
	}
	
	public static void main(String[] args) {	
		
		Student s1 = new Student();
		
		s1.roll = 45;
		s1.name = "Vishal Singh";
		s1.marks = 90;
		s1.displayStudentDetails();
		
		Student s2 = s1;
		s2.roll = 12;
		s2.name = "Elon Musk";
		s2.marks = 98;
		s2.displayStudentDetails();

	}

}
