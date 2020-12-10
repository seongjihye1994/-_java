package com.kh.chap01_string.controller;

public class B_StringMethodTest {
	
	public void method1() {
		String str1 = "hello world";
		
		//    메소드명(매개변수) : 반환형
		// 1. charAt(int index) : char
		char ch = str1.charAt(4); // 4번 인덱스 호출
		System.out.println(ch); // o
		
		// 2. concat(String str) : String
		//    합친 문자열을 new String으로 생성
		String str2 = str1.concat("!!!"); // str1뒤에 !!!을 합침
		System.out.println(str2); // hello world!!!
		
		// 3. toString() : String
		System.out.println(str1.toString()); // hello world
		
		// 4. equals(Object obj) : boolean
		System.out.println(str1.equals(str2)); // false
//		System.out.println(str2.equals(str3)); // true
		
		// 5. hashCode() : int
		System.out.println(str1.hashCode()); // 주소값
		System.out.println(str2.hashCode()); // 주소값
		
		// 6. length() : int
		System.out.println(str1.length()); // 인덱스길이 출력 11
		
		// 7. subString(int beginIndex) : String
		//    subString(int beginIndex, int endIndex) : String
		System.out.println(str1.substring(6)); // world
		// 인덱스 값 넣으면 해당 인덱스부터 끝까지 다 추출
		System.out.println(str1.substring(0, 6)); // hello (공백 포함) 
		// 두개 전달 : 해당 인덱스부터 끝 인덱스까지 -1 까지 추출
		
		// 8. replace(char old, char new) : String
		String str4 = str1.replace('l', 'c');
		// str1에 있는 모든 l문자를 c로 치환
		System.out.println(str4); // hecco worcd
		
		// 9. toUpperCase() / toLowerCase() : String
		// : 대문자로				: 소문자로
		String str5 = str1.toUpperCase();
		System.out.println(str5); // HELLO WORLD
		System.out.println(str5.toLowerCase()); // hello world

		// 10. trim() : String
		// : 앞 뒤 공백 제거
		String str6 = "   JAVA   ";
		System.out.println(str6.trim()); // JAVA
		
		// 11. toCharArray() : char[]
		// 문자열을 문자배열로 바꾸어 리턴
		String str7 = "abcdefg";
		char[] arr = str7.toCharArray();
		for (char c : arr) {
			System.out.println(c); // 배열로 바뀐 문자 하나하나 씩 추출
		}
		
		
	}

}
