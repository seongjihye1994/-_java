package com.kh.hw1.run;

import com.kh.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product("ssgnote9", "갤럭시 노트9", "경기도 수원", 960000, 10.0);
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		System.out.println("===========================================\n");

		p1.setPrice(120);
		p2.setPrice(120);
		p3.setPrice(120);
		
		p1.setTex(0.05);
		p2.setTex(0.05);
		p3.setTex(0.05);

		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		System.out.println("===========================================\n");
		
		System.out.printf("상품명= %s \n부가세 포함 가격= %d만원\n", p1.getProductName(), (int)(p1.getPrice() + (p1.getPrice() * p1.getTex())));
		System.out.printf("상품명= %s \n부가세 포함 가격= %d만원\n", p2.getProductName(), (int)(p2.getPrice() + (p2.getPrice() * p2.getTex())));
		System.out.printf("상품명= %s \n부가세 포함 가격= %d만원\n", p3.getProductName(), (int)(p3.getPrice() + (p3.getPrice() * p3.getTex())));
		
	}

}
