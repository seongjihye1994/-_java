package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// 1. 기본 생성자로 객체 생성(필드값 x)
		User user = new User();
		System.out.println(user.info());
		
		// JVM의 기본 값 출력
		// 만약 값들을 초기화 하고 싶으면 일일히 setter 메소드를 이용해 값을 입력해야 했음
		
		// 2. 매개변수 생성자로 객체 생성
		// -> 객체 생성과 동시에 초기화하는 방법
		User user2 = new User("user2", "pass02", "홍길동");
		System.out.println(user2.info());
		
		// 생성자는 기본 생성자 말고 다양한 매개변수 생성자를 만들 수 있음
		User user3 = new User("user03", "pass03", "우별림", 20, 'F');
		System.out.println(user3.info());
		

	}

}
