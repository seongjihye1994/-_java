package com.kh.practice2.controller;

import java.util.Scanner;

import com.kh.practice1.model.vo.Student;
import com.kh.practice2.model.vo.Product;

public class ProductController {
	Product[] pro = new Product[10];
	
	static Scanner sc = new Scanner(System.in);
	static int count = 0;
	static int idx = 0;
	
	public void mainMenu() {
		do {
			System.out.println("==== ��ǰ ���� �޴� ====");
			System.out.println("1. ��ǰ ���� �߰�");
			System.out.println("2. ��ǰ ��ü ��ȸ");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� �Է� : ");
			int inputMeun = sc.nextInt();
			
			switch(inputMeun) {
			case 1 : productInput();
			break;
			case 2 : productPrint();
			break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
			}
		} while(true);
		
	}
	
	public void productInput() {
		while(true) {
			if (count < pro.length) {
				System.out.println("==== ���� ���� �Է� ====");
				System.out.print("��ǰ ��ȣ : ");
				int pNumber = sc.nextInt();
				System.out.print("��ǰ�� : ");
				String pName = sc.nextLine(); sc.nextLine();
				System.out.print("��ǰ ���� : ");
				int pPrice = sc.nextInt();
				System.out.print("��ǰ ���� : ");
				double pTax = sc.nextDouble(); sc.nextLine();
				pro[idx++] = new Product(pNumber, pName, pPrice, pTax);
				System.out.println("���� ��ϵ� ��ǰ �� : " + ++count);
				System.out.println("��� �Է��Ͻðڽ��ϱ�?(Y/N)");
				String more = sc.nextLine();
				if (more.equalsIgnoreCase("y")) {
					continue;
				} else {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				
			} else {
				System.out.println("���� ���� ����");
				return;
			}
		}
		
	}
	
	public void productPrint() {
		for (int i = 0; i < count; i++) {
			System.out.println(pro[i].info());
		}
	}

}
