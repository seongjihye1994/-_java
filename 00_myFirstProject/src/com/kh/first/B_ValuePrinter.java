package com.kh.first;

public class B_ValuePrinter {
	// * ����Ģ
	// 1. ��Ű�� -> �ҹ��ڷ� ����
	// 2. Ŭ���� -> �빮�ڷ� ����
	// 3. �޼ҵ� -> �ҹ��ڷ� ����
	
	// �������� �ܾ ���� ��, �� �ܾ��� ���ڸ��� �빮�ڷ� ���� -> ī�� ǥ���
	// Valueprinter -> ValuePrinter
	
	public void printValue1() {
		// �������� ������ ���� ����ϴ� ����� �ϴ� �޼ҵ�
		
		// 1. ���� ���
		System.out.println(123); // ����
		System.out.println(1.23); // �Ǽ�
		
		// 2. ���Ϲ��� ���
		System.out.println('a'); // ���Ϲ��ڴ� ''(�̱� �����̼�) �ȿ�, ������ "" �ȿ�
		System.out.println('b');
		//System.out.println('ab'); // ''�ȿ� ���Ϲ��ڰ� �ƴϸ� ����!
		
		// 3. ���ڿ�(����)��� (������ "" �ȿ� ���� �����̼�)
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ݰ����ϴ�");
		
		// 4. ���ο��� ���� ����
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // ��ǻ�ʹ� �������ۿ� ǥ���� �� �����Ƿ�, �Ǽ� �� ������ �ҿ����ؼ� ������ ���� �� ����
		
		// 5. ���Ϲ��� + ������ ����
		System.out.println('a' + 1); // a�� �ƽ�Ű�ڵ忡�� 97
		System.out.println('b' + 1); // b�� �ƽ�Ű�ڵ忡�� 98
		
		// 6. ���ڿ�("")�� ������ ��? -> ���ڿ� ��ġ��
		System.out.println("�ȳ��ϼ���" + 1);
		System.out.println("�ݰ����ϴ�" + 1);
		
	}
	
	public void printValue2() {
		// ���ڿ��� ������ '+' ����
		System.out.println(9 + 9); // 18
		System.out.println(9 + "9"); // 99
		System.out.println("9" + 9); // 99
		System.out.println(9 + 9 + "9"); // 189
		System.out.println(9 + "9" + 9); // 999
		System.out.println("9" + 9 + 9); // 999 // ���� 9�� �߰� ���ڰ� ���� ���Ǵϱ� 99(���ڿ�)���� �ٽ� 9�� ���ϴϱ� 999
		System.out.println("9" + (9 + 9)); // 918
	}
	
	
	
	
	
	
	
}
