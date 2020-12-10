package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		// 원칙 : '=' 라는 대입 연산자 양 옆 자료형(타입)은 같아야 함
		
		System.out.println("1. 부모 타입 레퍼런스로 부모 객체 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p 레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식 타입 레퍼런스로 자식 객체 다루는 경우");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		// c1 레퍼런스로 Parent, Child1 둘 다 접근 가능
		
		// ******** 지금부터 다영형이 적용되는 내용 **********
		System.out.println("3. 부모 타입 래퍼런스로 자식 객체 다루는 경우");
		Parent p2 = /*(Parent)*/ new Child1();
		// 대입 연산자를 기준으로 왼쪽과 오른쪽 타입이 다르지만 문제 없음 -> 자동 형변환, 묵시적 형변환
		p2.printParent();
		// p2라는 레퍼런스로 Parent 에 접근 가능 -> 현재 Parent 타입이므로
		// p2.printChild1(); -> Child1에는 바로 접근 불가능
		// Child1에 접근하고 싶으면 형변환이 필요함 -> 강제 형변환, 명시적 형변환
		((Child1)p2).printChild1(); // 괄호와 . 중에서 .이 먼저 연산되기 때문에 캐스팅을 먼저 해주기 위해 바깥 괄호를 묶어줌
		
		// 상속 구조의 클래스들 간에는 형변환 가능
		// 1. UpCasting
		// --> 자식 타입에서 부모 타입으로 변환
		// Parent p = new Child1();
		// 형변환 생략 가능 -> 자동 형변환, 묵시적 형변환
		
		// 2. DownCasting
		// --> 부모 타입에서 자식 타입으로 변환
		// ((Child1)p2).printChild1();
		// 형변환 생략 불가 -> 강제 형변환, 명시적 형변환
		
		System.out.println("4. 자식 타입 레퍼런스로 부모 객체를 다루는 경우");
		// Child1 c2 = new Parent();	
		// 컴파일 에러 : 소스 코드 상의 문법 오류 => Type mismatch
		// Child1 c2 = (Child1)new Parent(); 
		// 런타임 에러 : 프로그램 실행 시 발생하는 오류 => ClassCastException : Cast 연산자 사용 시 타입 오류
		
		// 다형성의 원리
		// : 부모 타입으로부터 파생 된 여러가지 타입의 자식 객체를 부모 클래스 타입 하나로 다룰 수 있는 기술
		// 다형성을 쓰는 이유?
		// : 부모 타입 레퍼런스로 다양한 자식 타입들을 다 받아줄 수 있음
		
		// 다형성 적용 전
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		System.out.println("=== 다형성 적용 후 객체 배열로 ===");
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child2(5, 7, 2);
		arr[3] = new Child1(2, 3, 5);
		// 하나의 부모 타입으로 다양한 자식들을 받을 수 있음
		// -> 자식에게 접근할 때 하나의 부모 타입으로 접근 할 수 있음
		// -> 편리, 코드 길이 감소, 유연한 코딩 가능
		
		// 각각의 메소드 호출해보자 (printChild1, printChild2)
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		// 자식객체를 부모객체로 해석했을 때
		// 자동 형변환이 일어난다.
		// 하지만 부모 타입으로 해석 된 자식객체들의 기능을
		// 사용하려면 부모타입을 다운캐스팅 해줘야 한다.
		
		System.out.println("=== 반복문 이용해서 출력 ===");
		for (int i = 0; i < arr.length; i++) {
			// 각 인덱스별로 어떤 자식 객체를 참조하고 있는지 어떻게 판별하지?
			// <instanceof 연산자>
			// 현재 레퍼런스가 어떤 클래스형의 주소를 참조하고 있는지 확인할 때 사용
			// 클래스 타입이 일치하면 true, 아니면 false를 리턴
			if (arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			} else if(arr[i] instanceof Child2) {
				((Child2)arr[i]).printChild2();
			}
		}
		
		System.out.println("=== for-each문 이용해서 출력 ===");
		for (Parent p : arr) {
			if (p instanceof Child1) {
				((Child1)p).printChild1();				
			} else {
				((Child2)p).printChild2();		
			}
		}
		
		System.out.println("=== 오버라이딩 적용해서 출력 ===");
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
			// -> 자동으로 실제 참조하고 있는 객체의 메소드를 찾아가서 실행
			// 프로그램이 실행 되기 전에 컴파일이 되면서 모든 메소드는 "정적 바인딩" 됨
			// 그러나 메소드 실제 호출 시 해당 객체 타입을 기준으로 다시 바인딩 되는 것을"동적 바인딩"
			// 이라고 함. 상속 관계로 이루어져 다형성이 적용 된 경우 메소드 오버라이딩이 되어 있으면
			// 정적 바인딩 된 메소드 코드보다 오버라이딩 된 메소드를 우선적으로 실행함
			
		}
	}

}
