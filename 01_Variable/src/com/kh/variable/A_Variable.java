package com.kh.variable;

// 다른 패키지 안에 같은 클래스명을 만들 수 있음
// -> 클래스명은 패키지명부터 시작하는 것이 풀네임이므로
public class A_Variable {
	public void printValue() {
		System.out.println("변수 사용 전");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		
		
		int point = 100;
		int bonus = 10;
		int personCount = 10;
		
		System.out.println("변수 사용 후");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
	
		// 변수란?
		// - 어떠한 값을 메모리에 입력하기 위한 공간
		
		// 2. 변수를 사용하는 이유?
		// (1) 값에 의미를 부여하기 위해 사용
		// (2) 한 번 값을 저장해두고 계속 사용할 목적으로 사용
		// (3) 유지보수를 쉽게할 수 있음
		
	}
	
	public void declareVariable() {
		// 3. 변수 선언
		// - 메모리에 공간을 할당함
		// 형태 : 자료형 변수명;
		// 변수명은 항상 소문자로 시작하고 여러 단어로 되어 있는 경우
		// 첫 문자는 대문자로 표기 => 카멜 표기법
		
		// 논리형 (boolean)
		boolean isTrue; // 1byte
		
		// 숫자형 (정수 & 실수)
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte --> 디폴트형
		long lNum; // 8byte
		
		float fNum; // 4byte
		double dNum; // 8byte --> 디폴트형
		
		// 문자(단일 & 문자열)
		char ch; // 2byte
		
		String str; // ** 기본 자료형이 아닌 참조 자료형! 일종의 객체
		
		// 변수 초기화
		isTrue = true;
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // long자료형은 l을 함께 표시해주는게 관례인데,
					// 표시를 하지 않아도 에러는 발생하지 않는다.
					// 그 이유는 자동 형변환이 일어나기 때문
		
		fNum = 4.8f; // f 또는 F를 붙여 float 자료형 값이라는 것을 표현해주어야 함
					// 데이터 손실이 일어날 가능성이 있기 때문에 (강제 형변환)
		dNum = 8.0/*d*/; // 기본형이기 때문에 d를 붙이거나 붙이지 않거나 상관없음
		
		// ch = 'ABC'; // char는 단일문자만 저장 가능하다.
		ch = 'A';
		
		str = "Hello, world!";
		
		// 초기화된 변수 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
	
	}
	
	public void initVariable() {
		// 변수 선언과 동시에 초기화(값 대입)
		// 형태 : 자료형 변수명 = 값;
		
		// 같은 메소드 안에서 변수명은 중복 불가
		// 메소드 안에 선언 된 변수는 '지역변수' 이므로 해당 메소드에서만
		// 사용 가능 -> 다른 메소드에서는 사용 불가
		// 위의 메소드와 아래 메소드는 다른 영역이므로 같은 이름의 '지역변수'를 사용할 수 있음
		
				
		// 논리형
		boolean isTrue = true;
		
		// 숫자 (정수 & 실수)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8l;
		
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 문자(단일 & 문자열)
		char ch = '가';
		String str = "안녕하세요!";
		
		// 들여쓰기 단축키 : 범위 선택 후 Ctrl + Shift + f
		
		// -----------------------------------------
		
		// 4. 변수 명명 규칙
		int number;
		//int number; // 변수명 중복 불가
		int Number;
		
		//int int; // 예약어 사용 불가
		// int true;
		
		int age1;
		//int 1age; // 숫자로 시작 불가
		
		int number_1;
		int number$2;
		//int number#3; // _, $이외의 특수문자는 사용 불가
		
		// 여러 단어로 된 변수명일 경우 붙여쓰고 두번째 단어부터
		// 첫 글자를 대문자로 작성 -> 카멜 표기법
		
		String username;
		String userName;
		
		// 자바는 한글도 변수명으로 사용 가능
		String 이름; // 한글을 사용하지 않은 환경에서 오류를 발생시킬 수 있어 권장 x
		
		
		
		
		
		
		
	}
}
