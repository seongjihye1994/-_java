package com.kh.chap03_class.model.vo;

import java.util.Scanner;

public class Run { // Person Ŭ������ ���� �����ڸ� default�� �����ϸ� ���� ��Ű�� ���ο����� ���� �����ϴ�.

	public static void main(String[] args) {
		Person p = new Person(); // Person Ŭ������ public�� �ƴ϶�� �ν����� ����
		
		p.setId("user01");
		p.setPwd("1234");
		p.setName("������");
		p.setGendor('F');
		p.setAge(20);
		p.setPhone("010-1234-5678");
		p.setEmail("jihye@iei.or.kr");
		
		System.out.println(p.toSting());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �̸� : ");
		String name = sc.next();
		
		// setter�� �̿��ؼ� �̸� �ٽ� ����
		p.setName(name);
		System.out.println(p.toSting());
	

	}

}
