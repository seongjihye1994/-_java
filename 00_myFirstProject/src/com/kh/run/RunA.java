package com.kh.run;

//import com.kh.first.A_MethodPrinter; // �ܺ��� Ŭ������ ����ϰ��� �� �� import ���� �ۼ�

public class RunA {

	public static void main(String[] args) {
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 ���θ޼ҵ忡�� �����Ϸ���? 
		
		// 1. ������ �޼ҵ尡 �ִ� Ŭ������ ���� + ����Ʈ
		//     Ŭ������ ���� = new Ŭ������();
		
		//A_MethodPrinter a = new A_MethodPrinter(); // 1) ����Ʈ�� �� ��
		
		com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter(); // 2) ����Ʈ�� ���� ���� ��
		
		// 2. �޼ҵ� ����(ȣ��)
		a.methodA(); // ������.�޼ҵ�()
		a.methodB();
		a.methodC();
		
		

	}

}
