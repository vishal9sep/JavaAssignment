package com.Ques2;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		
		System.out.println("Course ID : "+courseId);
		
		System.out.println("Course Name : "+ courseName);
		
		System.out.println("Course Fee : "+ courseFee);
	}
	
	static void authenticate(String username,String password) {
		
		if(username == "Admin" && password == "1234") {
			Course c1 = new Course();
			
			c1.courseId = 111;
			c1.courseName = "Java-Backend Course";
			c1.courseFee = 3000;
			c1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String userName = scn.next();
		System.out.println("Enter Password : ");
		String pwd = scn.next();
		
//		System.out.println(userName + " "+ pwd);
		Course.authenticate(userName, pwd);
		scn.close();
	}

}
