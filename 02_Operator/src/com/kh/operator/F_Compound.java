package com.kh.operator;

public class F_Compound {
	// ���� ���� ������ : ��� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
	// ���� �ӵ��� �ξ� �����Ƿ� ����� ������
	
	public void method1() {
		
		int num = 12;
		
		// num�� 3 ������Ű��
		// num = num + 3;
		num += 3; // 15
		
		// num�� 5 ���� ��Ű��
		num -= 5; // 10
		
		// num�� 6�� ����
		num *= 6; // 60
		
		// num�� 2�� ����
		num /= 2; // 30
		
		// num�� 4�� �������� �� ������
		num %= 4; // 2
		
		System.out.println("num : " + num);
		
		
		
	}

}
