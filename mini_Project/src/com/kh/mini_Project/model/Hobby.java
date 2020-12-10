package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Hobby extends Facility {

	private String name;
	private String address;
	private String telenumber;
	private String imagePath;
	private ArrayList<Hobby> hobbyLikes;


	public Hobby() {
	}

	public Hobby(String name, String address, String telenumber, String imagePath) {
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
	
	public void setHobbyLikes(ArrayList<Hobby> hobbyLikes) {
		this.hobbyLikes = hobbyLikes;
	}

	@Override
	public String toString() {
		return name+ address + telenumber + imagePath;
	}

	public void addHobbyListPrint() {
		 System.out.println("=== ¡Ò∞‹√£±‚ ===");
	      for(int i=0; i < hobbyLikes.size(); i++) {
	         System.out.println(hobbyLikes.get(i).toString());
	      }
	}

	

}