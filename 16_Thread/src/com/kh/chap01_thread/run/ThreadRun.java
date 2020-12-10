package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Thread1;
import com.kh.chap01_thread.thread.Thread2;

public class ThreadRun {
	public static void main(String[] args) {
		// 1. Thread �� ��� ���� Ŭ������ ��ü�� ���� �� ����
		Thread1 th1 = new Thread1();
		th1.start(); // ���� �޼ҵ�
		// �� start?
		//  -> ��� ������� �������� �۾��� �����ϱ� ���� �ڽŸ��� ȣ�� stack�� �ʿ�� ��
		// ���ο� �����带 �����ϰ� ���� ��ų ������ ���ο� ȣ�� ������ ���� �ǰ�
		// �����尡 ���� �Ǹ� �۾��� ����� ȣ�� ������ �Ҹ�
		// -> start()�� ���ο� �����尡 �۾��� �����ϴµ� �ʿ��� ȣ�� ������ ������ ��
		// run()�� ȣ���ؼ� ���� �� ȣ�� ���ؿ� run()�� ù��°�� �ö󰡰� ��
		
		// 2. Runnable �� ������ Ŭ������ ��ü ���� �� ����
//		Thread2 th2 = new Thread2();
//		Thread th = new Thread(th2);
		// ���⼭�� start()�޼ҵ带 ����� �� ����(Thread�� �ƴϱ� ����)
		// -> Thread ��ü�� ������ �� �������� �Ķ���ͷ� Runnable ���� Ŭ������ �����Ͽ� ����
		
		Thread th2 = new Thread(new Thread2());
		th2.start();
		
		
		// 3. ������ ��ȣ��
		// th1.start();
		// �� �� ���� �� ������� �ٽ� ȣ�� �Ұ���
		
		
	}
	
	// Runable �������̽��� Thread Ŭ������ ������
	// -> Runable �������̽��� ������ȭ �� �� �ִ� �޼ҵ带 �����ϴ� run() �޼ҵ带 ������ ����
	// -> Thread Ŭ������ Runnable �������̽��� ����ϰ� ������ �����带 Ȱ��ȭ �ϴ� start() �޼ҵ带 ������ ����
	// -> Thread Ŭ������ Thread�� ���¸� ������ �� �ִ� �޼ҵ带 ������ ���� 

}
