package com.Question_2;

import java.util.Scanner;

public class AllStudents {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***---Enter Science Student Details---***");
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		System.out.println("Enter Addres : ");
		String address = sc.next();
		System.out.println("Enter Marks of Phy , Chem & Maths : ");
		int phy = sc.nextInt();
		int chem = sc.nextInt();
		int maths = sc.nextInt();
		
		ScienceStudent s = new ScienceStudent(name, address, phy, chem, maths);
		double ss = s.getPercentage();
		
		System.out.println("-----***---Enter History Student Details---***-----");
		System.out.println("Enter Student Name : ");
		String name1 = sc.next();
		System.out.println("Enter Addres : ");
		String address1 = sc.next();
		System.out.println("Enter Marks of History & Civics : ");
		int history = sc.nextInt();
		int civics = sc.nextInt();
		
		HistoryStudent h = new HistoryStudent(name1, address1, history, civics);
		double hs = h.getPercentage();
		
		System.out.println("=================================================");
		System.out.println("Percentage Of "+name+" is : "+ss);
		System.out.println("Percentage of "+name1+" is : "+hs);
		
	}

}

abstract class Student{

	String name;
	String address;
	
	abstract double getPercentage();
	
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}	
	
}


class  ScienceStudent extends Student{

	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	
	double getPercentage() {
		
		double per = (this.chemistryMarks+this.mathsMarks+this.physicsMarks)/3;
		return per;
	}	
}

class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name,address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public double getPercentage() {
		double percent = (double)(historyMarks + civicsMarks)/2;
		return percent;
	}
	
	
	
}