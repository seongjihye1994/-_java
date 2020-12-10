package com.kh.chap02_abstractAndInterface.part01_abstract.run;

import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
//		Sports s = new Sports(); 
		// -> 추상 클래스로는 객체 생성 불가 (미완성 클래스이므로)
		
		Sports s;
		// -> 객체 생성이 안 될 뿐이지 레퍼런스로는 사용 가능!
		// 즉, 스포츠가 부모 타입이 되고 football과 basketball을
		// 상속해 자식 클래스로 참조할 수 있음
		s = new FootBall();
		
		// Sports 객체 배열 만들기
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new FootBall();
		
		// rule 메소드 호출
		for (int i = 0; i < arr.length; i++) {
			arr[i].rule();
			// 동적 바인딩을 통해서 아까 강제로 오버라이딩 된 각각의 메소드를 자동으로 찾아 실행
		}
		
		// for each
		for (Sports sp : arr) {
			sp.rule();
		}
		
		// 추상 클래스를 왜 사용하나요?
		// 각 자식 클래스마다 서로 구현 되어야 하는 내용은 다르지만
		// 동일한 패턴(메소드명, 매개변수, 리턴형)으로 구현 되었으면 할 때
		// 자식 클래스에서는 상속 받아 강제로 오버라이딩하여 동일한 패턴을
		// 가질 수 있게 함 => 상속보다 강력해진 규약의 ㄱ념
		
		
			
			

	}

}
