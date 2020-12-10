package test;

//import fruit.Apple; // 서로 다른 패키지에서 클래스 객체를 생성하기 위해서는 import를 해줘야 한다.
//import fruit.Banana;
//import fruit.Melon;

import fruit.*; // fruit 패키지 내의 모든 클래스를 모두 import 한다.
import juice.*;

public class Test {

	public static void main(String[] args) {
		
		// 패키지 이름은 소문자로 작성하는 것이 관례
		// 최상위 패키지의 이름은 java로 시작할 수 없습니당.
		// 자바의 예약어들도 패키지 이름으로는 사용 불가합니당.
		// 하위 패키지로 들어가는 경로는 .으로 구분한다.
		// fruit 패키지에 있는 클래스들의 객체를 test 패키지내의 test클래스 내의  main 메서드에서 생성
		// 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는 반드시 패키지 경로(이름)를 표시해 주어야 합니다.
		
		fruit.Apple a = new fruit.Apple(); // fruit의  Apple
		juice.Apple a2 = new juice.Apple(); // juice의 Apple
		Banana b = new Banana();
		Melon m = new Melon();
		

	}

}
