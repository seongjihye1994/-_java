package com.kh.chap01_string.controller;

public class D_BuildrBufferTest {
	
	// String 클래스 -> 불변
	// 계속 값을 변경하는 경우 가비지 컬렉터가 계속 참조 되지 않는 문자열을 지워야 하는 단점
	// -> 변경이 적고 읽어오기만 하는 경우 String클래스 용이
	
	// StringBuffer, StringBuilder -> 가변(변하는) 클래스
	// - 변경과 저장을 위한 메모리 공간(버퍼)를 내부에 지나는데 처음에는 16개의 문자를
	//   지정할 수 있는 버퍼가 생성 되고 문자가 저장 됨에 따라 자동으로 증가
	// - 초기 버퍼 크기를 지정할 수 있고 문자열의 길이보다 16개의 문자를 더 저장할 수 있음
	
	public void method1() {
		// StringBuffer, StringBuilder 두 개 모두 생성자/메소드 동일
		// 하지만 차이점은 동기화 처리가 되느냐 안되느냐의 차이
		
		// StringBuffer는 동기화 처리 O (Thread safe)
		// StringBuilder는 동기화 처리 X
		
		// Thread : 프로그램 실행 흐름을 하나가 아닌 두 세가지로 병렬할 수 있음
		
		// 즉, 멀티 스레드냐 단일 스레드냐의 차이
		// 멀티 스레드 환경 -> 동기화 처리가 되어야 안전함 -> StringBuffer 사용 권장
		// 단일 스레드 환경 -> 동기화 처리를 하면 속도 저하 발생 -> StringBuilder 사용 권장
		
		// 우리는 StringBuilder로만 작업 StringBuffer로 객체만 변경하면 동일하게 메소드 사용 가능
		
		// 1) 기본 생성자로 생성하게 되면 기본으로 16 크기만큼 생성
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 수용량 : " + sb1.capacity()); // 16 (최대 수용할 수 있는 용량 : 디폴트 16개)
		System.out.println("sb1 길이 : " + sb1.length()); // 0개 (현재 들어있는 인덱스 개수)
		System.out.println("==========================");
		
		// 2) 매개변수 생성자로 인수를 전달하면 해당 크기만큼의 수용량이 지정 됨
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 수용량 : " + sb2.capacity()); // 용량을 30으로 해줘
		System.out.println("sb2 길이 : " + sb2.length()); 
		System.out.println("==========================");
		
		// 3) 매개변수 생성자로 인수를 문자로도 전달 가능 (해당 문자열의 인덱스 길이 + 16만큼의 수용량 할당)
		StringBuilder sb3 = new StringBuilder("반가워!!");
		System.out.println("sb3 수용량 : " + sb3.capacity()); // 5 + 16 = 21
		System.out.println("sb3 길이 : " + sb3.length()); // 5
		System.out.println("==========================");
				
	}
	
	public void method2() {
		// 불변 vs 가변 테스트
		
		// String
		String str = "반가워!";
		System.out.println(System.identityHashCode(str)); // 실제 주소값 반환
		
		str += "난 String이얌";
		System.out.println(System.identityHashCode(str)); // 실제 주소값 반환
		// 불변 -> 새로 생성 되면서 참조하고 있는 주소 값이 바뀌는 형태
		// 한번 지정되면 그 자리에 값이 바뀌지 않고(불변) 새로 생성함
		
		System.out.println("===================");
		
		// StringBuilder
		StringBuilder sb = new StringBuilder("반가워!");
		
		System.out.println("sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================");
//		sb : 반가워!
//		주소값 : 2018699554
//		수용량 : 20
//		길이 : 4
		
		// StringBuilder에서 값을 변경하고자 할 때는 메소드를 통해서 작업
		// 1. append(String str) : StringBuilder -> 문자열 추가
		sb.append("안녕!");
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================");
//		변경 후 sb : 반가워!안녕!
//		주소값 : 2018699554   --->> 객체의 주소값이 바뀌지 않음!(값이 가변)
//		수용량 : 20
//		길이 : 7
		
		// 즉, 값이 변경되면 그 자리에 바로 값이 바뀜(가변), 새 객체 생성 x
		
		sb.append("다들 조금만 힘내세요!!!");
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================");
//		변경 후 sb : 반가워!안녕!다들 조금만 힘내세요!!!
//		주소값 : 2018699554
//		수용량 : 42
//		길이 : 21
		
		// 2. delete(int start, int end) : StringBuilder -> 문자열 삭제
		sb.delete(2, 5);
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================");
		// 2, 3, 4 인덱스에 해당하는 문자 삭제 됨 (end -1까지 삭제)
//		변경 후 sb : 반가녕!다들 조금만 힘내세요!!!
//		주소값 : 2018699554
//		수용량 : 42
//		길이 : 18
		
		// 3. insert(int offset, String str) : StringBuilder
		sb.insert(1, "ㅎㅎㅎ"); // 1번 인덱스에 ㅎㅎㅎ 넣음
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================");
//		변경 후 sb : 반ㅎㅎㅎ가녕!다들 조금만 힘내세요!!!
//		주소값 : 2018699554
//		수용량 : 42
//		길이 : 21
		
		// 4. reverse() : StringBuilder -> 역으로 바꾸는
		sb.reverse();
		System.out.println("변경 후 sb : " + sb.toString());
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("길이 : " + sb.length());
		System.out.println("===================");
//		변경 후 sb : !!!요세내힘 만금조 들다!녕가ㅎㅎㅎ반
//		주소값 : 2018699554
//		수용량 : 42
//		길이 : 21
		
	}
	
	public void method3() {
		StringBuilder sb = new StringBuilder("JavaProgram");
		
		sb.append("API").delete(4, 11).reverse();
		// 메소드 여러번 이어서 호출 가눙
		System.out.println(sb);
		
		// 메소드 반환형이 모두 StringBuilder 이므로 메소드를 이어서 호출할 수 있음
		// -> 해당 메소드의 결과로 sb의 주소값이 반환되기 때문
		// => 메소드 체이닝(메소드 이어쓰기)
		// -> 수행 -> 반환 -> 수행 - 반환 .. 형태

	}

}
