package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Movie extends Facility {
	
	private String name;
	private String address;
	private String telenumber;
	private String imagePath;
	private ArrayList<Movie> movieLikes;


	public Movie() {
	}

	public Movie(String name, String address, String telenumber, String imagePath) {
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
	
	public void setMovieLikes(ArrayList<Movie> movieLikes) {
		this.movieLikes = movieLikes;
	}

	@Override
	public String toString() {
		return name; //+ " " + address +  " " + telenumber +  " " + imagePath;
	}


	public void addMovieListPrint() {
		 System.out.println("=== ¡Ò∞‹√£±‚ ===");
	      for(int i=0; i < movieLikes.size(); i++) {
	         System.out.println(movieLikes.get(i).toString());
	      }
	}
	
	
	 

	
	
}