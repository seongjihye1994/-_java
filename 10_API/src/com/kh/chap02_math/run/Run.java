package com.kh.chap02_math.run;

public class Run {

	public static void main(String[] args) {
		
		// Math Ŭ������ ���� �Ǹ��� ��� ��� �ʵ�, �޼ҵ�� ��� static
		
		// static --> ���α׷� ���� �� �� �� �� �� static ����(���� �޸� ����)
		// 			    �� �ø��� ��ü �����ؼ� ����� �ʿ� ���� Math. ���� �����ؼ� ���
		
		// Math�� ������ �����ڵ� private -> ������ �ʿ� �����Ƿ� �������� ���ϵ���
		
		// ��� �ʵ�
		System.out.println("���� : " + Math.PI); // ���� : 3.141592653589793
	
		// ���밪 -> abs
		int num1 = -10;
		System.out.println("���밪 : " + Math.abs(num1)); // ���밪 : 10
		
		// �ø� -> ceil
		double num2 = 4.349;
		System.out.println("�ø� : " + Math.ceil(num2)); // �ø� : 5.0

		// �ݿø� -> round
		System.out.println("�ݿø� : " + Math.round(num2)); // �ݿø� : 4

		// ���� -> floor
		System.out.println("���� : " + Math.floor(num2)); // ���� : 4.0
		
		// �����(��Ʈ) -> sqrt
		System.out.println("������ : " + Math.sqrt(4)); // ������ : 2.0
		
		// ���� -> pow
		System.out.println("2�� 10���� : " + Math.pow(2, 10)); // 2�� 10���� : 1024.0

	}

}
