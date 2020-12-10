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
			System.out.println("==== 제품 관리 메뉴 ====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			int inputMeun = sc.nextInt();
			
			switch(inputMeun) {
			case 1 : productInput();
			break;
			case 2 : productPrint();
			break;
			default : System.out.println("잘못 입력하셨습니다.");
			break;
			}
		} while(true);
		
	}
	
	public void productInput() {
		while(true) {
			if (count < pro.length) {
				System.out.println("==== 도서 정보 입력 ====");
				System.out.print("제품 번호 : ");
				int pNumber = sc.nextInt();
				System.out.print("제품명 : ");
				String pName = sc.nextLine(); sc.nextLine();
				System.out.print("제품 가격 : ");
				int pPrice = sc.nextInt();
				System.out.print("제품 세금 : ");
				double pTax = sc.nextDouble(); sc.nextLine();
				pro[idx++] = new Product(pNumber, pName, pPrice, pTax);
				System.out.println("현재 등록된 제품 수 : " + ++count);
				System.out.println("계속 입력하시겠습니까?(Y/N)");
				String more = sc.nextLine();
				if (more.equalsIgnoreCase("y")) {
					continue;
				} else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
			} else {
				System.out.println("저장 길이 부족");
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
