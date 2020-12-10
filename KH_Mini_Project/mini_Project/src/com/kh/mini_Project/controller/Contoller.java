package com.kh.mini_Project.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import com.kh.mini_Project.model.Facility;

public class Contoller {
	
	public void loadFacilitiesFromFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("facilities.txt"))) {

			String value = "";
			while((value = br.readLine()) != null) {
				
				StringTokenizer st = new StringTokenizer(value, ",");
				
				Facility facility = new Facility(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
				Facility.add(facility);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
