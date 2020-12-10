package com.kh.part02_scheduling.run;

import com.kh.part02_scheduling.model.vo.Car;
import com.kh.part02_scheduling.model.vo.Plane;
import com.kh.part02_scheduling.model.vo.Tank;

public class Run {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Car());
		Thread t2 = new Thread(new Plane());
		Thread t3 = new Thread(new Tank());
		
		// ������� �⺻������ 1 ~ 10�� �켱���� �� 5�� �켱������ ������ ����
		// -> �켱 ������ �����带 ������ ������κ��� ��� ���� (���� �������� �켱 ������ 5�̹Ƿ�)
		System.out.println("Car �켱 ���� : " + t1.getPriority());
		System.out.println("Plane �켱 ���� : " + t3.getPriority());
		System.out.println("Tank �켱 ���� : " + t3.getPriority());
		
		// ���� ������ �Ź� �ٸ� ������ ������ �����尡 ��� ���� ��� �켱 ������ ������ �ֱ� ����
		// � ü���� ���� ������ �����带 �ѹ��� ȣ���ؼ� ���
		
		// ���� ���� ������ ���� �ʿ䰡 ���� ���� �켱 ������ ���� �Ҵ��ؾ� ��
		// �켱 ������ ���� �������ϼ��� �� ���� ���� ���� �ð��� �־���
		t1.setPriority(1);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t3.setPriority(10);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Car �켱 ���� : " + t1.getPriority());
		System.out.println("Plane �켱 ���� : " + t3.getPriority());
		System.out.println("Tank �켱 ���� : " + t3.getPriority());
		
		// ���� ������ : �ٸ� �������� �۾��� ���� �������� ������ �ϴ� ������
		// ���� ������ �̿��� ��������� ��� ���� �Ǹ� ���� ������� ���������� ���� ��
		// ���� �����尡 �� �������� ���۷��� ������ setDaemon(true)�� ȣ���Ͽ� ����
		// start() ������ setDaemon(true)�� ȣ���ؾ� ��
		// -> �ٸ� �۾��� ���� �Ǹ� ������ �ʿ䰡 ���� ���� �۾��� ���� ������� ����
		// -> ex ������ �÷���, �ڵ� ����, ȭ�� �ڵ� ���� ��
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		// �켱 ������ �� ������� ���� -> cpu ��Ƽ �ھ� ȯ��
		
		// �ٸ� ��������� �� ���� ���� ���� �����尡 ����
		// ������ �����尡 ���� �� ������ ���� ���� �������� ���Ḧ ��� ��Ű����?
		/*try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		System.out.println("==================== main end =====================");
	}

}
