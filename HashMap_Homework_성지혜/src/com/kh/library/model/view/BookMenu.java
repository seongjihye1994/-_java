package com.kh.library.model.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.library.controller.BookManager;
import com.kh.library.model.vo.Book;

public class BookMenu {
	
	Scanner sc  = new Scanner(System.in);
	
	BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	public void mainMenu() {
		
		System.out.println("*** 도서 관리 프로그램 ***");
		
		while(true) {
			System.out.println("1. 새 도서 추가"); // 추가됨
			System.out.println("2. 도서 삭제"); // 삭제됨(되는것 같음)
			System.out.println("3. 도서 검색 출력"); // 검색안됨
			System.out.println("4. 전체 출력"); // 출력안됨
			System.out.println("0. 끝내기"); // 끝내기됨
			System.out.println(); // 개행
			System.out.print("메뉴 번호 선택 : ");	
			
			int inputMenu = sc.nextInt();
			
			switch(inputMenu) {
			case 1: insertBook(); break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: System.out.println(bm.selectMap()); break;
			case 0: System.out.println("프로그램 종료"); return;
			}
		}
		
		
	}
	
	public void insertBook() {
		
		System.out.print("도서 제목 : ");
		String title = sc.next();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt();
		System.out.print("도서 저자 : ");
		String author = sc.next();
		
		Book bk = new Book(category, title, author);
		
		bm.insertBook(bk);

	}
	
	public void selectMap() {
		
		HashMap<Integer, Book> bookMap = bm.selectMap();
		
		if (bookMap.isEmpty()) System.out.println("도서 목록이 존재하지 않습니다.");
		else {
			Set<Entry<Integer, Book>> entrySet = bookMap.entrySet();
			Iterator<Entry<Integer, Book>> it = entrySet.iterator();
			
			while(it.hasNext()) {
				Entry<Integer, Book> entry = it.next();
				System.out.printf("카테고리 : %d 도서 : %s\n", entry.getKey(), entry.getValue());
			}

		}
		
	}
	
	public void deleteBook() {
		
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		
		int result = bm.deleteBook(bNo);
		
		if (result == 1) System.out.println("성공적으로 삭제");
		else System.out.println("삭제할 책이 존재하지 않습니다.");
		
	}
	
	public void searchBook() {
		
		System.out.print("도서 제목 : ");
		String title = sc.next();
		
		HashMap<Integer, Book> searchMap = bm.searchBook(title);
		
		if (searchMap.isEmpty()) System.out.println("검색 결과가 존재하지 않습니다.");
		else {
			Set<Entry<Integer, Book>> entrySet = searchMap.entrySet();
			Iterator<Entry<Integer, Book>> it = entrySet.iterator();
			
			while(it.hasNext()) {
				Entry<Integer, Book> entry = it.next();
				System.out.println(entry);
			}
		}

		
	}
	
	

}
