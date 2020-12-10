package com.kh.variable;

public class E_Overflow {
	
	public void overflow() {
		
		// byte 자료형 값 저장 범위 : -128 ~ 237 까지만 가능
		
		// byte = bNum = 128; // 저장 값 초과!
		// Type mismatch
		// : 정수의 기본 형은 int, 리터럴이 정수로 들어갈 때 기본형인 int로 들어감
		// byte가 가질 수 있는 값의 범위 내라면 알아서 줄여서 값을 저장하지만,
		// 범위가 넘어간다면 자료 손실이 일어날 수 있기 때문에 에러가 뜨는 것
		
		// 초기화 시에는 위와 같이 에러를 발생시켜 주지만
		// 연산 과정에서 범위를 벗어나면 에러가 아닌 오버플로우 처리가 됨
		
		byte bNum = 127; // byte 최대값
		System.out.println("bNum: " + bNum);
		
		bNum = (byte)(bNum + 1); // 127 + 1값을 byte로 업 캐스팅
		System.out.println("오버플로우 된 bNum: " + bNum);
		
		
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
		int multi = num1 * num2; // int 가 가질 수 있는 값을 벗어남
		System.out.println("계산 결과: " + multi);
		
		// 70000.. 이라는 값이 나와야 하지만 int가 가지는 값의 범위를 벗어나
		// 오버플로우 현상이 일어났고 이에 따라 음수 결과를 출력
		
		// 값의 범위를 미리 알고 이를 예상하여 더 큰 자료형으로 변경해주면 해결 가능
		// long multi2 = num1 * num2; // int와  int의 곱하기 연산의 결과는 
		// int이므로 이미 오버플로우로 음수가 된 뒤 long변수에 담김 (선 연산 후 대입)
		// System.out.println("계산 결과: " + multi2);
		
		long multi2 = (long)num1 * num2;
		System.out.println("계산 결과: " + multi2);
		// 형변환을 통해 long과 int의 연산으로 만들어 곱하기 연산이 일어날 때
		// long 결과를 만들어 변수에 담음 (선 업캐스팅 후 연산 대입)
		
		// *** 값이 먼저 연산 된 후에 변수에 대입되므로, 먼저 캐스팅을 해 줘야
		// 오버플로우 현상이 일어나지 않습니다~!
	}

}
