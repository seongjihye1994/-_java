package com.kh.controller.arrayList;

import java.util.ArrayList;

import com.kh.model.vo.Book;

public class ArrayListBook {
	
	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book bk1 = new Book("�ڹٸ� ��ƶ�", 30000);
		Book bk2 = new Book("����Ŭ ����", 35000);
		Book bk3 = new Book("��ǥ�� 2.0", 27500);
		Book bk4 = new Book("�ڹ� Servlet/JSP", 28000);
		Book bk5 = new Book("ajax ����", 15000);
		
		
		bookList.add(bk1);
		bookList.add(bk2);
		bookList.add(bk3);
		bookList.add(bk4);
		bookList.add(bk5);

		for (int i = 0; i < bookList.size(); i++) { // list.size() -> list�� ��� ������ ���� ����
			System.out.println(bookList.get(i));	// list.get() -> ���� ���� �ε��� ��ġ�� ������ ����
		}
		
	}
	
}
