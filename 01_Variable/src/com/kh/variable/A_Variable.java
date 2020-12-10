package com.kh.variable;

// �ٸ� ��Ű�� �ȿ� ���� Ŭ�������� ���� �� ����
// -> Ŭ�������� ��Ű������� �����ϴ� ���� Ǯ�����̹Ƿ�
public class A_Variable {
	public void printValue() {
		System.out.println("���� ��� ��");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		
		
		int point = 100;
		int bonus = 10;
		int personCount = 10;
		
		System.out.println("���� ��� ��");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
	
		// ������?
		// - ��� ���� �޸𸮿� �Է��ϱ� ���� ����
		
		// 2. ������ ����ϴ� ����?
		// (1) ���� �ǹ̸� �ο��ϱ� ���� ���
		// (2) �� �� ���� �����صΰ� ��� ����� �������� ���
		// (3) ���������� ������ �� ����
		
	}
	
	public void declareVariable() {
		// 3. ���� ����
		// - �޸𸮿� ������ �Ҵ���
		// ���� : �ڷ��� ������;
		// �������� �׻� �ҹ��ڷ� �����ϰ� ���� �ܾ�� �Ǿ� �ִ� ���
		// ù ���ڴ� �빮�ڷ� ǥ�� => ī�� ǥ���
		
		// ���� (boolean)
		boolean isTrue; // 1byte
		
		// ������ (���� & �Ǽ�)
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte --> ����Ʈ��
		long lNum; // 8byte
		
		float fNum; // 4byte
		double dNum; // 8byte --> ����Ʈ��
		
		// ����(���� & ���ڿ�)
		char ch; // 2byte
		
		String str; // ** �⺻ �ڷ����� �ƴ� ���� �ڷ���! ������ ��ü
		
		// ���� �ʱ�ȭ
		isTrue = true;
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // long�ڷ����� l�� �Բ� ǥ�����ִ°� �����ε�,
					// ǥ�ø� ���� �ʾƵ� ������ �߻����� �ʴ´�.
					// �� ������ �ڵ� ����ȯ�� �Ͼ�� ����
		
		fNum = 4.8f; // f �Ǵ� F�� �ٿ� float �ڷ��� ���̶�� ���� ǥ�����־�� ��
					// ������ �ս��� �Ͼ ���ɼ��� �ֱ� ������ (���� ����ȯ)
		dNum = 8.0/*d*/; // �⺻���̱� ������ d�� ���̰ų� ������ �ʰų� �������
		
		// ch = 'ABC'; // char�� ���Ϲ��ڸ� ���� �����ϴ�.
		ch = 'A';
		
		str = "Hello, world!";
		
		// �ʱ�ȭ�� ���� ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
	
	}
	
	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ(�� ����)
		// ���� : �ڷ��� ������ = ��;
		
		// ���� �޼ҵ� �ȿ��� �������� �ߺ� �Ұ�
		// �޼ҵ� �ȿ� ���� �� ������ '��������' �̹Ƿ� �ش� �޼ҵ忡����
		// ��� ���� -> �ٸ� �޼ҵ忡���� ��� �Ұ�
		// ���� �޼ҵ�� �Ʒ� �޼ҵ�� �ٸ� �����̹Ƿ� ���� �̸��� '��������'�� ����� �� ����
		
				
		// ����
		boolean isTrue = true;
		
		// ���� (���� & �Ǽ�)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8l;
		
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// ����(���� & ���ڿ�)
		char ch = '��';
		String str = "�ȳ��ϼ���!";
		
		// �鿩���� ����Ű : ���� ���� �� Ctrl + Shift + f
		
		// -----------------------------------------
		
		// 4. ���� ��� ��Ģ
		int number;
		//int number; // ������ �ߺ� �Ұ�
		int Number;
		
		//int int; // ����� ��� �Ұ�
		// int true;
		
		int age1;
		//int 1age; // ���ڷ� ���� �Ұ�
		
		int number_1;
		int number$2;
		//int number#3; // _, $�̿��� Ư�����ڴ� ��� �Ұ�
		
		// ���� �ܾ�� �� �������� ��� �ٿ����� �ι�° �ܾ����
		// ù ���ڸ� �빮�ڷ� �ۼ� -> ī�� ǥ���
		
		String username;
		String userName;
		
		// �ڹٴ� �ѱ۵� ���������� ��� ����
		String �̸�; // �ѱ��� ������� ���� ȯ�濡�� ������ �߻���ų �� �־� ���� x
		
		
		
		
		
		
		
	}
}
