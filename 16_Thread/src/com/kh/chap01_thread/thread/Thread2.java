package com.kh.chap01_thread.thread;

// ������ ���� ��� 2. Runnable �������̽� ���� ���
public class Thread2  implements Runnable{

	@Override
	public void run() {
		// -> �۾��ϰ��� �ϴ� �ڵ� �ۼ�
		for (int i = 0; i < 11; i++) {
			// Thread Ŭ������ ��� ���� ���� �ƴϹǷ�, �ٷ� Thread�� getName()ȣ�� �Ұ�
			// Thread Ŭ������ static �޼ҵ��� currentThread�� ���� ���� ���� ������ ��ü ��ȯ
			// �޾Ƽ� getName() ȣ�� ����
			
			System.out.println(Thread.currentThread()); // ���� �������� ������ ��ȯ
			
		}
		
		
	}

}
