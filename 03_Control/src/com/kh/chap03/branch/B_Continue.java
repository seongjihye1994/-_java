package com.kh.chap03.branch;

public class B_Continue {
	// continue : �ݺ��� �ȿ����� ��� �����ϸ�
	// continue�� ������ �Ǹ� �Ʒ��� ������ �������� �ʰ�
	// ���� ����� �ݺ�����, ó������ (=for���� ������, while���� ���ǽ�) ���ư���� �ǹ�
	
	public void method1() {
		// 1���� 10���� Ȧ�� ���
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) continue;
			System.out.print(i + " ");
		} 
	}
	
	public void method2() {
		// 1���� 100������ �������� �� ���
		// ��, 4�� ����� ���� ���
		int sum = 0;
		
		for (int i = 1; i < 101; i++) {
			if (i % 4 == 0) continue;
			sum += i;
		} System.out.printf("1���� 100������ ��(4�� ��� ����) : %d\n", sum);
	}
	
	public void method3() {
		// 2~9�ܱ����� ������ ���
		// ��, 4�� ����� ���� ���� ���
		for (int dan = 2; dan < 10; dan++) {
			if (dan % 4 == 0) continue;
			for (int gugu = 1; gugu < 10; gugu++) {
				System.out.printf("%d X %d = %d\n", dan, gugu, dan * gugu);
			}
		}
	}
	
	public void method4() {
		// 2 ~ 9�ܱ����� ������ ���
		// ��, ���ϴ� ������ ¦���� ���� ���
		
		for (int dan = 2; dan < 10; dan++) {
			for (int gugu = 1; gugu < 10; gugu++) {
				if (gugu % 2 == 0) continue;
				System.out.printf("%d X %d = %d\n", dan, gugu, dan * gugu);
			}
		}
	}

}
