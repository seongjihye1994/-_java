package com.kh.chap04_field.model.vo;

// 클래스 변수(static 변수)에 대해서 알아보기
public class FieldTest3 {
	
	// 전역 변수의 일종인 클래스 변수는 static 예약어가 붙은 변수를 말함
	// static 키워드가 붙으면 프로그램 실행 하자마자 static 메모리
	// 영역에 할당 됨
	
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// static 변수는 FieldTest3라는 클래스(틀)로 찍어낸
	// 모든 객체들이 "공유"하는 차원
	
	public FieldTest3() {} // 생성자
	
	// private 을 위한 게터 /세터 메소드
//	public void setPriSta(String proSta) {
//		this.setPriSta = priSta;
//	}
	
	// static은 객체 생성을 하지 않아도 프로그램 실행과 동시에
	// static 영역에 할당 되기 때문에 this를 붙이지 않음
	
	public static void setPriSta(String priSta) {
		FieldTest3.priSta = priSta; // static 메소드는 클래스명.으로 호출
	}
	public static String getPriSta() {
		return "private static";
	}

	
	
	
	

}
