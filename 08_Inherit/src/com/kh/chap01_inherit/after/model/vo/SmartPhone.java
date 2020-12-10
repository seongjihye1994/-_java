package com.kh.chap01_inherit.after.model.vo;

public class SmartPhone extends Product {
	
	private String mobileAgency;
	
	public SmartPhone() {}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	public String getMobilAgency() {
		return mobileAgency;
	}

	public void setMobilAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String info() {
		return super.info() + ", mobileAgency : " + mobileAgency;
	}
	
	@Override
	public void print() {
		System.out.println("³ª´Â SmartPhone °´Ã¼¾ß!");
	}
	
	
	
	

}
