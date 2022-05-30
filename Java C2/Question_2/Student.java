package Question_2;

public class Student {
	
		
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}


	
	public void display() {
		
		System.out.println("Student NAME : "+ name);
		System.out.println("Roll no: "+ roll);
		System.out.println("Address : "+ address);
		System.out.println("Marks : "+marks);
		
	}
	public void averageStudent() {
		
	}
	
}
