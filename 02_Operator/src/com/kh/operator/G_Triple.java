package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������ : �׸��� 3���� ������
	// ���ǽ� ? ���ǽ��� ���� ��� ��1 : ���ǽ��� ������ ��� ��2;
	// �� �� ���ǽ��� �ݵ�� true, false�� �����Բ� �ۼ��ؾ� ��
		
	public void method1( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? input + "�� ����̴�." : input + "�� �����̴�.";
		System.out.println(result);
	}
	
	public void method2() {
		// �Է� ���� ������ Ȧ������ ¦������ �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0) ? input + "��/�� ¦���̴�." : input + "��/�� Ȧ���̴�.";
		System.out.println(result);
	
	}
	
	public void method3( ) {
		// ���� �������� ��ø ���
		// �Է� ���� ������ 0���� �ƴ��� �Ǻ� ��
		// 0�� �ƴ� ��� ������� �������� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input == 0) ? input + "�� 0�̴�." : ((input > 0) ? input + "��/�� ����̴�." : input + "�� /�� �����̴�.");
		// �����ε� ��� �����ϴ�.
		System.out.println(result);
	}

}
