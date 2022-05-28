package com.Question_1;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	

	public int getRoll() {
		return roll;
	}	

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

	public void displayDetails() {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name (Don`t Use Space): ");
		setName(sc.next());
		
		System.out.println("Enter Roll No. : ");
		setRoll(sc.nextInt());
		
		System.out.println("Enter Marks : ");
		setMarks(sc.nextInt());
		
//		sc.close(); //Learning : Don`t Close scanner if you wanna use display method again.
		
		System.out.println("Student Name : "+ getName());
		System.out.println("Roll No. : "+ getRoll());
		System.out.println("Marks : "+ getMarks());
		System.out.println("Grade : "+ calculateGrade(getMarks()));
	}	
	
	
	private char calculateGrade(int marks) {
		
		if(marks >= 500) {
			return 'A';
		}
		else if (marks >= 400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
}

