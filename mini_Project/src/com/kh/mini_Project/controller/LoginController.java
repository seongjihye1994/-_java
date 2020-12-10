package com.kh.mini_Project.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.mini_Project.model.Bank;
import com.kh.mini_Project.model.BookAndLibrary;
import com.kh.mini_Project.model.Exhibit;
import com.kh.mini_Project.model.HobbyAndHealth;
import com.kh.mini_Project.model.Hotel;
import com.kh.mini_Project.model.Movie;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.model.Restaurant;

public class LoginController {

	public Person loginCheck(String inputId, char[] inputPwd) {
		Person loginUser = null;
		
		FileInputStream fis = null;
		
		ArrayList<Person> userList = new ArrayList<>();
		
		File file = new File("user.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String txtRead;
		    String userArray[] = new String[4];
		    while ((txtRead = br.readLine()) != null) {
		    	Person user = new Person();
		        userArray = txtRead.split(", ");
		        user.setId(userArray[0]);
		        user.setPw(userArray[1]);
		        user.setName(userArray[2]);
		        user.setAge(Integer.parseInt(userArray[3]));
		        user.setFavoriteHotel(new ArrayList<Hotel>());
		        user.setFavoriteBank(new ArrayList<Bank>());
		        user.setFavoriteRestaurant(new ArrayList<Restaurant>());
		        user.setFavoriteBookAndLibrary(new ArrayList<BookAndLibrary>());
		        user.setFavoriteExhibit(new ArrayList<Exhibit>());
		        user.setFavoriteHobbyAndHealth(new ArrayList<HobbyAndHealth>());
		        user.setFavoriteMovie(new ArrayList<Movie>());
		        
		        userList.add(user);
		    }
		    
		    for(Person item : userList) {
		    	if(item.getId().equals(inputId) && item.getPw().length() == inputPwd.length) {
		    		loginUser = item;
		    	}
		    }
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return loginUser;
		
	}
	
	

}
