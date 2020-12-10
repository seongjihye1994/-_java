package com.kh.hw1.model.vo;

public class Circle implements IShape {

	private double PI;
	private double radius;
	
	public Circle() {}

	public Circle(double pI, double radius) {
		super();
		PI = pI;
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double area() { 
		System.out.print("Circle의 면적 : ");
		double result = PI * this.radius * this.radius;
		return result;
	}

	@Override
	public double perimeter() {
		System.out.print("Circle의 둘레 : ");
		double result = 2 * PI * this.radius;
		return result;
	}

	
	
}
