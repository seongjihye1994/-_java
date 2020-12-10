package com.kh.chap01_inherit.after.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;
import com.kh.chap01_inherit.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// Desktop 객체 생성
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		
		// SmartPhone 객체 생성
		SmartPhone s = new SmartPhone("사과", "s-01", "아이뽄", 1500000, "KT");
		
		// Desktop 객체 생성
		Tv t = new Tv("LG", "t-01", "겁나 얇은 티비", 3500000, 46);
		
		// 출력
		System.out.println(d.info());
		System.out.println(s.info());
		System.out.println(t.info());

		// 부모가 가진 필드에 접근
		System.out.println(d.getBrand());
		System.out.println(s.getpCode());
		System.out.println(t.getPrice());
		
		d.print();
		s.print();
		t.print();
		
		// * 상속의 특징
		// - 클래스를 상속 받을 때는 상속만 가능 (부모는 하나)
		// - 명시되어있지 않지만 모든 클래스는 Object 클래스의 후손
		// - 즉, Object 클래스가 제공하는 메소드들은 모든 객체가
		//   사용할 수 있으며, 오버라이딩 하여 메소드 재작성 가능
		// - 부모 클래스의 생성자, 초기화 블록은 상속이 안 됨
		// --> 자식 클래스 안에서 부모 클래스의 생성자 호출 super()
		// 자식 객체 생성 시 부모 클래스 생성자가 먼저 실행
		// - 부모의 private 멤버(필드, 메소드)는 상속은 되지만 직접 접근 불가
		// --> setter / getter 를 이용해서 간접적으로 접근해야 함.
		// 단, protected로 접근 제한자를 작성하면 상속 관계에서 직접접근 사용 가능
		// ex) super.price 등등
		
		
		
		
		
		
	}

}
