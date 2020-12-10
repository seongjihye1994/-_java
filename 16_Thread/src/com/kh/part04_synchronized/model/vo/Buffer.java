package com.kh.part04_synchronized.model.vo;

//���� �ڿ��� �����ϴ� Ŭ����
public class Buffer {
	private int data;
	private boolean empty = true;
	
	public synchronized void getData(){
		// data �ʵ忡 ���� ���� ������ ��� ������
		
		while(empty){
			System.out.println(Thread.currentThread().getName() + " is waiting...");
			try {
				// �����Ͱ� ���� ���� ����ؼ� �� �����尡 ���� ������ ä�� ���� �ʵ���
				// wait()�� ȣ���Ͽ� �����尡 ���� �ݳ��ϰ� ��ٸ��� ��
				// notify()�� ȣ�� �� ������ ��ٸ�
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//���� ������ �����ϰ�, �ٽ� empty �� true�� �ٲ�
		empty = true;
		
		System.out.println(Thread.currentThread().getName() + " : " + data + " �� ��ǰ�� �Һ��Ͽ����ϴ�.");
		notify(); // ��� ������ �����带 ���� ���·� �ٲ�
		
	}
	
	public synchronized void setData(int data){
		//���� ���� ������ �����·�, ���� ������ �� ���ó��
		while(!empty){
			System.out.println(Thread.currentThread().getName() + " is waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		empty = false;
		System.out.println(Thread.currentThread().getName() + " : " + data + "�� ��ǰ�� �����Ͽ����ϴ�.");
		notify();
		
	}

}
