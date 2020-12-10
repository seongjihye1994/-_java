package com.kh.chap01_string.controller;

import java.util.Scanner;

public class A_StringPoolTest {
	
	public void method1() {
		// 1. �����ڸ� ���� ���ڿ� ����
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// -> toString�� �������̵� �Ǿ� ����
		
		System.out.println(str1 == str2); // false
		// -> �� �������� �ٸ� ������ ���� �Ǿ� �ּ� ���� �ٸ��Ƿ� �ּ� �� �񱳴� false
		
		System.out.println(str1.equals(str2)); // true
		// -> Object�� equals()�� ȣ�� �ȴٸ� �ּҰ� ���̹Ƿ� fasle�� ����������
		//    String Ŭ������ equals()�� �������̵� �Ǿ ���� �� �񱳸� �����ϹǷ� true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// -> hashCode()�� ���� ���� ������ ���� hashCode ���� �������� �������̵� �Ǿ� ����
		
		// �������̵� �� hashCode���� ���� �ּҰ��� �˱� ����
		// System.identityHashCode(); ���
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method2() {
		// 2. ���ڿ��� ���ͷ��� ����
		String str1 = "abc";
		String str2 = "abc";
		
		// == �� �ּҰ� ��
		System.out.println(str1 == str2);
		// -> �����ڸ� ���� ���ڿ� ���� ��  == �� �ּҰ� ���̱� ������
		// false�� �������� ���⼭�� true�� ����
		// ��?
		// �����ڰ� �ƴ� ���ͷ��� ���� �ʱ�ȭ�ϸ�
		// Heap ������ �ִ� String pool�� ���� �ʱ�ȭ ��
		// String pool ���������� ������ ���ڿ��� �ߺ����� �������� �ʱ� ������
		// ���� ���ڿ��� ��� ������ �ּҰ��� ��ȯ�ϱ� ������ true
		// ���� ���� �����Ƿ� equals(), hashCode() ���� ���� ���� ���� ��
		
		System.out.println(System.identityHashCode(str1)); // true
		System.out.println(System.identityHashCode(str2)); // true
		// String pool������ ���� ���ڿ��� �ּҰ��� �����Ƿ�
		// ���� ��ü�� �����ϰ� �ִ� ���� �� �� ����
		
		// ���࿡ str2���� �����Ϸ��� �ϸ� �ش� �����ϰ� �ִ� �� ���� ������ �ɱ�?
		str2 = "bcd";
		
		System.out.println(System.identityHashCode(str2)); // false
		// �ش� �ڸ����� ���� ���� �Ǵ� �� �ƴ϶�, ���ο� ������ ���� �����
		// �ش� �ּҸ� ����Ű�� ��
		
		str2 = "abc";
		
		System.out.println(System.identityHashCode(str2)); // true
		// �ٽ� abc�� ���� �����ϸ� ������ �� ���� ����Ű�� ��
		
		// ���� StringŬ������ �Һ� ��, ����� ����
		// "" �� �ʱ�ȭ �ϸ� ���� ���� �� ������ ��ü�� ����Ų��!
		// ������ �����ڷ� �ʱ�ȭ�ϸ� ���� ���Ƶ� ���� ��ü�� ����Ű�°� �ƴϱ� ������
		// �ּҰ��� �ٸ���!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		String str3 = sc.nextLine();
		System.out.print("�Է� 2 : ");
		String str4 = sc.nextLine();
		
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str3 == str4 : " + (str3 == str4));
		
		// Scanner�� �Է¹��� ���� new String �����ڷ� ���� ������ �ٸ� ��ü
		
		
	}

}
