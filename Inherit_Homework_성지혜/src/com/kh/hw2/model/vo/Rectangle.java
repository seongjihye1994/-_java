package com.kh.hw2.model.vo;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	public Rectangle() {}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("==== rectangle ====");
		super.draw();
		System.out.printf("면적 : %d\n", this.height * this.width);
		System.out.printf("둘레 : %d\n",  2 * (this.height + this.width));

	}
	
	
	

}
