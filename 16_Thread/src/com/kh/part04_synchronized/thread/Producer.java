package com.kh.part04_synchronized.thread;

import com.kh.part04_synchronized.model.vo.Buffer;

//���� ������ �� �ִ� ���� �ϴ� ������(������)
public class Producer extends Thread{
	private Buffer criticalData;
	
	public Producer(Buffer buffer){
		this.criticalData = buffer;
	}
	
	@Override
	public void run(){
		//�����ڿ��� ����ϴ� ���� : critical section(�Ӱ�/��������)
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
