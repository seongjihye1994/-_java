package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.mini_Project.model.Book;
import com.kh.mini_Project.model.BookAndLibrary;
import com.kh.mini_Project.model.Exhibit;
import com.kh.mini_Project.model.Health;
import com.kh.mini_Project.model.Hobby;
import com.kh.mini_Project.model.HobbyAndHealth;
import com.kh.mini_Project.model.Library;
import com.kh.mini_Project.model.Movie;

public class CultureController {

	Scanner sc = new Scanner(System.in);

	ArrayList<Movie> movieList = new ArrayList<>();
	ArrayList<Book> bookList = new ArrayList<>();
	ArrayList<Library> libraryList = new ArrayList<>();
	ArrayList<Exhibit> exhibitList = new ArrayList<>();
	ArrayList<Hobby> hobbyList = new ArrayList<>();
	ArrayList<Health> healthList = new ArrayList<>();
	ArrayList<HobbyAndHealth> hobbyAndHealthList = new ArrayList<>();
	ArrayList<BookAndLibrary> bookAndLibraryList = new ArrayList<>();
	

	public ArrayList<Movie> movieListReader() { // # 데이터 추가

		// movieList
		
		movieList.add(new Movie("CGV 강남", "서울 강남구 강남대로 438 스타플렉스", "1544-1122", "1"));
		movieList.add(new Movie("CGV 청담씨네시티", "서울 강남구 도산대로 323", "1544-1122", "2"));
		movieList.add(new Movie("CGV 압구정", "서울 강남구 압구정로30길 45", "1544-1122", "3"));
		movieList.add(new Movie("롯데시네마 브로드웨이", "서울 강남구 도산대로8길 8", "1544-8855", "1"));
		movieList.add(new Movie("메가박스 코엑스", "서울 강남구 영동대로 513 코엑스몰 지하 1층", "1544-0070", "2"));
		movieList.add(new Movie("메가박스 강남", "서울 서초구 서초대로77길 3 아라타워 8층", "1544-0070", "3"));
		movieList.add(new Movie("이봄씨어터", "서울 강남구 압구정로10길 9 대원빌딩", "070-8233-4321", "1"));

		return movieList;
	}

	public ArrayList<Library> libraryListReader() {
		// libraryList
		libraryList.add(new Library("국립어린이청소년도서관", "서울 강남구 테헤란로7길 21", "02-3413-4800", "1"));
		libraryList.add(new Library("별마당도서관", "서울 강남구 영동대로513 스타필드 코엑스몰 지하1층", "02-6002-3031", "2"));
		libraryList.add(new Library("서울교육청 강남도서관", "서울 강남구 선릉로116길 45", "02-3448-4741", "3"));

		return libraryList;
	}

	public ArrayList<Book> bookListReader() {
		// bookList
		bookList.add(new Book("교보문고 강남점", "서울특별시 서초구 강남대로 465 교보타워 지하 1층~지하 2층", "1599-1000", "1"));
		bookList.add(new Book("알라딘중고서점 강남점", "서울특별시 강남구 강남대로 438 스타플렉스", "1663-3399", "2"));
		bookList.add(new Book("영풍문고 강남역점", "서울특별시 강남구 강남대로 408 YBM강남센터", "1600-1944", "3"));

		return bookList;
	}

	public ArrayList<Exhibit> exhibitListReader() {
		// exhibitList
		exhibitList.add(new Exhibit("갤러리 화이트원", "서울 강남구 학동로 97길 69", "02-6006-9300", "1"));
		exhibitList.add(new Exhibit("관세박물관", "서울 강남구 언주로 721 1층", "02-513-1082", "2"));
		exhibitList.add(new Exhibit("스페이스씨", "서울 강남구 언주로 827", "02-547-9177", "3"));
		exhibitList.add(new Exhibit("호림아트센터", "서울 강남구 도산대로 317", "02-541-3540", "1"));
		exhibitList.add(new Exhibit("플랫폼엘 컨템포러리 아트센터", "서울 강남구 언주로133길 11", "02-6929-4470", "2"));
		exhibitList.add(new Exhibit("포스코미술관", "서울 강남구 테헤란로 440 포스코센터", "02-3457-1665", "3"));
		exhibitList.add(new Exhibit("K현대미술관", "서울 강남구 선릉로 807", "02-2138-0952", "1"));

		return exhibitList;
	}

	public ArrayList<Health> healthListReader() {
		// healthList
		healthList.add(new Health("크로스핏라임라잇", "서울 강남구 언주로168길 15", "02-3443-7272", "1"));
		healthList.add(new Health("트레인트루", "서울 강남구 압구정로28길 19 제이제이빌딩", "070-7543-3301", "2"));
		healthList.add(new Health("바디스페이스", "서울 강남구 학동로 6길 19", "02-517-6191", "3"));
		healthList.add(new Health("써니요가스튜디오", "서울 강남구 선릉로 126길 6 3층", "02-516-5568", "1"));
		healthList.add(new Health("스판다요가", "서울 강남구 논현로151길 55", "02-543-5644", "2"));
		healthList.add(new Health("소마힐링센터", "서울 강남구 도산대로6길 15", "02-514-4655", "3"));

		return healthList;
	}

	public ArrayList<Hobby> hobbyListReader() {
		// hobbyList
		hobbyList.add(new Hobby("CIM 피아노학원", "서울 강남구 강남대로120길 61 1층", "02-3445-6688", "1"));
		hobbyList.add(new Hobby("피아노리브레 강남센터", "서울 강남구 강남대로96길 20 혜진빌딩 3층", "02-563-9915", "2"));
		hobbyList.add(new Hobby("위드피아노 선릉점", "서울 강남구 삼성로91길 36 제이타워 9층", "010-5826-9374", "3"));
		hobbyList.add(new Hobby("스튜디오 티", "서울특별시 강남구 도곡로3길 25 삼성애니텔 B101-2호", "02-2039-3920", "1"));
		hobbyList.add(new Hobby("아로마 라운지", "서울특별시 강남구 도곡로3길 19", "02-3023-2929", "2"));
		hobbyList.add(new Hobby("야마하 뮤직코리아", "서울특별시 강남구 강남대로 298 11층", "02-300-2993", "3"));

		return hobbyList;
	}
	
	public ArrayList<HobbyAndHealth> hobbyAndHealthListReader(){
		//hobbyAndHealthList
		//hobbyAndHealthList.add(new HobbyAndHealth());
		hobbyAndHealthList.add(new HobbyAndHealth("CIM 피아노학원", "서울 강남구 강남대로120길 61 1층", "02-3445-6688", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("피아노리브레 강남센터", "서울 강남구 강남대로96길 20 혜진빌딩 3층", "02-563-9915", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("위드피아노 선릉점", "서울 강남구 삼성로91길 36 제이타워 9층", "010-5826-9374", "3"));
		hobbyAndHealthList.add(new HobbyAndHealth("스튜디오 티", "서울특별시 강남구 도곡로3길 25 삼성애니텔 B101-2호", "02-2039-3920", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("아로마 라운지", "서울특별시 강남구 도곡로3길 19", "02-3023-2929", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("야마하 뮤직코리아", "서울특별시 강남구 강남대로 298 11층", "02-300-2993", "3"));
		hobbyAndHealthList.add(new HobbyAndHealth("크로스핏라임라잇", "서울 강남구 언주로168길 15", "02-3443-7272", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("트레인트루", "서울 강남구 압구정로28길 19 제이제이빌딩", "070-7543-3301", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("바디스페이스", "서울 강남구 학동로 6길 19", "02-517-6191", "3"));
		hobbyAndHealthList.add(new HobbyAndHealth("써니요가스튜디오", "서울 강남구 선릉로 126길 6 3층", "02-516-5568", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("스판다요가", "서울 강남구 논현로151길 55", "02-543-5644", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("소마힐링센터", "서울 강남구 도산대로6길 15", "02-514-4655", "3"));

		return hobbyAndHealthList;
	}
	
	public ArrayList<BookAndLibrary> bookAndLibraryListReader(){
		bookAndLibraryList.add(new BookAndLibrary("국립어린이청소년도서관", "서울 강남구 테헤란로7길 21", "02-3413-4800", "1"));
		bookAndLibraryList.add(new BookAndLibrary("별마당도서관", "서울 강남구 영동대로513 스타필드 코엑스몰 지하1층", "02-6002-3031", "2"));
		bookAndLibraryList.add(new BookAndLibrary("서울교육청 강남도서관", "서울 강남구 선릉로116길 45", "02-3448-4741", "3"));
		bookAndLibraryList.add(new BookAndLibrary("교보문고 강남점", "서울특별시 서초구 강남대로 465 교보타워 지하 1층~지하 2층", "1599-1000", "1"));
		bookAndLibraryList.add(new BookAndLibrary("알라딘중고서점 강남점", "서울특별시 강남구 강남대로 438 스타플렉스", "1663-3399", "2"));
		bookAndLibraryList.add(new BookAndLibrary("영풍문고 강남역점", "서울특별시 강남구 강남대로 408 YBM강남센터", "1600-1944", "3"));

		return bookAndLibraryList;
	}

		// searchCultureList 메소드 없앰 

	// 여가시설의 하위 카테고리 : <Movie>, <Book>, <Library>, <Exhibit>, <Hobby>, <Health>, <BookAndLibrary>, <HobbyAndHealth>
	
	public ArrayList<Movie> favoriteMovie(String keyword) {

		ArrayList<Movie> add = new ArrayList<Movie>();
		Movie movie = new Movie();
		
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(keyword)) {
				add.add(movieList.get(i));
			}
		}
		movie.setMovieLikes(add);
		return add;
	}

	public ArrayList<Book> favoriteBook(String keyword) {

		ArrayList<Book> add = new ArrayList<Book>();
		Book book = new Book();

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getName().contains(keyword)) {
				add.add(bookList.get(i));
			}
		}
		book.setBookLikes(add);
	//	book.addBookListPrint();
		System.out.println(add);
		return add;
	}

	public ArrayList<Library> favoriteLibrary(String keyword) {

		ArrayList<Library> add = new ArrayList<Library>();
		Library library = new Library();

		for (int i = 0; i < libraryList.size(); i++) {
			if (libraryList.get(i).getName().contains(keyword)) {
				add.add(libraryList.get(i));
			}
		}
		library.setLibraryLikes(add);
		System.out.println(add);
		return add;
	}

	public ArrayList<Exhibit> favoriteExhibit(String keyword) {

		ArrayList<Exhibit> add = new ArrayList<Exhibit>();
		Exhibit exhibit = new Exhibit();

		for (int i = 0; i < exhibitList.size(); i++) {
			if (exhibitList.get(i).getName().contains(keyword)) {
				add.add(exhibitList.get(i));
			}
		}
		exhibit.setExhibitLikes(add);
		System.out.println(add);
		return add;
	}

	public ArrayList<Hobby> favoriteHobby(String keyword) {

		ArrayList<Hobby> add = new ArrayList<Hobby>();
		Hobby hobby = new Hobby();

		for (int i = 0; i < hobbyList.size(); i++) {
			if (hobbyList.get(i).getName().contains(keyword)) {
				add.add(hobbyList.get(i));
			}
		}
		hobby.setHobbyLikes(add);
		System.out.println(add);
		return add;
	}
	
	public ArrayList<Health> favoriteHealth(String keyword) {

		ArrayList<Health> add = new ArrayList<Health>();
		Health health = new Health();

		for (int i = 0; i < healthList.size(); i++) {
			if (healthList.get(i).getName().contains(keyword)) {
				add.add(healthList.get(i));
			}
		}
		health.setHealthLikes(add);
		System.out.println(add);
		return add;
	}
	
	
	public ArrayList<HobbyAndHealth> favoriteHobbyAndHealth(String keyword){
		ArrayList<HobbyAndHealth> add = new ArrayList<HobbyAndHealth>();
		HobbyAndHealth hobbyAndHealth = new HobbyAndHealth();

		for (int i = 0; i < hobbyAndHealthList.size(); i++) {
			if ( hobbyAndHealthList.get(i).getName().contains(keyword)) {
				add.add(hobbyAndHealthList.get(i));
			}
		}
		hobbyAndHealth.setHobbyAndHealthLikes(add);
		System.out.println(add);
		return add;
	}
	
	public ArrayList<BookAndLibrary> favoriteBookAndLibrary(String keyword){
		ArrayList<BookAndLibrary> add = new ArrayList<BookAndLibrary>();
		BookAndLibrary bookAndLibrary = new BookAndLibrary();

		for (int i = 0; i < bookAndLibraryList.size(); i++) {
			if ( bookAndLibraryList.get(i).getName().contains(keyword)) {
				add.add(bookAndLibraryList.get(i));
			}
		}
		bookAndLibrary.setBookAndLibraryLikes(add);
		System.out.println(add);
		return add;
	}


	
}