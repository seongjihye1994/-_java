package com.kh.chap01_inherit.model.vo;

public class Airplane extends Vehicle {
	
	private int tire; // Ÿ�̾� ����
	private int wing; // ���� ����
	
	public Airplane() {}

	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
		
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	@Override
	public String info() {
		return "Ariplane [" + super.info() + ", tire=" + tire + ", wing=" + wing + "]";
	}

	@Override
	public void howToMove() {
		System.out.println("���ư���.");
	}
	
	

	

	
	
	
	

}
