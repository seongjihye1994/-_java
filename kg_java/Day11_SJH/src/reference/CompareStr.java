package reference;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1 == str2); // true
		String str3 = new String("hello");
		System.out.println(str1 == str3); // false
		
		// scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// User 객체 생성 및 생성자 값 초기화
		User kim = new User("abc1234");
		
		System.out.print("비밀번호를 입력하세요 : ");
		String passwd = sc.next();
		
		System.out.println("내가 방금 입력한 비번 : " + passwd);
		System.out.println("가입 당시에 생성한 비번 : " + kim.pw); // User 객체의 참조변수 kim으로 User 클래스에 접근
		
		System.out.println("=============================");
		
		System.out.println("== 연산자의 결과 : " + (passwd == kim.pw)); // false
		System.out.println("equals의 결과  : " + (passwd.equals(kim.pw))); // true
		
		// == 은 변수 안에 있는 값의 주소값을 비교하기 때문에 같은 문자열이라도 결과가 같을수도 있고, 다를 수도 있다.
		// 문자열 동등비교시 ==을 쓰지 않는것을 권장
		// String은 문자열 자체가 들어가는 것이 아닌, 문자열의 주소값이 저장된다.
	}

}
