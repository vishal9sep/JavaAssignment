package com.ques5;

public class Shapes {
	
	public static void main(String[] args) {
		Shapes shape = new Shapes();
		shape.area(new Circle(12));
		shape.area(new Rectangle(8,4));
		shape.area(new Square(16));	 
	}
	
	public void area(Circle circle) {
		System.out.println("Area of the circle is " + Math.PI*circle.radius*circle.radius);
	}
	
	public void area(Rectangle rectangle) {
		System.out.println("Area of the rectangle is "+rectangle.breadth*rectangle.length);
	}
	
	public void area(Square square) {
		System.out.println("Area of the square is " + square.side * square.side);
	}

}

class Circle{
	int radius;
	
	Circle(int r){
		this.radius = r;
	}
}

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int l, int b){
		this.length = l;
		this.breadth = b;
	}
}

class Square{
	int side;
	
	Square(int s){
		this.side = s;
	}
}