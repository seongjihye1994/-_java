package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class Basketball extends Sports {
	// Sports가 abstract 클래스이기 때문에 상속받는 Basketball 클래스는
	// Sports 클래스 내의 abstract 메소드를 반드시 오버라이딩
	// 해줘야 함

	@Override
	public void rule() {
		System.out.println("손으로 공을 넣어야 한다.");

	}

}
