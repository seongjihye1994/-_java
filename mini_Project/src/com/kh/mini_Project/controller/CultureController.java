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
	

	public ArrayList<Movie> movieListReader() { // # ������ �߰�

		// movieList
		
		movieList.add(new Movie("CGV ����", "���� ������ ������� 438 ��Ÿ�÷���", "1544-1122", "1"));
		movieList.add(new Movie("CGV û�㾾�׽�Ƽ", "���� ������ ������ 323", "1544-1122", "2"));
		movieList.add(new Movie("CGV �б���", "���� ������ �б�����30�� 45", "1544-1122", "3"));
		movieList.add(new Movie("�Ե��ó׸� ��ε����", "���� ������ ������8�� 8", "1544-8855", "1"));
		movieList.add(new Movie("�ް��ڽ� �ڿ���", "���� ������ ������� 513 �ڿ����� ���� 1��", "1544-0070", "2"));
		movieList.add(new Movie("�ް��ڽ� ����", "���� ���ʱ� ���ʴ��77�� 3 �ƶ�Ÿ�� 8��", "1544-0070", "3"));
		movieList.add(new Movie("�̺�������", "���� ������ �б�����10�� 9 �������", "070-8233-4321", "1"));

		return movieList;
	}

	public ArrayList<Library> libraryListReader() {
		// libraryList
		libraryList.add(new Library("�������û�ҳ⵵����", "���� ������ �������7�� 21", "02-3413-4800", "1"));
		libraryList.add(new Library("�����絵����", "���� ������ �������513 ��Ÿ�ʵ� �ڿ����� ����1��", "02-6002-3031", "2"));
		libraryList.add(new Library("���ﱳ��û ����������", "���� ������ ������116�� 45", "02-3448-4741", "3"));

		return libraryList;
	}

	public ArrayList<Book> bookListReader() {
		// bookList
		bookList.add(new Book("�������� ������", "����Ư���� ���ʱ� ������� 465 ����Ÿ�� ���� 1��~���� 2��", "1599-1000", "1"));
		bookList.add(new Book("�˶���߰��� ������", "����Ư���� ������ ������� 438 ��Ÿ�÷���", "1663-3399", "2"));
		bookList.add(new Book("��ǳ���� ��������", "����Ư���� ������ ������� 408 YBM��������", "1600-1944", "3"));

		return bookList;
	}

	public ArrayList<Exhibit> exhibitListReader() {
		// exhibitList
		exhibitList.add(new Exhibit("������ ȭ��Ʈ��", "���� ������ �е��� 97�� 69", "02-6006-9300", "1"));
		exhibitList.add(new Exhibit("�����ڹ���", "���� ������ ���ַ� 721 1��", "02-513-1082", "2"));
		exhibitList.add(new Exhibit("�����̽���", "���� ������ ���ַ� 827", "02-547-9177", "3"));
		exhibitList.add(new Exhibit("ȣ����Ʈ����", "���� ������ ������ 317", "02-541-3540", "1"));
		exhibitList.add(new Exhibit("�÷����� ���������� ��Ʈ����", "���� ������ ���ַ�133�� 11", "02-6929-4470", "2"));
		exhibitList.add(new Exhibit("�����ڹ̼���", "���� ������ ������� 440 �����ڼ���", "02-3457-1665", "3"));
		exhibitList.add(new Exhibit("K����̼���", "���� ������ ������ 807", "02-2138-0952", "1"));

		return exhibitList;
	}

	public ArrayList<Health> healthListReader() {
		// healthList
		healthList.add(new Health("ũ�ν��Ͷ��Ӷ���", "���� ������ ���ַ�168�� 15", "02-3443-7272", "1"));
		healthList.add(new Health("Ʈ����Ʈ��", "���� ������ �б�����28�� 19 �������̺���", "070-7543-3301", "2"));
		healthList.add(new Health("�ٵ����̽�", "���� ������ �е��� 6�� 19", "02-517-6191", "3"));
		healthList.add(new Health("��Ͽ䰡��Ʃ���", "���� ������ ������ 126�� 6 3��", "02-516-5568", "1"));
		healthList.add(new Health("���Ǵٿ䰡", "���� ������ ������151�� 55", "02-543-5644", "2"));
		healthList.add(new Health("�Ҹ���������", "���� ������ ������6�� 15", "02-514-4655", "3"));

		return healthList;
	}

	public ArrayList<Hobby> hobbyListReader() {
		// hobbyList
		hobbyList.add(new Hobby("CIM �ǾƳ��п�", "���� ������ �������120�� 61 1��", "02-3445-6688", "1"));
		hobbyList.add(new Hobby("�ǾƳ븮�극 ��������", "���� ������ �������96�� 20 �������� 3��", "02-563-9915", "2"));
		hobbyList.add(new Hobby("�����ǾƳ� ������", "���� ������ �Ｚ��91�� 36 ����Ÿ�� 9��", "010-5826-9374", "3"));
		hobbyList.add(new Hobby("��Ʃ��� Ƽ", "����Ư���� ������ �����3�� 25 �Ｚ�ִ��� B101-2ȣ", "02-2039-3920", "1"));
		hobbyList.add(new Hobby("�Ʒθ� �����", "����Ư���� ������ �����3�� 19", "02-3023-2929", "2"));
		hobbyList.add(new Hobby("�߸��� �����ڸ���", "����Ư���� ������ ������� 298 11��", "02-300-2993", "3"));

		return hobbyList;
	}
	
	public ArrayList<HobbyAndHealth> hobbyAndHealthListReader(){
		//hobbyAndHealthList
		//hobbyAndHealthList.add(new HobbyAndHealth());
		hobbyAndHealthList.add(new HobbyAndHealth("CIM �ǾƳ��п�", "���� ������ �������120�� 61 1��", "02-3445-6688", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("�ǾƳ븮�극 ��������", "���� ������ �������96�� 20 �������� 3��", "02-563-9915", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("�����ǾƳ� ������", "���� ������ �Ｚ��91�� 36 ����Ÿ�� 9��", "010-5826-9374", "3"));
		hobbyAndHealthList.add(new HobbyAndHealth("��Ʃ��� Ƽ", "����Ư���� ������ �����3�� 25 �Ｚ�ִ��� B101-2ȣ", "02-2039-3920", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("�Ʒθ� �����", "����Ư���� ������ �����3�� 19", "02-3023-2929", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("�߸��� �����ڸ���", "����Ư���� ������ ������� 298 11��", "02-300-2993", "3"));
		hobbyAndHealthList.add(new HobbyAndHealth("ũ�ν��Ͷ��Ӷ���", "���� ������ ���ַ�168�� 15", "02-3443-7272", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("Ʈ����Ʈ��", "���� ������ �б�����28�� 19 �������̺���", "070-7543-3301", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("�ٵ����̽�", "���� ������ �е��� 6�� 19", "02-517-6191", "3"));
		hobbyAndHealthList.add(new HobbyAndHealth("��Ͽ䰡��Ʃ���", "���� ������ ������ 126�� 6 3��", "02-516-5568", "1"));
		hobbyAndHealthList.add(new HobbyAndHealth("���Ǵٿ䰡", "���� ������ ������151�� 55", "02-543-5644", "2"));
		hobbyAndHealthList.add(new HobbyAndHealth("�Ҹ���������", "���� ������ ������6�� 15", "02-514-4655", "3"));

		return hobbyAndHealthList;
	}
	
	public ArrayList<BookAndLibrary> bookAndLibraryListReader(){
		bookAndLibraryList.add(new BookAndLibrary("�������û�ҳ⵵����", "���� ������ �������7�� 21", "02-3413-4800", "1"));
		bookAndLibraryList.add(new BookAndLibrary("�����絵����", "���� ������ �������513 ��Ÿ�ʵ� �ڿ����� ����1��", "02-6002-3031", "2"));
		bookAndLibraryList.add(new BookAndLibrary("���ﱳ��û ����������", "���� ������ ������116�� 45", "02-3448-4741", "3"));
		bookAndLibraryList.add(new BookAndLibrary("�������� ������", "����Ư���� ���ʱ� ������� 465 ����Ÿ�� ���� 1��~���� 2��", "1599-1000", "1"));
		bookAndLibraryList.add(new BookAndLibrary("�˶���߰��� ������", "����Ư���� ������ ������� 438 ��Ÿ�÷���", "1663-3399", "2"));
		bookAndLibraryList.add(new BookAndLibrary("��ǳ���� ��������", "����Ư���� ������ ������� 408 YBM��������", "1600-1944", "3"));

		return bookAndLibraryList;
	}

		// searchCultureList �޼ҵ� ���� 

	// �����ü��� ���� ī�װ� : <Movie>, <Book>, <Library>, <Exhibit>, <Hobby>, <Health>, <BookAndLibrary>, <HobbyAndHealth>
	
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