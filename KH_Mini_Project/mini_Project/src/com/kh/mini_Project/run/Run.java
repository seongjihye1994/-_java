package com.kh.mini_Project.run;

import com.kh.mini_Project.controller.Contoller;
import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.Person;
import com.kh.mini_Project.view.View;

public class Run {
	public static void main(String[] args) {
		
		View v  = new View();
		v.ShowMyPage();
		
		Contoller c = new Contoller();
		c.loadFacilitiesFromFile();
		
		Person p = new Person("ȫ�浿", 25, "id", "pwd");
		Facility favorite = Facility.list.get(0);
		p.keepMyFavoriteThings(favorite);
		
		for(Facility f : p.getFavoriteList()) {
			System.out.println(f.toString());
		}
	}
	

}
