package com.kh.hw1.model.vo;

public class Product {
	
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tex;
	
	public Product() {}

	public Product(String productId, String pfoductName, String productArea, int price, double tex) {
		this.productId = productId;
		this.productName = pfoductName;
		this.productArea = productArea;
		this.price = price;
		this.tex = tex;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String pfoductName) {
		this.productName = pfoductName;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTex() {
		return tex;
	}

	public void setTex(double tex) {
		this.tex = tex;
	}
	
	public String info() {
		return String.format("%s %s %s %d %.2f\n", productId, productName, productArea, price, tex);
	}
	
	

}
