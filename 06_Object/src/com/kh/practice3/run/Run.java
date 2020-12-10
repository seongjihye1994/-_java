package com.kh.practice3.run;

import com.kh.practice3.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		System.out.println("기본 생성자");
		System.out.println(book1.info());
		Book book2 = new Book("제목1", "출판사1", "저자1");
		System.out.println("매개변수 3개인 생성자");
		System.out.println(book2.info());
		Book book3 = new Book("제목2", "출판사2", "저자2", 15000, 20);
		System.out.println("매개변수 5개인 생성자");
		System.out.println(book3.info());

	}

}
