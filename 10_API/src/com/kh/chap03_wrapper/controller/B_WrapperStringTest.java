package com.kh.chap03_wrapper.controller;

public class B_WrapperStringTest {
	
	// ���ڿ� -> �⺻ �ڷ���
	// �⺻ �ڷ��� -> ���ڿ�
	public void method1() {
		String str1 = "10";
		String str2 = "15.3";
		// Ÿ���� ���ڿ�, ���� ���� �ٷ�� ���� ���� double���� ���
		
		System.out.println(str1 + str2); // 1015.3
		
		// 1. String -> �⺻�ڷ������� �ٲٱ� ����
		// �ش�  WrapperŬ����.parse~() �޼ҵ� ���
		byte b = Byte.parseByte(str1);
		short s = Short.parseShort(str1);
		int i = Integer.parseInt(str1);
		long l = Long.parseLong(str1);
		// ���� str2 (double)�� ������ err!
		// java.lang.NumberFormatException �߻�
		
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		// �̰� ���� x
		
		boolean bool = Boolean.parseBoolean("false");
		// ���� "true" / "false"�̿��� �ٸ� ���ڰ� ����
		// �Ľ��� �� ���ٴ� �ǹ̷� false�� ��ϴ�. (���� �߻� x)
		System.out.println("bool : " + bool);
		
		// char�� �Ľ����� ���ϰ� charAt(�ε���)���� ���� �ϳ��� �и��س�
		char c = "abc".charAt(0);
		
		System.out.println(i + d); // ���ϴ� ��� ���� + �Ǽ��� ���� ����
		// 25.3 (10 + 15.3)
		
		
		
		
		
		// 2. �⺻ �ڷ��� -> String
		// �ش� WrapperŬ����.valueOf().toString();
		String strB = Byte.valueOf(b).toString();
		// 10 byte�� String����
		
		
		// **Wrapper Ŭ������ �ƴ� String Ŭ������ �޼ҵ带 ���� ����ϸ� �� ����
		String strB2 = String.valueOf(b);
		// 10 byte�� String����
		// ���� ������ ���
		
		
		
		
		
		
	}

}
