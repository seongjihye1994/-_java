package com.kh.controller.arrayList;

import java.util.ArrayList;

import com.kh.model.vo.Book;

public class ArrayListBook {
	
	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book bk1 = new Book("자바를 잡아라", 30000);
		Book bk2 = new Book("오라클 정복", 35000);
		Book bk3 = new Book("웹표준 2.0", 27500);
		Book bk4 = new Book("자바 Servlet/JSP", 28000);
		Book bk5 = new Book("ajax 사용법", 15000);
		
		
		bookList.add(bk1);
		bookList.add(bk2);
		bookList.add(bk3);
		bookList.add(bk4);
		bookList.add(bk5);

		for (int i = 0; i < bookList.size(); i++) { // list.size() -> list에 담긴 데이터 개수 리턴
			System.out.println(bookList.get(i));	// list.get() -> 전달 받은 인덱스 위치의 데이터 리턴
		}
		
	}
	
}
