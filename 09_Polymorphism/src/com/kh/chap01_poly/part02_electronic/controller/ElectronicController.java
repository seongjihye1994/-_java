package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 전자제품 상가
public class ElectronicController {
	
	// 1. 다형성 적용 안 했을 때 -> 우선 입고 될 제품을 위한 공간만 마련
	private Desktop desk = null;
	private NoteBook note = null;
	private Tablet Tab = null;
	
	/*public void insert(Desktop desktop) {
		desk = desktop;
	}

	public void insert(NoteBook noteBook) {
		note = noteBook;
	}

	public void insert(Tablet tablet) {
		tab = tablet;
	}

	// 해당 필드 값 반환시는 오버로딩 불가 -> 메소드명 모두 다르개 3개 작성
	public Desktop selectDesktop() {
		return desk;
	}

	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selectTablet() {
		return tab;
	}*/
	
	// 2. 다형성 적용 했을 떄 -> 객체 배열로 사용 가능
	private Electronic[] elec = new Electronic[3];
	private int count = 0; // index 관리용 변수
	
	// 매개변수를 부모 타입으로 적용
	public void insert(Electronic any) {
		elec[count++] = any;
	}

	// 반환형 부모 타입으로 적용
	public Electronic[] select() {
		return elec;
	}
	
	
	
	
	
	
	
	

}
