package com.Question_3;

public class Main {
	
	public static void main(String[] args) {
		
		Area area = new Area();
		int circleArea = area.circleArea(10);
		int squareArea = area.squareArea(20);
		int rectangleArea = area.rectangleArea(30,40);
		
		System.out.println("Area Of Circle is : "+circleArea);
		System.out.println("Area Of Square is : "+squareArea);
		System.out.println("Area of Rectangle is : "+rectangleArea);
	}
}

abstract class Shape {
	
	public abstract int rectangleArea(int length, int breadth);
	public abstract int squareArea(int side);
	public abstract int circleArea(int radius);
}

class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return (int)(Math.PI*radius*radius);
	}
	
}
