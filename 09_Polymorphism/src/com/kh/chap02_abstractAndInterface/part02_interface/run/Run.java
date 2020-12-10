package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.GalaxyS10;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Phone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.SmartPhone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.V50;

public class Run {

	// SmartPhone에는 통화, 카메라, 터치 기능이 있음
	// 해당 기능을 각각 interface로 구현하여 SmartPhone 클래스에서 다중 상속 받은 뒤
	// 추상 클래스인 SmartPhone을 상속 받아 GalaxyS10과 V50을 구현
	
	// 1. Phone(interface) -> 통화기능
	// 2. Camera(interface) -> 카메라 기능
	// 3. CellPhone(interface) -> 휴대 전화(Phone, Camera 상속)
	// 4. TouchDisplay(interface) -> 터치 기능
	// 5. SmartPhone(abstract class) -> 스마트폰(CellPhone, TouchDisplay 상속)
	// 6. GalaxyS10 -> SmartPhone을 상속 받은 클래스
	// 7. V50 -> SmartPhone을 상속 받은 클래스
	public static void main(String[] args) {
		
		// Phone 인터페이스의 상수 필드에 접근
		System.out.println(Phone.NUM);
		// Phone.NUM = 20; -> final 수정 불가
		
		// Phone p = new Phone();
		// -> 인터페이스는 객체 생성 불가
		
		// 객체 배열을 만들어 각각의 인덱스에 GalaxyS10, V50 객체 저장
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyS10();
		phone[1] = new V50();
		
		// 반복문 통한 메소드 호출
		for (int i = 0; i < phone.length; i++) {
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
		} // 정적 바인딩(클릭하고 들어가면)은 부모클래스에 정의된 메소드이지만,
		// 실행시에는 동적 바인딩(오버라이딩 한) 메소드로 실행된다.
		

	}
	// 인터페이스를 사용하는 이유?
	
	// 통화, 카메라, 터치 별로 갖추어야 할 기능을 이넡페이스의 메소드로 작성해 두면
	// 그 인터페이스를 상속 받은 모든 클래스들은 반드시 그 메소드를 구현해야 한다.
	// -> 공통 기능상의 일관성 제공(표준화)
	
	// 통화, 카메라, 터치 등 여러 인터페이스를 조합하여 기능을 만들 수 있음
	// -> 단일 상속에 대한 제한점 극복
	
	// 상위 타입 역할로 다형성을 지원하여 연결
	// -> 부모 타입 레퍼런스로 하위 타입 엮어서 사용 시 코드 줄일 수 있음(메소드의 매개변수/리턴타입으로 활용)
	
	// 메소드 호출 시 선언부만 알면 되므로 다른 영역의 메소드가 완성되지 않더라도
	// 본인의 영역 개발 가능
	// -> 공통 작업을 위한 인터페이스 제공
	

}
