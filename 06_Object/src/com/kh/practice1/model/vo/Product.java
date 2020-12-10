package com.kh.practice1.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public Product() {}
	
	public String getpName() { 
		return pName; 
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String info() {
		return "이름 : " + pName + ", 가격 : " + price + ", 제조사 : " + brand;
	}
	

}
