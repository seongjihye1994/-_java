package com.kh.practice2.model.vo;

public class Circle {
	
	public static final double PI = 3.14;
	private static int radius = 5;
	
	public Circle() {}
	
	public void incrementRadius() {
		System.out.println("������ 1 ���� : " + ++radius);
	}
	
	// �ѷ�
	public void getAreaOfCircle() {
		System.out.printf("���� �ѷ� : %.2f\n", 2 * radius * PI);
	}
	
	// ����
	public void getSizeOfCircle() {
		System.out.printf("���� ���� : %.2f\n", radius * radius * PI);		
	}
	
	

}
