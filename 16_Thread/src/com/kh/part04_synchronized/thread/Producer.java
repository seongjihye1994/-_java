package com.kh.part04_synchronized.thread;

import com.kh.part04_synchronized.model.vo.Buffer;

//공유 데이터 값 넣는 일을 하는 공급자(생산자)
public class Producer extends Thread{
	private Buffer criticalData;
	
	public Producer(Buffer buffer){
		this.criticalData = buffer;
	}
	
	@Override
	public void run(){
		//공유자원을 사용하는 영역 : critical section(임계/공유영역)
		for (int k = 1; k <= 10; k++) {
			criticalData.setData(k);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
