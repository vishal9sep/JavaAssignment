package Question_2;

import java.util.Scanner;

public class Demo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Student");
        int n=sc.nextInt();
        Student[] stude=new Student[n];
      
        for(int i=1;i<=n;i++) {
         	System.out.println("Enter Student "+i+" Roll");
         	int roll=sc.nextInt();
         	
        	System.out.println("Enter Student "+i+" Name");
        	String name=sc.next();
        	
        	System.out.println("Enter Student "+i+" Address");
         	String address=sc.next();
         	
        	System.out.println("Enter Student "+i+"Marks");
         	int marks=sc.nextInt();
         	
         	 Student g=new Student(roll,name,address,marks);
         	  stude[i-1]=g;
         	
        }
        int total=0;
        for(int i=0;i<n;i++) {
        	System.out.println(stude[i]);
            total+=  stude[i].marks;
        }
        System.out.println("Total avg"+" "+total/n);
	}

}



