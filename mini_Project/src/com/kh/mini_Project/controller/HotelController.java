package com.kh.mini_Project.controller;

import java.util.ArrayList;

import com.kh.mini_Project.dao.HotelDao;
import com.kh.mini_Project.model.Hotel;
import com.kh.mini_Project.model.Person;

public class HotelController {
	private ArrayList<Hotel> list = new ArrayList<>();
	private HotelDao hd = new HotelDao();
	
	public HotelController() {
		this.initialize();
	}
	
	public ArrayList<Hotel> selectList(){
		return list;
	}
	
	public ArrayList<Hotel> searchList(String input) {
		ArrayList<Hotel> search = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().contains(input)) {
				search.add(list.get(i));
			} else {
				System.out.println("검색하신 호텔이 없습니다.");
			}
		}
		return search; 
	}

	/*public ArrayList<Hotel> addFavorite() {
		Person person = new Person();
		System.out.println("Hotel즐겨찾기");
		ArrayList<Hotel> likeHotelList = addKeepHotel();
		
		// Health즐겨찾기 -> Person 객체에 추가
		person.setFavoriteHotel(likeHotelList);
		System.out.println("person 즐겨찾기 넣음");
		person.printLikeHotel();
		
		return likeHotelList;
	}*/
	
	public ArrayList<Hotel> loadDetail() {	
		ArrayList<Hotel> detail = new ArrayList<>();

		for(int i = 0; i < list.size(); i++) {
				detail.add(list.get(i));
				
		}
		return detail;
		
	}
	
	public void addList(Hotel hotel) {
		list.add(hotel);
		
	}
	public void loadHotelList() {
		list = hd.fileOpen();
	}
	
	public void saveHotelList() {
		hd.fileSave(list);
	}

	
	private void initialize() {
		// 호텔리스트 저장
		Hotel[] hotel = new Hotel[15];
		// 등급 변수
		String one = "★";
		String two = "★★";
		String thr = "★★★";
		String fou = "★★★★";
		String fiv = "★★★★★";
		// 체크인,체크아웃 시간 변수
		String ck1 = "체크인 15:00 / 체크아웃 12:00";
		String ck2 = "체크인 15:00 / 체크아웃 11:00";
		String ck3 = "체크인 14:00 / 체크아웃 12:00";
		// 주차 변수
		String park1 = "주차(1일) 15,000원";
		String park2 = "주차(1일) 10,000원";
		String park3 = "주차(1일) 5,000원";
		String park4 = "주차(1일) 무료";
		String park5 = "주차 불가";
		// 5
		hotel[0] = new Hotel("안다즈 서울 강남","292,500",fiv,"서울특별시 강남구 논현로 854","02-2193-1234",ck1,park1,"10");
		hotel[1] = new Hotel("인터컨티넨탈 그랜드 파르나스","192,000",fiv,"서울특별시 강남구 삼성1동 테헤란로 521","02-555-5656",ck1,park4,"3");
		hotel[2] = new Hotel("JW 메리어트 호텔 서울","280,000",fiv,"서울특별시 강남구 서초구 신반포로 176","02-6282-6262",ck1,park1,"5");
		hotel[3] = new Hotel("파크 하얏트 서울","348,750",fiv,"서울특별시 강남구 테헤란로 606"," 02-2016-1234",ck2,park2,"2");
		// 4
		hotel[4] = new Hotel("글래드 강남 코엑스 센터","80,700",fou,"서울특별시 강남구 테헤란로 610","02-6474-5000",ck1,park4,"6");
		hotel[5] = new Hotel("신라 스테이 삼성","148,000",fou,"서울특별시 강남구 영동대로 506","02-2175-9000",ck1,park2,"5");
		hotel[6] = new Hotel("오클라우드 호텔 강남","300,000",fou,"서울특별시 서초구 서초동 1303-14","1899-9994",ck2,park1,"7");
		hotel[7] = new Hotel("글래드라이브 호텔","196,000",fou,"서울특별시 강남구 봉은사로 223","02-6177-5000",ck3,park4,"8");
		// 3
		hotel[8] = new Hotel("도미인 서울 강남","240,000",thr,"서울특별시 강남구 역삼동 603-1","02-548-5489",ck1,park2,"1");
		hotel[9] = new Hotel("호텔 안테룸 서울","228,600",thr,"서울특별시 강남구 신사동 도산대로 153","02-542,2300",ck1,park2,"3");
		hotel[10] = new Hotel("신라스테이 서초","108,300",thr,"서울특별시 서초구 서초동 효령로 42","02-2219,9000",ck2,park3,"5");
		// 2,1
		hotel[11] = new Hotel("라비타 호텔","57,000",two,"서울특별시 강남구 영동대로 712","02-545-0015",ck2,park1,"8");
		hotel[12] = new Hotel("아이엠티 호텔 서초","68,000",two,"서울특별시 서초구 서초 3동 효령로 53길 49","02-522-2838",ck3,park2,"8");
		hotel[13] = new Hotel("강남 썬시티 게스트하우스","47,800",one,"서울특별시 강남구 논현동 강남대로 146길 7-12","02-511-7422",ck1,park5,"11");
		hotel[14] = new Hotel("호텔 소설","111,300",one,"서울특별시 서초구 서초동 반포대로 14길 53","02-507- 0505",ck2,park4,"5");
		
		for(int i = 0; i < hotel.length; i++) {
			this.addList(hotel[i]);
		}
		
		this.saveHotelList();
		
	}
	
	// Hotel 즐겨찾기 로직
		public ArrayList<Hotel> addKeepHotel(ArrayList<Hotel> searchHotel) {
			ArrayList<Hotel> addHotelList = searchHotel;
			return addHotelList;
		}	


	
	

	
	
}