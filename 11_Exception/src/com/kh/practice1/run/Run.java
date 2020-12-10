package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.controller.NumberRangerExceptionTest;
import com.kh.practice1.exception.NumberRangeException;

public class Run {
	// main()���� ������ ���� 2���� �Է� �޾�
	// checkDouble(int, int) : boolean
	// �޼ҵ��� �Ű������� �Ͽ� ȣ��
	
	// controller�� �޼ҵ� �ȿ�����
	// ù��° ���� �ι�° ���� ������� Ȯ���Ͽ� ����� ������ true,
	// �ƴϸ� false ����
	// ��, ���� �� �� ���� 1~100 ������ ���� �ƴ϶��  NumberRangeException �߻�
	// (���� �޼��� : 1~100 ������ ���� �ƴմϴ�) ��Ű�� main()���� 
	// �Ѱ� main()���� try~catch ���� �ۼ�
	
	public static void main(String[] args) {
		
		NumberRangerExceptionTest nret = new NumberRangerExceptionTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		int num2 = sc.nextInt();
		
		try {
			boolean result = nret.checkDouble(num1, num2);
			System.out.println("ù���� ���� �� ��° ���� ����� �³���? " + result);
		} catch (NumberRangeException e) {
			e.printStackTrace();
		} System.out.printf("%d, %d", num1, num2);
		
		
	}


}
