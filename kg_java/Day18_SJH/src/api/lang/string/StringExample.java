package api.lang.string;

import java.util.Arrays;

public class StringExample {
	
	public static void main(String[] args) {
		
		String s1 = "hello java";
		
		
		// charAt(index) : 문자열 특정 인덱스의 단일 문자를 리턴
		char c = s1.charAt(4);
		System.out.println("4번 인덱스의 문자 : " + c); // 4번 인덱스의 문자 : o
		
		// substring(index) : 문자열의 특정 범위의 문자를 추출
		String s2 = s1.substring(6); // 인덱스 6번부터 끝까지 추출
		System.out.println(s2); // java
		
		// 0~5번 미만까지 추출 (끝값이 미만으로 처리됨)
		System.out.println(s1.substring(0, 5)); // hello
		
		// length() : 문자열의 총 길이를 리턴
		System.out.println("s1의 총 문자 갯수 : " + s1.length()); // s1의 총 문자 갯수 : 10
		
		// indexOf(문자열) : 특정 단어의 인덱스를 리턴
		// 단어를 검색하면 해당 단어의 첫 글자 인덱스를 리턴
		// 찾는 단어가 없으면 -1을 리턴한다.
		int idx = s1.indexOf("o");
		System.out.println("o의 인덱스 : " + idx); // o의 인덱스 : 4
		
		idx = s1.indexOf("java");
		System.out.println("java의 첫 글자 인덱스 : " + idx); // java의 첫 글자 인덱스 : 6
		
		idx = s1.indexOf("메롱");
		System.out.println(idx); // -1
		
		// toLowerCase(), toUpperCase() : 문자열을 각각 소문자, 대문자로 일괄 변경
		String s4 = "Hello JAVA WOrlD";
		System.out.println(s4.toLowerCase()); // hello java world
		System.out.println(s4.toUpperCase()); // HELLO JAVA WORLD
		
		// trim() : 문자열의 앞 뒤 공백을 제거
		String name = "            홍길동";
		System.out.println(name.trim() + "님"); // 홍길동님
		
		// replace(ole, new) : 기존 문자열 내부의 old 문자값을 모두 찾아 new 문자열로 일괄 대체
		String java = "java study, java program, java coffee";
		System.out.println(java.replace("java", "자바")); // 자바 study, 자바 program, 자바 coffee
		System.out.println(java.replace(",", "")); // java study java program java coffee
		
		// split(구분문자열) : 문자열을 구분 문자열을 기준으로 분리하여 String[]로 리턴
		String pet = "멍멍이, 야옹이, 짹짹이";
		String[] pets = pet.split(", ");
		System.out.println(Arrays.toString(pets)); // [멍멍이, 야옹이, 짹짹이]
		System.out.println(pets[1]); // 야옹이
		
		
		
	}


}
