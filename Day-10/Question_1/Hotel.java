package com.Question_1;

public interface Hotel {
	
	void chickenBiryani();
	void masalaDosa();
	
}

class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		
		System.out.println("Chicken Biriyani from Taj Hotel");
	}

	@Override
	public void masalaDosa() {
		
		System.out.println("Masala Doas from Taj Hotel");
	}
	
	public void welcomeDrink(){
		
		System.out.println("Welcome Drink from the TajHotel");
	}
	
}

class RoadSideHotel implements Hotel{
	
	@Override
	public void chickenBiryani() {
		
		System.out.println("Chicken Biriyani from Road Side Hotel");
	}
	
	@Override
	public void masalaDosa() {
		
		System.out.println("Masala Dosa from Road Side Hotel");
	}
	
	
}