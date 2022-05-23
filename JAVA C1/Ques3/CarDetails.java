package com.Ques3;

public class CarDetails {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.printDetails();
		System.out.println("====================================");
		Car car2 = new Car("Verna","Hyundai","White",10000,110,"Hyundai");
		car2.printDetails();
	}
}

class Car{
	private String model;
	private String companyName;
	private String color;
	private Engine engine;
	
	Car(){
		this.engine = new Engine();
	}
	
	Car(String m, String n, String col,int rpm, int p, String man){
		this.model = m;
		this.companyName = n;
		this.color = col;
		this.engine = new Engine();
		this.engine.rmp = rpm;
		this.engine.Power = p;
		this.engine.manufacturer = man;
		this.engine.enableTurbo();
	}
	
	public void printDetails() {
		System.out.println("Car Model : " + this.model);
		System.out.println("Car companyName : " + this.companyName);
		System.out.println("Car color : " + this.color);
		System.out.println("Car RPM : " + this.engine.rmp);
		System.out.println("Car power : " + this.engine.Power);
		System.out.println("Car Engine Manufacture : " + this.engine.manufacturer);
		System.out.println("Car Has Turbo : " + this.engine.hasTurbo);
	}
}

class Engine{
	int rmp;
	int Power;
	String manufacturer;
	Boolean hasTurbo = false;
	
	
	public void enableTurbo() {
		this.hasTurbo = true;
	}
	
}