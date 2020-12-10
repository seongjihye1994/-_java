package com.kh.part04_synchronized.run;

import com.kh.part04_synchronized.model.vo.Buffer;
import com.kh.part04_synchronized.thread.Consumer;
import com.kh.part04_synchronized.thread.Producer;

public class TestProducerConsumer {
	
/* 쓰레드 상태
1. BLOCKED : 동기화에 의해서 일시 정지된 상태
2. TERMINATED : 쓰레드의 작업이 종료된 상태
3. WAITING : 쓰레드가 종료되지는 않았지만 일시 정지 상태
*/
	public static void main(String[] args) {
		// 생산자-소비자 스레드 테스트 : 스레드 조정
		Buffer buffer = new Buffer();
		Thread t1 = new Producer(buffer);
		Thread t2 = new Consumer(buffer);
		
		t1.setName("Producer");
		t2.setName("Consumer");
		
		t1.start();
		t2.start();

	}

}
