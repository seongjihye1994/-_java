package com.kh.chap01_thread.thread;

// 스레드 생성 방법 1. Thread 클래스 상속 받는 방법
public class Thread1 extends Thread {

	// 상속 처리 후 run() 메소드 오버라이딩
	@Override
	public void run() {
		// -> 작업하고자 하는 코드 작성
		for (int i = 0; i < 11; i++) {
			// getName() : 해당 스레드가 가진 이름을 가져옴
			System.out.println(getName() + "[" + i + "]");
		}
	}
	
	
	
	
	
	
}
