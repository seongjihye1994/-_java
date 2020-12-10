package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	// java.util.Scanner라는 클래스를 이용하여(임포트)
	// 키보드로 입력 받는 기능 익히기

	public void inputScanner1() {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자의 정보를 입력 받고 그 입력 받은 정보를 출력하는 프로그램
		System.out.print("당신의 이름은 무엇입니까? : ");
		String userName = sc.next(); // next()는 공백 전까지의 문자만 받아옴
		System.out.print("당신의 나이는 몇살입니까? : ");
		int userAge = sc.nextInt();
		System.out.print("당신의 키는 몇입니까?(소수점 첫쨰자리까지 입력) : ");
		double userHeight = sc.nextDouble();
		
		System.out.printf("당신의 이름은 %s이고, 나이는 %d살, 키는 %.1fcm 입니다.\n", userName, userAge, userHeight);
		
	}
	
	// Scanner 기능 사용시 자주 발생하는 오류 알아보기
	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// sc.nextLine()을 제외한 나머지 메소드는 본인이 읽어오는 타입에 맞는 값만 읽어옴
		// * int, double, next 는 공백을 읽지 않음
		// 해당 값만 읽어왔을 때 사용자가 입력한 엔터 값은 버퍼에 남아있게 됨
		// 다시말해 나이를 입력할 때 sc.nextInt()에서 int값만 age라는 변수에 저장되고
		// '엔터'는 버퍼에 남아있는 상태에서 이후의 주소값 입력을 위한 sc.nextLine() 메소드에서
		// 아까 버퍼에 남아있었떤 '엔터'를 자동으로 읽어와서 입력이 끝났다고 생각하고 넘어가는 것 --> address 변수에는 빈 값이 들어가게 됨
		
		// 결론 : nextLine() 이전에 nextLine() 외의 다른 메소드가 온다면 버퍼에 남아있는 내용을 비워주자.
		// nextLine()은 엔터도 먹는 친구~!
		// 버퍼에 있는 내용을 비워주기!
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.printf("%s님의 나이는 %d세 이며, 주소는 %s이고, "
				+ "키는 %.1fcm 입니다.\n"
				, name, age, address, height);
		
		
	}
	
	public void inputScanner3() {
		// 변수 선언
		String name;
		char gender;
		int age;
		double height;
		
		// 키보드로 입력 받기
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 받을 때 -> sc.nextLine(), sc.next()
		// 정수형 입력 받을 때 -> sc.nextInt()
		// 실수형 입력 받을 때 -> sc.nextDouble()
		// 그 밖에 byte, boolean등 기본 자료형을 입력 받을 때에도 마찬가지로
		// nextXXX() 형태로 메소드 사용
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("성별 (M/F) : ");
		// gender = sc.nextChar(); // 단일문자를 입력받으려고 했더느 nextChar()라는 메소드는 존재하지 않음
		gender = sc.nextLine().charAt(0); // 문자로 받은 후 자르기
		// sc.nextLine()의 결과인 String을 통해 0번째 문자를 추출 (CharAt(0))
		// String은 여러개의 단일문자(char)가 붙어있는 형태이므로,
		// charAt(index)를 이용하여 char형으로 바꾸어 줌
		// 위치 지정하는 방법은 문자열 제일 앞의 문자부터 0으로 시작해서 1씩 증가시키면 됨
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		System.out.printf("%s님의 개인정보 >> "
				+ "성별 : %c, 나이 : %d세, 키 : %.1fcm입니다.\n"
				, name, gender, age, height);
		
		
		
	}
	
	

}
