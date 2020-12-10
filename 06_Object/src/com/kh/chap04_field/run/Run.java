package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		
		// 1. FieldTest1
		FieldTest1 f1 = new FieldTest1();
		
		// public -> 어디서든 접근 가능
		System.out.println(f1.pub);
		
		// protected -> 같은 패키지 내에서믄 접근 가능 + 상속 구조라면 다른 패키지도 가능
		System.out.println(f1.getPro()); // 그냥 f1.pro는 사용 불가
										// 다른 패키지면서 상속 구조도 아니기 때문에 getter 메소드를 통해 값을 얻어와야 함
		// default -> 같은 패키지에서만 접근 가능
		System.out.println(f1.getDef()); // 그냥 f1.def는 사용 불가
										// 다른 패키지이기 때문에 사용 불가
		// private -> 같은 클래스 내에서만 접근 가능
		System.out.println(f1.getPri()); // 그냥 f1.pri는 사용 불가

		// 2. FieldTest2
		FieldTest2 f2 = new FieldTest2();
		f2.test(20);
		
		// 3. FieldTEst3
		// FieldTest3 f3 = new FieldTest3();
		// -> static 변수에 접근하기 위해서는 객체를 생성할 필요가 없음
		
		// public static
		System.out.println(FieldTest3.pubSta);
		FieldTest3.pubSta = "changed public static"; // 값 변경도 가능
		System.out.println(FieldTest3.pubSta);
		
		// private static
		System.out.println(FieldTest3.getPriSta());
		FieldTest3.pubSta = "changed private static"; // 값 변경도 가능
		System.out.println(FieldTest3.getPriSta());

		// 4. FieldTest4
		System.out.println(FieldTest4.NUM);
		
		
		
	}

	
}
