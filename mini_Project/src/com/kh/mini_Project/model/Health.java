package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Health extends Facility {

	private String name;
	private String address;
	private String telenumber;
	private String imagePath;
	private ArrayList<Health> healthLikes;


	public Health() {
	}

	public Health(String name, String address, String telenumber, String imagePath) {
		super();

		this.name = name;
		this.address = address;
		this.telenumber = telenumber;
		this.imagePath = imagePath;

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

	public String getTelenumber() {
		return telenumber;
	}

	public void setTelenumber(String telenumber) {
		this.telenumber = telenumber;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public void setHealthLikes(ArrayList<Health> healthLikes) {
		this.healthLikes = healthLikes;
	}

	@Override
	public String toString() {
		return name+ address + telenumber + imagePath;
	}

	public void addHealthListPrint() {
		 System.out.println("=== ¡Ò∞‹√£±‚ ===");
	      for(int i=0; i < healthLikes.size(); i++) {
	         System.out.println(healthLikes.get(i).toString());
	      }
	}

	
	
}