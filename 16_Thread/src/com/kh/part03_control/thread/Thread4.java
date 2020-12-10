package com.kh.part03_control.thread;

public class Thread4 implements Runnable {

	@Override
	public void run() {
		// while���� sleep(), IsInterrupt�� ����ؼ� 10�� ī��Ʈ �����
		int cnt = 0;
		
		while(cnt < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println(++cnt + "��");
			} catch (InterruptedException e) {
				// �����尡 sleep() �۾��� ó���ϴ� �� interrupt()�� ȣ���ϰ� �Ǹ�
				// �ش� �������� interrupted ���� �ٲ�� ���� �ƴ϶�
				// InterruptedException�� �߻��ϰ� ��
				// Exception �߻� �� catch �ؼ� ���� �����带 �ٽ� Interrupt() ȣ��
				Thread.currentThread().interrupt();
				// e.printStackTrace();
			}
		}
		
	}
	
	

}
