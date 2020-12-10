package com.kh.test.fruit.model.vo;

public class Fruit {
	
	private String name;
	private String falvor;
	
	public Fruit() {}

	public Fruit(String name, String falvor) {
		super();
		this.name = name;
		this.falvor = falvor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFalvor() {
		return falvor;
	}

	public void setFalvor(String falvor) {
		this.falvor = falvor;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", falvor=" + falvor + "]";
	}
	
	

}
