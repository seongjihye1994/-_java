package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Thread1;
import com.kh.chap01_thread.thread.Thread2;

public class ThreadRun {
	public static void main(String[] args) {
		// 1. Thread 를 상속 받은 클래스의 객체를 생성 후 실행
		Thread1 th1 = new Thread1();
		th1.start(); // 시작 메소드
		// 왜 start?
		//  -> 모든 스레드는 독립적인 작업을 수행하기 위해 자신만의 호출 stack을 필요로 함
		// 새로운 스레드를 생성하고 실행 시킬 때마다 새로운 호출 스택이 생성 되고
		// 스레드가 종료 되면 작업에 사용한 호출 스텍은 소멸
		// -> start()는 새로운 스레드가 작업을 실행하는데 필요한 호출 스텍을 생성한 뒤
		// run()을 호출해서 생성 된 호출 스텍에 run()이 첫번째로 올라가게 함
		
		// 2. Runnable 을 구혀한 클래스의 객체 생성 후 실행
//		Thread2 th2 = new Thread2();
//		Thread th = new Thread(th2);
		// 여기서는 start()메소드를 사용할 수 없음(Thread가 아니기 때문)
		// -> Thread 객체를 생성할 때 생성자의 파라미터로 Runnable 구현 클래스를 전달하여 실행
		
		Thread th2 = new Thread(new Thread2());
		th2.start();
		
		
		// 3. 스레드 재호출
		// th1.start();
		// 한 번 종료 된 스레드는 다시 호출 불가능
		
		
	}
	
	// Runable 인터페이스와 Thread 클래스의 차이점
	// -> Runable 인터페이스는 스레드화 될 수 있는 메소드를 정의하는 run() 메소드를 가지고 있음
	// -> Thread 클래스는 Runnable 인터페이스를 상속하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고 있음
	// -> Thread 클래스는 Thread의 상태를 제어할 수 있는 메소드를 가지고 있음 

}
