package com.kh.operator;

public class C_Arithmetic {
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : " + (num1 + num2)); // ��ȣ�� ������ 103
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + num1 * num2); // ���ϱ�� ������� ���ϱ⻩�⺸�� �켱������ ����Ǵϱ� ��ȣ �ʿ����
		System.out.println("num1 / num2 : " + num1 / num2); // int�� int�� �������� �� : 3
		System.out.println("num1 % num2 : " + num1 % num2); // �������� ������ -> 1
	
		// %(��ⷯ)�� ���� ���ǹ����� ¦Ȧ �Ǻ� � ���� ���
		// �� % 2 = 0 �Ǵ� 1�̶�� ����� ����
		// ���� ��� ���� 0�̸� ���� ¦��, ��� ���� 1�̸� ���� Ȧ��
		
		// ���� ��� �Ǻ����� ���� ���
		// 5�� ����ΰ�?
		// �� % 5 => ��� ���� 0�̸� 5�� ���
	}
	

}
