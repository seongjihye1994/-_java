package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Phone {
	// 추상 클래스 => 일반 멤버(변수 + 메소드) + 추상 메소드
	// 인터페이스 => 오직 상수 필드 + 추상 메소드
	
	// 인터페이스에서의 필드는 무조건 상수 필드이기 때문에 안적어줘도 됨
	/*public static final*/ int NUM = 10;
	
	// 인터페이스에서의 메소드는 무조건 추상 메소드이기 때문에 안적어줘도 됨
	/*public abstract*/ void makeaCall();
	// 일반 전화 : 번호를 누름, 휴대 전화 : 번호를 누르고 통화 버튼을 누름
	
	void takeaCall();	// 전화 받기
	// 일반 전화 : 수화기를 듦, 휴대 전화 : 수신 버튼을 누름
	
	
	
	
	

}
