package com.Question_1;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Manager mng1 = new Manager();
		emp1.setName("Aman Jha");
		emp1.setAddress("Bihar");
		emp1.setAge(22);
		emp1.setPhoneNumber("9012345678");
		emp1.setSalary(80000);
		mng1.setName("Atul");
		mng1.setAddress("Delhi");
		mng1.setAge(30);
		mng1.setPhoneNumber("912345667");
		mng1.setSalary(300000);
		
		System.out.println("Details of employee are : ");
		System.out.println("---------------------------------------");
		System.out.println("Name : " + emp1.getName());
		System.out.println("Age : " + emp1.getAge());
		System.out.println("Mobile : " + emp1.getPhoneNumber());
		System.out.println("Address : " + emp1.getAddress());
		System.out.println("Salary : " + emp1.getSalary());
		System.out.println("                                         ");
		System.out.println("*****************************************");
		System.out.println("Details of the managaer are : ");
		System.out.println("---------------------------------------");
		System.out.println("Name : " + mng1.getName());
		System.out.println("Age : " + mng1.getAge());
		System.out.println("Mobile : " + mng1.getPhoneNumber());
		System.out.println("Address : " + mng1.getAddress());
		System.out.println("Salary : " + mng1.getSalary());
	}
}


class Member{
	String Name;
	int Age;
	String PhoneNumber;
	String Address;
	double Salary;
	
	void printSalary() {
		System.out.println(Salary);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
}

class Employee extends Member{
	String Specialisation;
	String Department;
}

class Manager extends Member{
	String Specialisation;
	String Department;
}