package com.Question_2;

public class Main {
	public static void main(String[] args) {
		Hosteller host1 = new Hosteller(123, "Ramesh", 10000, 4000);
		DayScholar daySchol1 = new DayScholar(453, "Raju", 10000, 2000);
		double remHostFee = host1.payFee(12000);
		double remScholFee = daySchol1.payFee(11000);
		System.out.println(remHostFee);
		System.out.println(remScholFee);
	}
}

class Student{
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		System.out.println(this.studId);
		System.out.println(this.studName);
		System.out.println(this.examFee);
	}
	
	public double payFee(double amt) {
		double rem = this.examFee - amt;
		return rem;
	}
}

class DayScholar extends Student{
	double transportFee;
	
	DayScholar(int id,String name, double fee, double transFee){
		this.examFee = fee;
		this.studId = id;
		this.studName = name;
		this.transportFee = transFee;
	}
	@Override
	public double payFee(double amt) {
		double rem = this.examFee + this.transportFee - amt;
		return rem;
	}
}
class Hosteller extends Student{
	double hostelFee;
	
	Hosteller(int id,String name, double fee, double hostFee){
		this.examFee = fee;
		this.studId = id;
		this.studName = name;
		this.hostelFee = hostFee;
	}
	@Override
	public double payFee(double amt) {
		double rem = this.examFee + this.hostelFee - amt;
		return rem;
	}
}
