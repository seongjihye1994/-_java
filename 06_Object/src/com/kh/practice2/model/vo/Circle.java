package com.kh.practice2.model.vo;

public class Circle {
	
	public static final double PI = 3.14;
	private static int radius = 5;
	
	public Circle() {}
	
	public void incrementRadius() {
		System.out.println("반지름 1 증가 : " + ++radius);
	}
	
	// 둘레
	public void getAreaOfCircle() {
		System.out.printf("원의 둘레 : %.2f\n", 2 * radius * PI);
	}
	
	// 넓이
	public void getSizeOfCircle() {
		System.out.printf("원의 넓이 : %.2f\n", radius * radius * PI);		
	}
	
	

}
