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
		
		System.out.println("*** ���� ���� ���α׷� ***");
		
		while(true) {
			System.out.println("1. �� ���� �߰�"); // �߰���
			System.out.println("2. ���� ����"); // ������(�Ǵ°� ����)
			System.out.println("3. ���� �˻� ���"); // �˻��ȵ�
			System.out.println("4. ��ü ���"); // ��¾ȵ�
			System.out.println("0. ������"); // �������
			System.out.println(); // ����
			System.out.print("�޴� ��ȣ ���� : ");	
			
			int inputMenu = sc.nextInt();
			
			switch(inputMenu) {
			case 1: insertBook(); break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: System.out.println(bm.selectMap()); break;
			case 0: System.out.println("���α׷� ����"); return;
			}
		}
		
		
	}
	
	public void insertBook() {
		
		System.out.print("���� ���� : ");
		String title = sc.next();
		System.out.print("���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) : ");
		int category = sc.nextInt();
		System.out.print("���� ���� : ");
		String author = sc.next();
		
		Book bk = new Book(category, title, author);
		
		bm.insertBook(bk);

	}
	
	public void selectMap() {
		
		HashMap<Integer, Book> bookMap = bm.selectMap();
		
		if (bookMap.isEmpty()) System.out.println("���� ����� �������� �ʽ��ϴ�.");
		else {
			Set<Entry<Integer, Book>> entrySet = bookMap.entrySet();
			Iterator<Entry<Integer, Book>> it = entrySet.iterator();
			
			while(it.hasNext()) {
				Entry<Integer, Book> entry = it.next();
				System.out.printf("ī�װ� : %d ���� : %s\n", entry.getKey(), entry.getValue());
			}

		}
		
	}
	
	public void deleteBook() {
		
		System.out.print("���� ��ȣ : ");
		int bNo = sc.nextInt();
		
		int result = bm.deleteBook(bNo);
		
		if (result == 1) System.out.println("���������� ����");
		else System.out.println("������ å�� �������� �ʽ��ϴ�.");
		
	}
	
	public void searchBook() {
		
		System.out.print("���� ���� : ");
		String title = sc.next();
		
		HashMap<Integer, Book> searchMap = bm.searchBook(title);
		
		if (searchMap.isEmpty()) System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
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
