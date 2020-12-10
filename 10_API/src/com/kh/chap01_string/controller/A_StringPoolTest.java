package com.kh.chap01_string.controller;

import java.util.Scanner;

public class A_StringPoolTest {
	
	public void method1() {
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// -> toString도 오버라이딩 되어 있음
		
		System.out.println(str1 == str2); // false
		// -> 힙 영역에서 다른 공간에 생성 되어 주소 값이 다르므로 주소 값 비교는 false
		
		System.out.println(str1.equals(str2)); // true
		// -> Object의 equals()가 호출 된다며 주소값 비교이므로 fasle가 나오겠지만
		//    String 클래스에 equals()가 오버라이딩 되어서 실제 값 비교를 수행하므로 true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// -> hashCode()도 실제 값이 같으면 같은 hashCode 값이 나오도록 오버라이딩 되어 있음
		
		// 오버라이딩 된 hashCode말고 실제 주소값을 알기 위해
		// System.identityHashCode(); 사용
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method2() {
		// 2. 문자열을 리터럴로 생성
		String str1 = "abc";
		String str2 = "abc";
		
		// == 는 주소값 비교
		System.out.println(str1 == str2);
		// -> 생성자를 통한 문자열 생성 후  == 은 주소값 비교이기 때문에
		// false가 나오지만 여기서는 true가 나옴
		// 왜?
		// 생성자가 아닌 리터럴로 값을 초기화하면
		// Heap 영역에 있는 String pool로 값이 초기화 됨
		// String pool 영역에서는 동일한 문자열을 중복으로 생성하지 않기 때문에
		// 동일 문자열인 경우 동일한 주소값을 반환하기 때문에 true
		// 실제 값이 같으므로 equals(), hashCode() 또한 같은 값이 나올 것
		
		System.out.println(System.identityHashCode(str1)); // true
		System.out.println(System.identityHashCode(str2)); // true
		// String pool영역의 동일 문자열은 주소값이 같으므로
		// 동일 객체를 참조하고 있는 것을 알 수 있음
		
		// 만약에 str2값을 변경하려고 하면 해당 참조하고 있던 그 값이 변경이 될까?
		str2 = "bcd";
		
		System.out.println(System.identityHashCode(str2)); // false
		// 해당 자리에서 값이 변경 되는 게 아니라, 새로운 공간에 값이 생기고
		// 해당 주소를 가리키게 됨
		
		str2 = "abc";
		
		System.out.println(System.identityHashCode(str2)); // true
		// 다시 abc로 값을 변경하면 기존의 그 값을 가리키게 됨
		
		// 따라서 String클래스는 불변 즉, 상수와 같음
		// "" 로 초기화 하면 값이 같을 때 동일한 객체를 가리킨다!
		// 하지만 생성자로 초기화하면 값이 같아도 동일 객체를 가리키는게 아니기 때문에
		// 주소값이 다르다!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1 : ");
		String str3 = sc.nextLine();
		System.out.print("입력 2 : ");
		String str4 = sc.nextLine();
		
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str3 == str4 : " + (str3 == str4));
		
		// Scanner로 입력받은 값은 new String 생성자로 들어가기 때문에 다른 객체
		
		
	}

}
