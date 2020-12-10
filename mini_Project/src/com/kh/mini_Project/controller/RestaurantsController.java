package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.mini_Project.model.Restaurant;

public class RestaurantsController {
	
	//스캐너로 아래에서 검색 리스트 뽑기
		Scanner sc = new Scanner(System.in);
		
		//1.ArrayList로 지점 리스트 출력
		ArrayList<Restaurant> rList = new ArrayList<>();
		//ArrayList<ATM> aList = new ArrayList<>();
		 
		public ArrayList<Restaurant> restaurantListReader() {
			rList.add(new Restaurant("을지다락 강남","서울 강남구 강남대로 96길2층", "0507-1343-9474","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("루위" ,"서울 강남구 도산대로 211 동현빌딩 1F","0507-1436-0018","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("미월당 가로수길본점","서울 강남구 강남대로156길 32 1층","02-545-8250","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("마초쉐프강남본점","서울 강남구 강남대로98길 16 파빌리온빌딩 6층","0507-1392-8886","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("공돌이부엌압구정로데오점","서울 강남구 선릉로157길25 2층","02-511-5982,","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("호족반","서울 강남구언주로164길39","0507-1399-3353,","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("벙커컴퍼니압구정점","서울강남구언주로167길23","0507-1357-1456","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("서강쇠떡볶이","서울 강남구 선릉로153길18","0507-1442-3312","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("갓잇도산공원점","서울 강남구언주로164길24아크로스빌1층","02-511-9451","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("온기정","서울강남구압구정로4길13-9 1층","02-545-7940","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("로바타라이브라","서울강남구선릉로148길52지하1층","0507-1324-8005","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("알라보 강남점 ","서울 강남구 테헤란로129 강남N타워1층 ","0507-1318-0939","11:00-21:00","image.PNG"));
			rList.add(new Restaurant("천미미","서울 강남구 강남대로152길11번지 ","0507-1304-7202","11:00-20:00","image.PNG")); 
			
			return rList;
		}
		/*public void ascRestaurantName() { 
			for(int i=0; i < rList.size(); i++) {
				System.out.println(rList.get(i));
			}
		}*/
	
		//검색창을 이용하여 내가 원하는 목록만 출력하게 만들기
		public void searchFinancialList() {
			
			System.out.print("음식점을 검색하세요 : ");
			String keyword = sc.nextLine();
			for(int j=0; j <rList.size(); j++) {
				if(rList.get(j).getfName().contains(keyword)) {
					System.out.println(rList.get(j));
				}
			}
		}
		
		
		// Restaurant 즐겨찾기 로직
		/*public ArrayList<Restaurant> addKeepRestaurant(String searchRestaurant) {
			
			ArrayList<Restaurant> addRestaurantList = new ArrayList<Restaurant>();
			Restaurant restaurant = new Restaurant();
			
			for (int i = 0; i < rList.size(); i++) {
					if (rList.get(i).getfName().contains(searchRestaurant)) {
						System.out.println(rList.get(i));
						addRestaurantList.add(rList.get(i));
					}	
			}
			return addRestaurantList;
		}*/
		
		
}
