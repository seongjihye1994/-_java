package com.kh.chap01_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method1() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �̿��Ͽ� ���ڿ� �и�
		
		// ��� 1. �и� �� ���ڿ��� �迭�� ó���ϰ� ���� ��
		// -> String Ŭ������ split �޼ҵ�
		//	    �޼ҵ��(�Ű�����) : ��ȯ��
		// split(String regex) : String[]
		String[] arr = str.split(",");
		System.out.println("�и� �� ���ڿ��� ���� : " + arr.length); // 6
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		Java		[0]�� �ε���
//		Oracle		[1]�� �ε���...
//		JDBC
//		HTML
//		CSS
//		Spring
		
		// ��� 2. �и� �� ���ڿ����� ��ü�� ����ϰ� ���� ��
		// -> java.util.StringTokenizer Ŭ���� �̿�
		StringTokenizer stn = new StringTokenizer(str, ",");
		// (�ڸ��� ���� ���ڿ�, ���� ���ڿ�);
		
		// countToken() : int -> ��ū ���� ����
		System.out.println("�и� �� ���ڿ��� ���� : " + stn.countTokens());
		// �и� �� ���ڿ��� ���� : 6
		
//		int length = stn.countTokens(); // 6
//		for (int i = 0; i < length; i++) {
//			// nextToken() : String -> ���� ��ū ����, ���� ��ū ����
//			System.out.println(stn.nextToken());
//		} 

		// hasMoreTokens() : boolean
		// -> ��ū�� �����ִ��� Ȯ��
		while (stn.hasMoreTokens()) { // ����� ������ while�� �ݺ�
			 System.out.println(stn.nextToken());
		} // �ַ� ����ϴ� ���
		
		String str2 = "JAVA Oracle JDBC HTML CSS Spring";
		StringTokenizer stn2 = new StringTokenizer(str2);
		// ��ȹ ���ڸ� ���ڷ� ���� ������ ����Ʈ ��ȹ���ڴ� ����
		// ���� ���ڸ� �Ⱥ����� �������� �ν�
		System.out.println("==== ���� ���� ====");
		while (stn2.hasMoreTokens()) {
			System.out.println(stn2.nextToken());
		}
//		JAVA
//		Oracle
//		JDBC
//		HTML
//		CSS
//		Spring
		
		String str3 = "JAVA@Oracle!JDBC*CSS!Spring";
		StringTokenizer stn3 = new StringTokenizer(str3, "@!*");
		// �������� ��ȹ ���ڸ� ���ڷ� ���� �� ����, ��ȹ ���ڴ� ���̰� 1
		
		System.out.println("=== ��ȹ ���� ������ ���� ===");
		while (stn3.hasMoreTokens()) {
			System.out.println(stn3.nextToken());
		} System.out.println(); // �ٰ���
//		JAVA
//		Oracle
//		JDBC
//		CSS
//		Spring
		
		// *** ���� split���� ���� ���� ���ڸ� �����ϰ��� �Ѵٸ�?? ***
		// [] ���ȣ �ȿ� �־���� ��
		String[] arr2 = str3.split("[@!*]");
		for (String s : arr2) {
			System.out.println(s);
		}
//		JAVA
//		Oracle
//		JDBC
//		CSS
//		Spring
		
		StringTokenizer stn4 = new StringTokenizer(str, ",", true);
		// boolean �Ű������� �߰��Ͽ� ��ȹ ���ڵ� ��ū���� ����
		// -> �⺻ ���� false�� ��ū���� �������� ����
		
		System.out.println("==== ��ȹ ���ڵ� ��ū���� ���� ====");
		while(stn4.hasMoreTokens()) {
			System.out.println(stn4.nextToken());
		}
//		Java
//		,
//		Oracle
//		,
//		JDBC
//		,
//		HTML
//		,
//		CSS
//		,
//		Spring
		
		// split()
		// - ���� : ���� ������ ��� ���� (�پ��� �������� �ɰ� �� ����)
		// - ���� :  �ӵ��� ����(���� ǥ���� ����ϱ� ����)
		
		// StringTokenizer
		// - ���� : �ӵ��� ���� (�뷮)
		// - ���� :  ���� ǥ���� ��� �Ұ��� (�ܼ��� ���ڷθ� �ɰ� �� ���� -> ������)
		
		
		
		
		
		
		
		
		
	
	}
	
	

	
	
	
	
	

}
