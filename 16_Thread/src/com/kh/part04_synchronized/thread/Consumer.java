package com.kh.part04_synchronized.thread;

import com.kh.part04_synchronized.model.vo.Buffer;

//�����ڿ��� ������ ����ϴ� �Һ��� Ŭ����
public class Consumer extends Thread{
	private Buffer criticalData;
	
	public Consumer(Buffer buffer){
		this.criticalData = buffer;
	}
	
	@Override
	public void run(){
		for(int k = 1; k <= 10; k++){
			criticalData.getData();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
