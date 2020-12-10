package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		Scanner sc = new Scanner(System.in);
		
		// ���� ���� �Է��ϱ�
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "��° ���� ���� �Է�");
			
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine(); // ���� ����
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			if (i == 0) {
				bk1 = new Book(title, author, price, publisher);				
			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);								
			} else {
				bk3 = new Book(title, author, price, publisher);												
			}

		}
		
		
		// ���� ���� ��ȸ
		System.out.println(bk1.info());
		System.out.println(bk2.info());
		System.out.println(bk3.info());
		
		
		// ���� ���� �˻�
		System.out.println("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		if (search.equals(bk1.getTitle())) {
			System.out.println(bk1.info());
		} else if (search.equals(bk2.getTitle())) {
			System.out.println(bk2.info());
		} else if (search.equals(bk3.getTitle())) {
		System.out.println(bk3.info());
		} else {
			System.out.println("�˻��Ǵ� ������ �����ϴ�.");
		}
		
		
		
		
	}
	
	// �����ؾ� �� ������ 1000�� 10000�� �̻��̶��?
	// ��¹��� ���ǹ��� �ش� ���� ������ŭ ���?
	// -> ��ü�� �迭�� ���� �ۼ�����
	
	
	

}
