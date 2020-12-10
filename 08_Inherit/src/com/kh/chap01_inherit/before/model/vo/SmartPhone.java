package com.kh.chap01_inherit.before.model.vo;

public class SmartPhone {
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	private String mobilAgency; // Ελ½Ε»η
	
	public SmartPhone() {}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobilAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobilAgency = mobilAgency;
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

	public String getMobilAgency() {
		return mobilAgency;
	}

	public void setMobilAgency(String mobilAgency) {
		this.mobilAgency = mobilAgency;
	}
	
	public String info() {
		return String.format("brand : %s, pCode : %s, pName : %s, price : %d, mobileAgency : %s\n", brand, pCode, pName, price, mobilAgency);
	
	}
	
	
	
	

}
