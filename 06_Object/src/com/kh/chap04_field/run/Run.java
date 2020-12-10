package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		
		// 1. FieldTest1
		FieldTest1 f1 = new FieldTest1();
		
		// public -> ��𼭵� ���� ����
		System.out.println(f1.pub);
		
		// protected -> ���� ��Ű�� �������� ���� ���� + ��� ������� �ٸ� ��Ű���� ����
		System.out.println(f1.getPro()); // �׳� f1.pro�� ��� �Ұ�
										// �ٸ� ��Ű���鼭 ��� ������ �ƴϱ� ������ getter �޼ҵ带 ���� ���� ���;� ��
		// default -> ���� ��Ű�������� ���� ����
		System.out.println(f1.getDef()); // �׳� f1.def�� ��� �Ұ�
										// �ٸ� ��Ű���̱� ������ ��� �Ұ�
		// private -> ���� Ŭ���� �������� ���� ����
		System.out.println(f1.getPri()); // �׳� f1.pri�� ��� �Ұ�

		// 2. FieldTest2
		FieldTest2 f2 = new FieldTest2();
		f2.test(20);
		
		// 3. FieldTEst3
		// FieldTest3 f3 = new FieldTest3();
		// -> static ������ �����ϱ� ���ؼ��� ��ü�� ������ �ʿ䰡 ����
		
		// public static
		System.out.println(FieldTest3.pubSta);
		FieldTest3.pubSta = "changed public static"; // �� ���浵 ����
		System.out.println(FieldTest3.pubSta);
		
		// private static
		System.out.println(FieldTest3.getPriSta());
		FieldTest3.pubSta = "changed private static"; // �� ���浵 ����
		System.out.println(FieldTest3.getPriSta());

		// 4. FieldTest4
		System.out.println(FieldTest4.NUM);
		
		
		
	}

	
}
