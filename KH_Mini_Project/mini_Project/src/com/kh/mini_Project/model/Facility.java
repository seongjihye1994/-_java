package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Facility {
	
	private String type;
	private String name;
	private String address;
	private String phone;
	private String imagePath;
	
	public static ArrayList<Facility> list = new ArrayList<>();
	
	public Facility() {}

	public Facility(String type, String name, String address, String phone, String imagePath) {
		super();
		this.type = type;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.imagePath = imagePath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public static ArrayList<Facility> getList() {
		return list;
	}

	public static void setList(ArrayList<Facility> list) {
		Facility.list = list;
	}

	@Override
	public String toString() {
		return "Facility [type=" + type + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", imagePath=" + imagePath + "]";
	}

	public static void add(Facility facility) {
		list.add(facility);
	}
	


}
