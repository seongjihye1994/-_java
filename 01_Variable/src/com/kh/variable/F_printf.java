package com.kh.variable;

public class F_printf {
	
	public void printfMethod() {
		
		System.out.println('a');
		System.out.printf("���� a : %c\n", 'a');
		
		System.out.printf("%c %c\n", 'a', 'b');
		System.out.printf("%-3c %5c", 'a', 'b'); // - : ��������, ��� : ����������
		System.out.println(); // �ܼ� �ٰ���
		
		System.out.printf("%5d%-5d%5d\n", 100, 200, 300);
		System.out.printf("%s\t%f\t%10.2f\n", "ABC", 10.95, 75.957);
		// 10ĭ ������ ���� �� �Ҽ��� 2°�ڸ�����
		
		
		
	}

}
