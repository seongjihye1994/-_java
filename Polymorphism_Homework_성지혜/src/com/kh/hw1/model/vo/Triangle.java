package com.kh.hw1.model.vo;

public class Triangle implements IShape {

	private double base;
	private double height;
	
	public Triangle() {}
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double hypotenuse() {
		System.out.print("Triangle의 빗변 : ");
		double result = Math.sqrt(this.base * this.base + this.height * this.height);
		return result;
	}

	@Override
	public double area() {
		System.out.print("Triangle의 면적 : ");
		double result = (this.base * this.height) / 2;
		return result;
	}

	@Override
	public double perimeter() {
		System.out.print("Triangle의 둘레 : ");
		double result = this.base + this.height + Math.sqrt(this.base * this.base + this.height * this.height);
		return result;
	}

}
