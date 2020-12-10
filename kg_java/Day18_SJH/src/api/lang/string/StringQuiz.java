package api.lang.string;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요. : ");

		String ssn = sc.next(); // 940928-2849730
		
		final int currentYear = 2020;
		
		int year = Integer.parseInt(ssn.substring(0, 2)); 
		int month = Integer.parseInt(ssn.substring(2,4)); 
		int day = Integer.parseInt(ssn.substring(4, 6));
		int wm = ssn.charAt(7); // 2 or 4 = w, 1 or 3 = m
		String gender;
		
		if (wm == '2' || wm == '4') { // 주민 뒷자리 첫번째 자리가 2or4면 여자, 아니면 남자
			gender = "여자";
		} else {
			gender = "남자";
		}
		
		int birthyear;
		if(wm == '1' || wm == '2') { // 주민 뒷자리 첫번쨰 자리가 1이나 2면 1900년대생, 아니면 2000년대생
			birthyear = 1900 + year;
		} else {
			birthyear = 2000 + year;
		} 
		int age = currentYear - birthyear;
		System.out.printf("%d년 %d월 %d일 %d세 %s\n", birthyear, month, day, age + 1, gender);
			
		// Integer.parseInt(String만 가능!);
		// charAt()은 단일문자인 char타입이 들어가기 때문에 integer.parsInt()로 감쌀 수 없다.
			
		
		
		

		
		
		
			
			
			
			
			
			
			// 정수로 이루어진 문자열을 실제 정수값으로 변환하는 메서드
			// int 변수 = Integer.parseInt(문자열 or 문자열이 들어있는 변수)
			// 반드시 순수한 정수로만 이루어진 문자열이어야 변환이 가능합니다.
			
	}

}
