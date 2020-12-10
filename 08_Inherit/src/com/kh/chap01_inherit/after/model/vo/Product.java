package com.kh.chap01_inherit.after.model.vo;

// �ڽ�Ŭ������ �������� ������ ��Ҹ� �����Ͽ� �θ� Ŭ������ ������.
public class Product {
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {}

	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

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
	
	public String info() {
		return String.format("brand : %s, pCode : %s, pName : %s, price : %d", brand, pCode, pName, price);
	
	}
	
	public void print() {
		System.out.println("���� Product ��ü��!");
	}
	
	

}
