package com.kh.part03_control.run;

import java.util.Scanner;

import com.kh.part03_control.thread.Thread3;
import com.kh.part03_control.thread.Thread4;

public class ControlRun {
	public static void main(String[] args) {
		// 1. �ϳ��� ������� ������� �Է��� �޴� �۾��� ȭ�鿡 ī��Ʈ�� ����ϴ� �۾��� ���� ��
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);
		
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + "��");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		
		
		
		// 2. �� ���� ������� ������� �Է��� �޴� �۾��� ȭ�鿡 ī��Ʈ�� ����ϴ� �۾��� ���� ��
		/*Thread th = new Thread(new Thread3());
		th.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);*/
		
		
		
		
		// 3. interrupt() Ȱ���Ͽ� ������� �Է��� ���� ��� ī��Ʈ�� ���� ��Ű��
		Thread th = new Thread(new Thread4());
		th.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);
		
		th.interrupt(); // ���� ���� �����忡 ���ͷ�Ʈ�� ȣ���Ͽ� interrupted�� ���� true�� ����
		
	}

}
