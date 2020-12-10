package com.kh.chap01_string.controller;

public class D_BuildrBufferTest {
	
	// String Ŭ���� -> �Һ�
	// ��� ���� �����ϴ� ��� ������ �÷��Ͱ� ��� ���� ���� �ʴ� ���ڿ��� ������ �ϴ� ����
	// -> ������ ���� �о���⸸ �ϴ� ��� StringŬ���� ����
	
	// StringBuffer, StringBuilder -> ����(���ϴ�) Ŭ����
	// - ����� ������ ���� �޸� ����(����)�� ���ο� �����µ� ó������ 16���� ���ڸ�
	//   ������ �� �ִ� ���۰� ���� �ǰ� ���ڰ� ���� �ʿ� ���� �ڵ����� ����
	// - �ʱ� ���� ũ�⸦ ������ �� �ְ� ���ڿ��� ���̺��� 16���� ���ڸ� �� ������ �� ����
	
	public void method1() {
		// StringBuffer, StringBuilder �� �� ��� ������/�޼ҵ� ����
		// ������ �������� ����ȭ ó���� �Ǵ��� �ȵǴ����� ����
		
		// StringBuffer�� ����ȭ ó�� O (Thread safe)
		// StringBuilder�� ����ȭ ó�� X
		
		// Thread : ���α׷� ���� �帧�� �ϳ��� �ƴ� �� �������� ������ �� ����
		
		// ��, ��Ƽ ������� ���� ��������� ����
		// ��Ƽ ������ ȯ�� -> ����ȭ ó���� �Ǿ�� ������ -> StringBuffer ��� ����
		// ���� ������ ȯ�� -> ����ȭ ó���� �ϸ� �ӵ� ���� �߻� -> StringBuilder ��� ����
		
		// �츮�� StringBuilder�θ� �۾� StringBuffer�� ��ü�� �����ϸ� �����ϰ� �޼ҵ� ��� ����
		
		// 1) �⺻ �����ڷ� �����ϰ� �Ǹ� �⺻���� 16 ũ�⸸ŭ ����
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 ���뷮 : " + sb1.capacity()); // 16 (�ִ� ������ �� �ִ� �뷮 : ����Ʈ 16��)
		System.out.println("sb1 ���� : " + sb1.length()); // 0�� (���� ����ִ� �ε��� ����)
		System.out.println("==========================");
		
		// 2) �Ű����� �����ڷ� �μ��� �����ϸ� �ش� ũ�⸸ŭ�� ���뷮�� ���� ��
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 ���뷮 : " + sb2.capacity()); // �뷮�� 30���� ����
		System.out.println("sb2 ���� : " + sb2.length()); 
		System.out.println("==========================");
		
		// 3) �Ű����� �����ڷ� �μ��� ���ڷε� ���� ���� (�ش� ���ڿ��� �ε��� ���� + 16��ŭ�� ���뷮 �Ҵ�)
		StringBuilder sb3 = new StringBuilder("�ݰ���!!");
		System.out.println("sb3 ���뷮 : " + sb3.capacity()); // 5 + 16 = 21
		System.out.println("sb3 ���� : " + sb3.length()); // 5
		System.out.println("==========================");
				
	}
	
	public void method2() {
		// �Һ� vs ���� �׽�Ʈ
		
		// String
		String str = "�ݰ���!";
		System.out.println(System.identityHashCode(str)); // ���� �ּҰ� ��ȯ
		
		str += "�� String�̾�";
		System.out.println(System.identityHashCode(str)); // ���� �ּҰ� ��ȯ
		// �Һ� -> ���� ���� �Ǹ鼭 �����ϰ� �ִ� �ּ� ���� �ٲ�� ����
		// �ѹ� �����Ǹ� �� �ڸ��� ���� �ٲ��� �ʰ�(�Һ�) ���� ������
		
		System.out.println("===================");
		
		// StringBuilder
		StringBuilder sb = new StringBuilder("�ݰ���!");
		
		System.out.println("sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================");
//		sb : �ݰ���!
//		�ּҰ� : 2018699554
//		���뷮 : 20
//		���� : 4
		
		// StringBuilder���� ���� �����ϰ��� �� ���� �޼ҵ带 ���ؼ� �۾�
		// 1. append(String str) : StringBuilder -> ���ڿ� �߰�
		sb.append("�ȳ�!");
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================");
//		���� �� sb : �ݰ���!�ȳ�!
//		�ּҰ� : 2018699554   --->> ��ü�� �ּҰ��� �ٲ��� ����!(���� ����)
//		���뷮 : 20
//		���� : 7
		
		// ��, ���� ����Ǹ� �� �ڸ��� �ٷ� ���� �ٲ�(����), �� ��ü ���� x
		
		sb.append("�ٵ� ���ݸ� ��������!!!");
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================");
//		���� �� sb : �ݰ���!�ȳ�!�ٵ� ���ݸ� ��������!!!
//		�ּҰ� : 2018699554
//		���뷮 : 42
//		���� : 21
		
		// 2. delete(int start, int end) : StringBuilder -> ���ڿ� ����
		sb.delete(2, 5);
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================");
		// 2, 3, 4 �ε����� �ش��ϴ� ���� ���� �� (end -1���� ����)
//		���� �� sb : �ݰ���!�ٵ� ���ݸ� ��������!!!
//		�ּҰ� : 2018699554
//		���뷮 : 42
//		���� : 18
		
		// 3. insert(int offset, String str) : StringBuilder
		sb.insert(1, "������"); // 1�� �ε����� ������ ����
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================");
//		���� �� sb : �ݤ���������!�ٵ� ���ݸ� ��������!!!
//		�ּҰ� : 2018699554
//		���뷮 : 42
//		���� : 21
		
		// 4. reverse() : StringBuilder -> ������ �ٲٴ�
		sb.reverse();
		System.out.println("���� �� sb : " + sb.toString());
		System.out.println("�ּҰ� : " + System.identityHashCode(sb));
		System.out.println("���뷮 : " + sb.capacity());
		System.out.println("���� : " + sb.length());
		System.out.println("===================");
//		���� �� sb : !!!�似���� ������ ���!�簡��������
//		�ּҰ� : 2018699554
//		���뷮 : 42
//		���� : 21
		
	}
	
	public void method3() {
		StringBuilder sb = new StringBuilder("JavaProgram");
		
		sb.append("API").delete(4, 11).reverse();
		// �޼ҵ� ������ �̾ ȣ�� ����
		System.out.println(sb);
		
		// �޼ҵ� ��ȯ���� ��� StringBuilder �̹Ƿ� �޼ҵ带 �̾ ȣ���� �� ����
		// -> �ش� �޼ҵ��� ����� sb�� �ּҰ��� ��ȯ�Ǳ� ����
		// => �޼ҵ� ü�̴�(�޼ҵ� �̾��)
		// -> ���� -> ��ȯ -> ���� - ��ȯ .. ����

	}

}
