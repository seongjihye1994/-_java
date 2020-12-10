package com.kh.chap03_class.model.vo;

import java.util.Scanner;

public class Run { // Person 클래스의 접근 제한자를 default로 변경하면 같은 패키지 내부에서만 접근 가능하다.

	public static void main(String[] args) {
		Person p = new Person(); // Person 클래스가 public가 아니라면 인식하지 못함
		
		p.setId("user01");
		p.setPwd("1234");
		p.setName("성지혜");
		p.setGendor('F');
		p.setAge(20);
		p.setPhone("010-1234-5678");
		p.setEmail("jihye@iei.or.kr");
		
		System.out.println(p.toSting());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		
		// setter를 이용해서 이름 다시 수정
		p.setName(name);
		System.out.println(p.toSting());
	

	}

}
