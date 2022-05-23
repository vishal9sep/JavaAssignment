package com.Ques2;

import java.util.*;

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
			
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter Course ID");
			c1.courseId = scn.nextInt();
			System.out.println("Enter Course Name");
			c1.courseName = scn.next();
			System.out.println("Enter Course Fee");
			c1.courseFee = scn.nextInt();
			c1.displayCourseDetails();
			scn.close();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course.authenticate("Admin", "1234");
		System.out.println("===========================");
		Course.authenticate("user", "4231");
	}

}
