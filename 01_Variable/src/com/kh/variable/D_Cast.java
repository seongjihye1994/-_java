package com.kh.variable;

// 원칙적으로, 서로 다른 타입의 값들로는 연산이 불가능하다.

public class D_Cast {
	// 자동 형변환
	public void rule1() {
		// int(4byte) -> double(8byte)
		int i = 12;
		double d = 2.3;
		double result = i + d; // 작은 값이 큰 값으로 들어갈때는 자동 형변환
		// 12 + 2.3 > 12.0 + 2.3 
		System.out.println("result : " + result);
		// int형과 double형의 연산 결과가 double형으로 자동 형변환 됨
		
		
		// int(4byte) -> long(8byte)
		int i2 = 2147473647;
		long l = 1000000000L;
		long result2 = i2 + l;
		System.out.println("result2 : " + result2);
		// int형과 long형의 연산 결과가 long형으로 자동 형변횐 됨
		
		// float(4byte) -> double(8byte)
		float f = 1.0f;
		double d2 = f;
		System.out.println("f : " + f);
		System.out.println("d2 : " + d2);
		
		// long(8byte) -> float(4byte)
		// 크기는 long이 더 큰데 왜 float로 자동 형변환이 가능할까??
		// -> 실수인 float가 정수인 long보다 표현 가능한 수의 범위가 더 크기 때문에
		// *** 모든 정수는 실수로 자동 형변환 된다.
		
		long l2 = 10000000L;
		float f2 = l2;
		System.out.println("f2 : " + f2 + "모든 정수는 실수로 자동 형변환 된다!");
	
		// char(2byte) -> int(4byte)
		int num = 'A'; // int형 변수 num에 char형 리터럴 값 대입
		System.out.println("num : " + num); // 문자에 해당하는 유티코드 값이 저장됨
		
		// char 자료형에 정수 저장 가능
		char ch = 65;
		// char ch2 = -65; // 아스키코드는 -값은 없다.
		System.out.println("ch" + ch);
		
		// byte, short를 이용한 연산
		byte b2 = 1;
		byte b3 = 10;
		// byte result3 = b2 + b3; // -> 에러발생 : byte나 short는 연산 시 무조건 int형으로 처리
		// int result3 = b2 + b3;
		
		// 무조건 결과를 byte 타입으로 처리하고 싶다면? -> 강제 형변환 사용
		byte result3 = (byte)(b2 + b3);
		System.out.println("result3 : " + result3);
		
	}
	
	// 강제 형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
	//  -> 형변환 생력 불가
	public void rule2() {
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum;
		// 두 개의 연산 결과가 double 이기 때문에 int형 변수 iSum에는 대입 불가
		
		// 에러 해결 방법
		// 1. 수행 결과를 int로 강제 형변환
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		// 실수 -> 정수형 강제 형변환 시 소수점 아래 부분은 모두 버림 처리
		
		// 2. double형 값을 int형으로 강제 형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		// 3. 연산 결과를 double로 받음
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);

	}
	
	// 데이터 손실 테스트
	public void dataLoss() {
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		byte bNum = (byte) iNum; // 강제 형변환
		System.out.println("bNum : " + bNum);
		// -> 계산학 어려운 데이터 손실이 발생하기 때문에
		//    강제 형변환은 유의해서 사용해야 함
		
		
		
		
	}

}
