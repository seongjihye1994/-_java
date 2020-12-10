package com.kh.part04_synchronized.run;

import com.kh.part04_synchronized.model.vo.Buffer;
import com.kh.part04_synchronized.thread.Consumer;
import com.kh.part04_synchronized.thread.Producer;

public class TestProducerConsumer {
	
/* ������ ����
1. BLOCKED : ����ȭ�� ���ؼ� �Ͻ� ������ ����
2. TERMINATED : �������� �۾��� ����� ����
3. WAITING : �����尡 ��������� �ʾ����� �Ͻ� ���� ����
*/
	public static void main(String[] args) {
		// ������-�Һ��� ������ �׽�Ʈ : ������ ����
		Buffer buffer = new Buffer();
		Thread t1 = new Producer(buffer);
		Thread t2 = new Consumer(buffer);
		
		t1.setName("Producer");
		t2.setName("Consumer");
		
		t1.start();
		t2.start();

	}

}
