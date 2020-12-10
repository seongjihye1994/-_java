package com.kh.variable;

// ��Ģ������, ���� �ٸ� Ÿ���� ����δ� ������ �Ұ����ϴ�.

public class D_Cast {
	// �ڵ� ����ȯ
	public void rule1() {
		// int(4byte) -> double(8byte)
		int i = 12;
		double d = 2.3;
		double result = i + d; // ���� ���� ū ������ ������ �ڵ� ����ȯ
		// 12 + 2.3 > 12.0 + 2.3 
		System.out.println("result : " + result);
		// int���� double���� ���� ����� double������ �ڵ� ����ȯ ��
		
		
		// int(4byte) -> long(8byte)
		int i2 = 2147473647;
		long l = 1000000000L;
		long result2 = i2 + l;
		System.out.println("result2 : " + result2);
		// int���� long���� ���� ����� long������ �ڵ� ����Ⱥ ��
		
		// float(4byte) -> double(8byte)
		float f = 1.0f;
		double d2 = f;
		System.out.println("f : " + f);
		System.out.println("d2 : " + d2);
		
		// long(8byte) -> float(4byte)
		// ũ��� long�� �� ū�� �� float�� �ڵ� ����ȯ�� �����ұ�??
		// -> �Ǽ��� float�� ������ long���� ǥ�� ������ ���� ������ �� ũ�� ������
		// *** ��� ������ �Ǽ��� �ڵ� ����ȯ �ȴ�.
		
		long l2 = 10000000L;
		float f2 = l2;
		System.out.println("f2 : " + f2 + "��� ������ �Ǽ��� �ڵ� ����ȯ �ȴ�!");
	
		// char(2byte) -> int(4byte)
		int num = 'A'; // int�� ���� num�� char�� ���ͷ� �� ����
		System.out.println("num : " + num); // ���ڿ� �ش��ϴ� ��Ƽ�ڵ� ���� �����
		
		// char �ڷ����� ���� ���� ����
		char ch = 65;
		// char ch2 = -65; // �ƽ�Ű�ڵ�� -���� ����.
		System.out.println("ch" + ch);
		
		// byte, short�� �̿��� ����
		byte b2 = 1;
		byte b3 = 10;
		// byte result3 = b2 + b3; // -> �����߻� : byte�� short�� ���� �� ������ int������ ó��
		// int result3 = b2 + b3;
		
		// ������ ����� byte Ÿ������ ó���ϰ� �ʹٸ�? -> ���� ����ȯ ���
		byte result3 = (byte)(b2 + b3);
		System.out.println("result3 : " + result3);
		
	}
	
	// ���� ����ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� �ٲٴ� ��
	//  -> ����ȯ ���� �Ұ�
	public void rule2() {
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum;
		// �� ���� ���� ����� double �̱� ������ int�� ���� iSum���� ���� �Ұ�
		
		// ���� �ذ� ���
		// 1. ���� ����� int�� ���� ����ȯ
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		// �Ǽ� -> ������ ���� ����ȯ �� �Ҽ��� �Ʒ� �κ��� ��� ���� ó��
		
		// 2. double�� ���� int������ ���� ����ȯ
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		// 3. ���� ����� double�� ����
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);

	}
	
	// ������ �ս� �׽�Ʈ
	public void dataLoss() {
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		byte bNum = (byte) iNum; // ���� ����ȯ
		System.out.println("bNum : " + bNum);
		// -> ����� ����� ������ �ս��� �߻��ϱ� ������
		//    ���� ����ȯ�� �����ؼ� ����ؾ� ��
		
		
		
		
	}

}
