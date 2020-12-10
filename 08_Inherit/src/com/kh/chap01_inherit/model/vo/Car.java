package com.kh.chap01_inherit.model.vo;

public class Car extends Vehicle {
	
	private int tire; // 타이어 개수

	public Car() {}
	
	
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}



	public int getTire() {
		return tire;
	}



	public void setTire(int tire) {
		this.tire = tire;
	}



	@Override
	public String info() {
		return "Car [" + super.info() + ", tire=" + tire + "]";
	}

	@Override
	public void howToMove() {
		System.out.println("달린다.");
	}
	
	



	
	
	

}
