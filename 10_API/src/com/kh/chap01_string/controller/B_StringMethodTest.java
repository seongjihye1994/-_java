package com.kh.chap01_string.controller;

public class B_StringMethodTest {
	
	public void method1() {
		String str1 = "hello world";
		
		//    �޼ҵ��(�Ű�����) : ��ȯ��
		// 1. charAt(int index) : char
		char ch = str1.charAt(4); // 4�� �ε��� ȣ��
		System.out.println(ch); // o
		
		// 2. concat(String str) : String
		//    ��ģ ���ڿ��� new String���� ����
		String str2 = str1.concat("!!!"); // str1�ڿ� !!!�� ��ħ
		System.out.println(str2); // hello world!!!
		
		// 3. toString() : String
		System.out.println(str1.toString()); // hello world
		
		// 4. equals(Object obj) : boolean
		System.out.println(str1.equals(str2)); // false
//		System.out.println(str2.equals(str3)); // true
		
		// 5. hashCode() : int
		System.out.println(str1.hashCode()); // �ּҰ�
		System.out.println(str2.hashCode()); // �ּҰ�
		
		// 6. length() : int
		System.out.println(str1.length()); // �ε������� ��� 11
		
		// 7. subString(int beginIndex) : String
		//    subString(int beginIndex, int endIndex) : String
		System.out.println(str1.substring(6)); // world
		// �ε��� �� ������ �ش� �ε������� ������ �� ����
		System.out.println(str1.substring(0, 6)); // hello (���� ����) 
		// �ΰ� ���� : �ش� �ε������� �� �ε������� -1 ���� ����
		
		// 8. replace(char old, char new) : String
		String str4 = str1.replace('l', 'c');
		// str1�� �ִ� ��� l���ڸ� c�� ġȯ
		System.out.println(str4); // hecco worcd
		
		// 9. toUpperCase() / toLowerCase() : String
		// : �빮�ڷ�				: �ҹ��ڷ�
		String str5 = str1.toUpperCase();
		System.out.println(str5); // HELLO WORLD
		System.out.println(str5.toLowerCase()); // hello world

		// 10. trim() : String
		// : �� �� ���� ����
		String str6 = "   JAVA   ";
		System.out.println(str6.trim()); // JAVA
		
		// 11. toCharArray() : char[]
		// ���ڿ��� ���ڹ迭�� �ٲپ� ����
		String str7 = "abcdefg";
		char[] arr = str7.toCharArray();
		for (char c : arr) {
			System.out.println(c); // �迭�� �ٲ� ���� �ϳ��ϳ� �� ����
		}
		
		
	}

}
