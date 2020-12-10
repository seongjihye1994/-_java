package com.kh.chap03_map.part01_hashMap.model.vo;

public class Car {
	private String manuFacturer;
	private double fuelEfficienty;
	
	public Car() {}

	public Car(String manuFacturer, double fuelEfficienty) {
		super();
		this.manuFacturer = manuFacturer;
		this.fuelEfficienty = fuelEfficienty;
	}

	public String getManuFacturer() {
		return manuFacturer;
	}

	public void setManuFacturer(String manuFacturer) {
		this.manuFacturer = manuFacturer;
	}

	public double getFuelEfficienty() {
		return fuelEfficienty;
	}

	public void setFuelEfficienty(double fuelEfficienty) {
		this.fuelEfficienty = fuelEfficienty;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Double.doubleToLongBits(fuelEfficienty) != Double.doubleToLongBits(other.fuelEfficienty))
			return false;
		if (manuFacturer == null) {
			if (other.manuFacturer != null)
				return false;
		} else if (!manuFacturer.equals(other.manuFacturer))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fuelEfficienty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((manuFacturer == null) ? 0 : manuFacturer.hashCode());
		return result;
	}

	
	@Override
	public String toString() {
		return "Car [manuFacturer=" + manuFacturer + ", fuelEfficienty=" + fuelEfficienty + "]";
	}
	
	
	
	
	

}
