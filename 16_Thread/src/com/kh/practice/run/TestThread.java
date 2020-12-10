package com.kh.practice.run;

import java.util.Scanner;

import com.kh.practice.thread.Decrement;
import com.kh.practice.thread.Increment;

public class TestThread {
	
	// 실행용 클래스 : com.kh.practice.run.TestThread
	// Thread 클래스 : com.kh.practice.thread.Increment
	//				 com.kh.practice.thread.Decrement
	
	// <구현 내용>
	// 1. 두 클래스 모두 Runnable 인터페이스 상속 받음
	// 2. Increment 클래스는 생성시, 정수를 하나 초기값(50)으로 전달받음
	// 		>> 1 부터 50이 될 때까지 정수를 2씩 증가시키는 내용 반복
	// 		>> 숫자 하나 출력 후 0.05초 멈춰 있게 함
	// 3. Decrement 클래스 생성 시, 정수를 두 개를 초기값(12, 45)으로 전달받음
	// 		>> 45 부터 12가 될 때까지 1씩 감소시키는 내용 바복
	//		>> 숫자 하나 출력 후 0.1초 멈춰 있게 함
	// 4. 실행용 클래스에서 두 클래스를 멀티스레딩함
	
	
	public static void main(String[] args) {
		Thread th = new Thread(new Increment(50));
		Thread th2 = new Thread(new Decrement(12, 45));
		
		th.start();
		th2.start();
	}

}
