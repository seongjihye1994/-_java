package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	// 배열 중복 제거
	public void method1() {
		// 사용자에게 5개의 값을 입력 받아 배열에 저장
		// 단, 중복 값은 허용하지 않음
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(i + "번째 정수 값 : ");
			input[i] = sc.nextInt(); // 입력 받은 직후, 이전에 입력 받은 값 중 중복 값이 있는지 확인
			for (int j = 0; j < i; j++) { // 중복 확인(입력받은 수 i까지 확인)
				if (input[i] == input[j]) { // 중복이 존재한다면
					System.out.println("중복 값이 존재합니다.");
					i--; // 왜? break로 외부 for문의 i++로 가기 때문에 그 인덱스의 값을 다시 받기 위해서 --를 먼저 해줘야 값이 변하지 않습니다!
					break;
				}
			}
			System.out.print(input[i] + " ");
		}
		
		
	}

	
	public void method2() {
		int[] arr = new int[5];
		// 1~10사이의 난수를 중복 없이 채우기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(j + "번째와 " + i + "번째 : " + arr[i] + " 중복");
					i--; // 아래 break만나면 외부 for문의 조건식으로 가서 i++이 된다.
					break; //그래서 중복된 자리는 다시 채워야 하기 때문에 i에 -- 해준다.
				}
			}
		} System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
