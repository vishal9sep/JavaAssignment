package com.Question_2;

public class Main{
	
	public static void main(String[] args) {
		Loan loan = Loan.generateLoanClass();
		Employee emp1 = new PermanentEmployee(123, "Ramesh", 30000);
		Employee emp2 = new TemporaryEmployee(126, "Rakesh", 8,100);
		double loan1 = loan.calculateLoanAmount(emp1);
		double loan2 = loan.calculateLoanAmount(emp2);
		double loan3 = loan.calculateLoanAmount(null);
	}
}

abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	abstract void calculateSalary();
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	
}

class Loan {
	
	private Loan(){
		
	}
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount = 0;
		if(employeeObj != null) {
			if(employeeObj instanceof PermanentEmployee) {
				loanAmount = employeeObj.getSalary()*0.15;
			}
			else if(employeeObj instanceof TemporaryEmployee) {
				loanAmount = employeeObj.getSalary()*0.10;
			}
			System.out.println(loanAmount);
		}
		else {
			System.out.println("value is null");
		}
		
		return loanAmount;
	}
	
	public static Loan generateLoanClass() {
		Loan l = new Loan();
		return l;
	}
}


class PermanentEmployee extends Employee{
	private double basicPay;

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		calculateSalary();
	}

	@Override
	void calculateSalary() {
		double finalPay = basicPay - basicPay*0.12;
		setSalary(finalPay);
	}
	
	
	
}

class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hourlyWages = hourlyWages;
		this.hoursWorked = hoursWorked;
		calculateSalary();
	}
	
	@Override
	void calculateSalary() {
		double salary = this.hourlyWages * this.hoursWorked;
		setSalary(salary);
	}
	
	
}