package com.Question_1;

public interface Z extends X,Y  {

	@Override
	default void funX2() {
		// TODO Auto-generated method stub
		X.super.funX2();
		System.out.println("Default method of X in Z class");
	}
}
