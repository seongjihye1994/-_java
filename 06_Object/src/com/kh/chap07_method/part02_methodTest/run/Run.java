package com.kh.chap07_method.part02_methodTest.run;

import com.kh.chap07_method.part02_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method.part02_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		
		NonStaticMethod test = new NonStaticMethod();
		// 1. �Ű������� ��ȯ ���� ���� �޼ҵ� ȣ��
		test.method1();
		
		// 2. �Ű��������� ��ȯ ���� �ִ� �޼ҵ� ȣ��
		// �� ��ȯ���� ��ġ�ϴ� �ڷ����� ������ �޼ҵ� ���� ���� ��ȯ ���� �޾Ƽ� ���
		String str = test.method2();
		System.out.println(str);
//		System.out.println(test.method2());
		
		// 3. �Ű����� �ְ� ��ȯ ���� ���� �޼ҵ�
		test.method(10, 5);
		// **�ݵ�� ���� ���� �Ű������� Ÿ�԰� ������ ������ ��ġ�ϴ� ���� �Ѱ� ��� ��

		// 4. �Ű����� �ְ� ��ȯ���� �ִ� �޼ҵ�
		int sum = test.method4(10, 20);
		System.out.println(sum);
		
		System.out.println("�Ʒ����ʹ� static �޼ҵ�");
		
		// 1. ��ȯ x, �Ű����� x static �޼ҵ�
		StaticMethod.method1(); 
		
		// 2. ��ȯ 0, �Ű����� x static �޼ҵ�
		System.out.println("10�� 20�� ����" + StaticMethod.method2() + "�Դϴ�.");
		
		// 3. ��ȯ x, �Ű����� o
		StaticMethod.method3("�캰��");
		
		// 4. ��ȯ o, �Ű����� o
		System.out.println(StaticMethod.method4("�캰��"));
		
		
		
		
	}

}
