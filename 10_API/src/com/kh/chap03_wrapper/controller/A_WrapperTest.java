package com.kh.chap03_wrapper.controller;

public class A_WrapperTest {
	
	// Wrapper Ŭ����
	// => �⺻ �ڷ����� ��ü�� �������ִ� Ŭ����
	// => �⺻ �ڷ������� ����ص� ������ ���α׷��� ���� �ش� �⺻ Ÿ����
	//    ��ü�� ����ؾ� �ϴ� ��찡 ����
	
	// [�⺻ �ڷ���]			[Wrapper Ŭ����]
	// boolean				Boolean
	// char					Character
	// byte					Byte
	// short				Short
	// int					Integer
	// long					Long
	// float				Float
	// double				Double
	
	
	public void method1() {
		// Boxing : �⺻ �ڷ����� Wrapper Ŭ������ ��ȯ
		int num1 = 10;
		int num2 = 10;
		
		// 1. ��ü ������ ���� ���
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(num1 == num2); // �⺻ �ڷ��� ���� �� (�� ��) -> true
		System.out.println(i1 == i2); // ��ü ���� �� (�ּҰ� ��) => false
		
		// ��ü�� �����ϸ� �ش� Ŭ������ �޼ҵ� ��� ����
		System.out.println(i1.equals(i2)); // �� �񱳸� ���� Object�� equals �������̵� �Ͽ� ����
		System.out.println(i1.compareTo(i2)); // ������ 0
		// -> �� ���� ���ؼ� ������ ũ�� 1 ��ȯ, ������ ũ�� -1 ��ȯ, ������ 0 ��ȯ
		
		// 2. ��ü ������ ���� �ʰ� �ٷ� ����(Auto Boxing)
		Integer i3 = num2;
		
		// ��ü ������ ���� Boxing�ϰ� �Ǹ� ���ڿ��� ���� �� ����(���ڿ� -> ����) ��, ���ڷ� ��ȯ�� �� ���� ���ڸ� ������ ����!
		Integer i4 = new Integer("123");
		System.out.println(i4);

		// UnBoxing : Wrapper Ŭ������ �⺻ �ڷ��� ��ȯ ����
		
		// 1. Wrapper Ŭ������ ~Value() �޼ҵ� ���
		int num3 = i1.intValue();
		int num4 = i2.intValue();
		
		// 2. �޼ҵ� ������� �ʰ� �ٷ� ���� (Auto Unboxing)
		int num5 = i1;
		
		
		
	}
	

}
