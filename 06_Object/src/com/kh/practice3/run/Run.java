package com.kh.practice3.run;

import com.kh.practice3.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		System.out.println("�⺻ ������");
		System.out.println(book1.info());
		Book book2 = new Book("����1", "���ǻ�1", "����1");
		System.out.println("�Ű����� 3���� ������");
		System.out.println(book2.info());
		Book book3 = new Book("����2", "���ǻ�2", "����2", 15000, 20);
		System.out.println("�Ű����� 5���� ������");
		System.out.println(book3.info());

	}

}
