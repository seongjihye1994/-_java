package com.kh.practice1.controller;

import com.kh.practice1.exception.NumberRangeException;

public class NumberRangerExceptionTest {
	
	// controller�� �޼ҵ� �ȿ�����
	// ù��° ���� �ι�° ���� ������� Ȯ���Ͽ� ����� ������ true,
	// �ƴϸ� false ����
	// ��, ���� �� �� ���� 1~100 ������ ���� �ƴ϶��  NumberRangeException �߻�
	// (���� �޼��� : 1~100 ������ ���� �ƴմϴ�) ��Ű�� main()���� �Ѱ� main()���ä� try~catch ���� �ۼ�
		
	public boolean checkDouble(int num1, int num2) throws NumberRangeException {
		if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
			 throw new NumberRangeException("�ݵ�� 1~100������ ������ �Է��ؾ� �մϴ�.");
		} else {
			boolean result = (num1 % num2 == 0) ? true : false;
			return result;
		}
	}  

}
