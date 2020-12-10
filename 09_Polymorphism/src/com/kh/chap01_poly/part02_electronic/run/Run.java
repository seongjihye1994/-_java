package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	// 전자 제품을 전자 상가로 납품
	public static void main(String[] args) {
		// controller에 있는 메소드를 사용하기 위해 해당 클래스 객체 생성
		ElectronicController ec = new ElectronicController();

		// 1. 다형성 적용 안 했을 때
		// 물건 납품(insert)
		/*ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 2000000, 3));
		ec.insert(new Tablet("Apple", "아이패드", 800000, false));*/
	
		// 납품 된 물건 조회(select)
		/*Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();*/
	
		// 출력
		/*System.out.println(d);
		System.out.println(n);
		System.out.println(t);*/
	
	
		// 2. 다형성 적용 했을 때
		// 물건 납품(insert)
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 2000000, 3));
		ec.insert(new Tablet("Apple", "아이패드", 800000, false));

		// 납품 된 물건 조회(select)
		Electronic[] elec = ec.select();
		
		// 출력
		for (Electronic e : elec) {
			System.out.println(e);
		}
		
		// 다형성을 사용하는 이유
		// 1. 부모 타입의 객체 배열로 다양한 자식들을 받아 줄 수 있음
		// -> 부모 타입 하나로 다양한 자식들을 다룰 수 있음
		// 2. 매개변수/반환형에 다형성을 적용하는 경우 메소드의 개수를 줄일 수 있음
		
	}

}
