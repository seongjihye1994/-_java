package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

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
		
		// 이 세가지 클래스에는 공통적인 필드와 메소드가 존재함
		// 이러한 중복을 부모 클래스로 설계하여 중보고드들을 제거할 수 있고
		// 수정과 같은 유지보스를 할 때도 각각 수정할 필요 없이
		// 부모 클래스만 수정하면 전체적으로 반영이 됨
		
		// 브랜드, 상품코드, 상품명, 가격 --> 공통된 필드를 뽑아 Product 클래스를
		// 부모 클래스로 만들고, 나머지 클래스들은 상속받게 하기
		
		

	}

}
