package com.kh.chap05_iniBlock.run;

import com.kh.chap05_iniBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product p = new Product();
		System.out.println(p.information());
		// 필드 초기화 순서
		// 1. JVM이 정한 기본 값으로 객체 생성
		// 2. 명시적 초기화
		// 3. static 블록(프로그램 시작 시 한 번 실행) / 인스턴스 블록(객체 생성 시마다 실행)
		// 4. 인스턴스 변수의 경우 - 생성자 초기화
		
		

	}

}
