package com.kh.chap01_inherit.model.vo;

public class Ship extends Vehicle {
	
	private int propeller; // 프로펠러 개수
	
	public Ship() {}

	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String info() {
		return "Ship [" + super.info() + ", propeller=" + propeller + "]";
	}
	
	@Override
	public void howToMove() {
		System.out.println("항해한다.");
	}
	
	
	
	

	
	
	

}
