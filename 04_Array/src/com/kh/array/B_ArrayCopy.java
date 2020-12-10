package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	// 1. 얕은 복사 : 배열의 주소만을 복사
	// 2. 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부 값들을 복사
	
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin; // 얕은복사
		
		// 원본 출력
		System.out.println("얕은 복사 : 주소값 동일, 인덱스 값도 수정 후 동일!");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		} System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		// 복사 된 copy 배열을 이용해서 2번 인덱스의 값을 99로 수정
		copy[2] = 99;
		
		System.out.println("==== 복사본 배열 값 변경 후 ====");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());

	}
	
	public void method2() {
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];
		
		System.out.println("깊은 복사 : 주소값 다름, 원본 값 변경되도 복사값 변경 x");
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		} System.out.println();
		
		// 원본 출력
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		} System.out.println();
		
		// 잘 복사 되었는지 복사본 출력
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
		copy[2] = 99; // 복사 배열 인덱스 값 변경
		
		System.out.println("==== 복사본 배열 값 변경 후 ====");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
		// 복사본 배열의 값만 변경 된 것을 확인할 수 있음
		// 즉, 얕은 복사는 배열의 주소만 복사하기 때문에, 배열 값이 변경되어도 같이 변경되지만
		// 깊은 복사는 배열의 인덱스 값을 모두 복사하기 때문에, 배열 값이 변경되어도 카피배열의 인덱스값은 변경되지 않는다.
		
		
	}
	
	public void method3() {
		// 2. System 클래스에서 arraycopy() 메소드를 이용한 복사
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; // 복사 배열 더 크게 생성
		
		// (원본 배열명, 복사시작할 인덱스, 복사본배열명, 복사본배열의 복사 시작될 위치, 원본 복사 길이)
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		// origin 배열을 copy 배열에 복사하는데, 이때,
		// origin 배열의 0번 인덱스부터 마지막에 넣은 길이만큼을
		// copy 배열의 2번 인덱스부터 채우겠다는 의미
		
		System.out.println("깊은 복사 메소드1 : System.arraycopy, 주소값 다름!");
		System.out.println("==== 복사본 배열 값 변경 후 ====");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		// copy의 읻넥스 값을 변경해도 origin 배열은 영향을 받지 않을 것
		// 다른 주소 값을 가지고 있기 때문에
		
		// System.arraycopy() 메소드를 이용하면 복사 위치, 복사할 갯수를 지정할 수 있음
		// for문을 사용하지 않고 for문과 같은 기능 구현 가능

	}
	
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드 사용
		// Arrays 클래스는 배열을 이용할 때 유용한 메소드들을 모아놓은 클래스
		
		// Arrays.copyOf() -> 내가 지정한 길이만큼 무조건 크기 할당
		// 지정한 길이가 원본 배열보다 긴 경우 기존 배열에 있는 내용 모두 복사 (남는 인덱스는 0)
		// 지정한 길이가 원본 배열보다 짧은 경우 기존 배열에서 지정한 길이만큼 복사
		// 시작 위치 컨트롤 불가!
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = Arrays.copyOf(원본 배열, 원본 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 5);
		
		System.out.println("깊은 복사 메소드2 : Arrays.copyOf, 주소값 다름!");
		System.out.println("==== 복사본 배열 값 변경 후 ====");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		// -> origin.length 보다 작은 값/크 값을 넣어서 테스트해보기
		// 작은 값을 넣으면 그 값까지만의 인덱스까지 출력되고, 큰 값을 넣으면 나머지 인덱스는 디폴트 값으로 채워짐
		
		
	}
	
	public void method5() {
		// 4. clone() 메소드 이용한 복사
		// 시작 인덱스 지정할 수 없으며, 원본 배열을 통채로 복사해 새로운 배열 할당
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		System.out.println("깊은 복사 메소드3 : 복사본배열명.clone, 주소값 다름!");
		System.out.println("==== 복사본 배열 값 변경 후 ====");
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("복사본 배열 출력");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
	}
	
	
}
