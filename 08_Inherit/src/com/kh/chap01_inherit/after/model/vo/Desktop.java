package com.kh.chap01_inherit.after.model.vo;

// Product를 상속 받는 Desktop 클래스 
public class Desktop extends Product {
	// extends -> 확장하다.
	// 부모의 것을 물려 받고 자신의 것을 추가하여 클래스를 확장함
	
	private boolean allInOne; // 일체형 여부
	
	public Desktop() {}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// super() : 부모 객체의 생성자 호출
		// 자식객체 안에 포함싴키며 반드시 첫 줄에 표기 --> 항상 부모부터 생성되기 때문!
		super(brand, pCode, pName, price); 
		this.allInOne = allInOne;
	}

	// 게터 세터는 해당클래스만 생성
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String info() {
		// super. 부모 객체를 가리키는 참조 변수
		// 자식 클래스 내에서 부모 클래스 객체에 접근하여 필드나 메소드 호출 시 사용.
		return super.info() + ", allInOne : " + allInOne;
	}

	@Override
	public void print() {
		System.out.println("나는 Desktop 객체야!");
	}
	
	
	
	
	

}
