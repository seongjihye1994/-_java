package com.kh.chap01_inherit.run;

import com.kh.chap01_inherit.model.vo.Airplane;
import com.kh.chap01_inherit.model.vo.Car;
import com.kh.chap01_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		Airplane airplane = new Airplane("비행기1", 0.021, "제트기", 16, 5);
		
		Car car = new Car("BMW", 12.5, "세단", 4);
		
		Ship ship = new Ship("낚시배", 3, "어선", 1);
		
		// info 메소드도 Overriding 되어 있었던 것
		// @Override 라고 작성하지 않아도 오버라이딩 되나요?
		// ==> Yes
		// 어노테이션을 작성하지 않았을 시 overriding의 적용은 되지만, 오류는 잡아낼 수 없음.
		System.out.println(airplane.info());
		System.out.println(car.info());
		System.out.println(ship.info());
		
		airplane.howToMove();
		car.howToMove();
		ship.howToMove();
		
		// -----------------------------------------------------------------
		
		// 향상 된 for문, for each 문
		
		// 1. 배열의 경우
		double[] arr = {0.1, 0.2, 0.3, 0.4, 0.5};
		
		// for문으로 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for-Each문 : 처음부터 끝까지 순차적으로 반복
		for (double num : arr) { // (타입 변수명  : 반복문에서 반복하고자 하는 대상)
			// 1번째 반복문 동작 시 arr[0]에 접근 -> num이라는 변수명으로 지칭
			System.out.println(num);
		}
		
		// 2. 객채 배열의 경우
		Airplane[] list = {new Airplane("p-01", 0.03, "여객기", 16, 5),
				new Airplane("p-02", 0.03, "여객기", 16, 5),
				new Airplane("p-03", 0.03, "여객기", 16, 5)};
		
		// for문으로 출력
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].info());
		}
		
		// for-Each문
		for (Airplane air : list) {
			System.out.println(air.info());
		}

	}

}
