package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Culture extends Facility {
	private String cName;
	private String cAddress;
	private String cTelenumber;
	private String cImagePath;

	public Culture() {}
	
	public Culture(String cName, String cAddress, String cTelenumber, String cImagePath) {
		super();
		
		this.cName = cName;
		this.cAddress = cAddress;
		this.cTelenumber = cTelenumber;
		this.cImagePath = cImagePath;
	
	}
	
	

	public Culture(String type, String name, String address, String phone, String imagePath) {
		super(type, name, address, phone, imagePath);
		// TODO Auto-generated constructor stub
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcTelenumber() {
		return cTelenumber;
	}

	public void setcTelenumber(String cTelenumber) {
		this.cTelenumber = cTelenumber;
	}

	public String getcImagePath() {
		return cImagePath;
	}

	public void setcImagePath(String cImagePath) {
		this.cImagePath = cImagePath;
	}
	
	
	
	@Override
	public String toString() {
		return "Culture [cName=" + cName + ", cAddress=" + cAddress + ", cTelenumber=" + cTelenumber + ", cImagePath="
				+ cImagePath + "]";
	}

		
	
	
	
}
