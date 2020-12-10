package com.kh.chap07_method.part02_methodTest.controller;

public class StaticMethod {
	
	// static �޼ҵ�� ���α׷� ���� �� static ������ �Ҵ�
	// �� ��ü�� ������ �ʾƵ� ȣ�� ����~!
	// ���� ���α׷� ���� �� �޸� �������� ����
	
	// 1. �Ű����� ���� ��ȯ�� ���� static �޼ҵ�
	public static void method1() {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + "��" + num2 + "�� ���� " + (num1 + num2) + "�Դϴ�.");
	}
	
	// 2. �Ű����� ���� ��ȯ�� �ִ� static �޼ҵ�
	public static int method2() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;
	}
	
	// 3. �Ű����� �ְ� ��ȯ�� ���� static �޼ҵ�
	public static void method3(String name) {
		System.out.println(name + "���� �湮�� ȯ���մϴ�!");
	}
	
	// 4. �Ű����� �ְ� ��ȯ�� �ִ� static �޼ҵ�
	public static String method4(String name) {
		return name + "���� �湮�� ȯ���մϴ�.";
	}
	
}
