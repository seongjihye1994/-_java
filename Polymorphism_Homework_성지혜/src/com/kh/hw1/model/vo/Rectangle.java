package com.kh.hw1.model.vo;

public class Rectangle implements IShape {
	
	private double width;
	private double height;
	
	public Rectangle() {}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	@Override
	public double area() { 
		System.out.print("Rectangle의 면적 : ");
		double result = this.width * this.height;
		return result;
	}

	@Override
	public double perimeter() { 
		System.out.print("Rectangle의 둘레 : ");
		double result = this.width * 2 + this.height * 2;
		return result;
	}	

}
