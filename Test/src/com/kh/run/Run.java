package com.kh.run;

import com.kh.model.vo.Book;

public class Run {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		System.out.println(book1);
		
		Book book2 = new Book();
		book2.setTitle("�ڹ��� ����");
		book2.setPrice(20000);
		book2.setDiscountRate(0.2);
		book2.setAuthor("����");
		
		System.out.println(book2.toString());
		
		book1.setTitle("C���");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("ȫ�浿");
		
		System.out.println(book1.toString());
		
		System.out.printf("������ : %s, ���ε� ���� : %d��\n", book1.getTitle(), (int)(book1.getPrice() - book1.getDiscountRate() * book1.getPrice()));
		System.out.printf("������ : %s, ���ε� ���� : %d��\n", book2.getTitle(), (int)(book2.getPrice() - book2.getDiscountRate() * book2.getPrice()));
	}

}
