package com.kh.practice.run;

import java.util.Scanner;

import com.kh.practice.thread.Decrement;
import com.kh.practice.thread.Increment;

public class TestThread {
	
	// ����� Ŭ���� : com.kh.practice.run.TestThread
	// Thread Ŭ���� : com.kh.practice.thread.Increment
	//				 com.kh.practice.thread.Decrement
	
	// <���� ����>
	// 1. �� Ŭ���� ��� Runnable �������̽� ��� ����
	// 2. Increment Ŭ������ ������, ������ �ϳ� �ʱⰪ(50)���� ���޹���
	// 		>> 1 ���� 50�� �� ������ ������ 2�� ������Ű�� ���� �ݺ�
	// 		>> ���� �ϳ� ��� �� 0.05�� ���� �ְ� ��
	// 3. Decrement Ŭ���� ���� ��, ������ �� ���� �ʱⰪ(12, 45)���� ���޹���
	// 		>> 45 ���� 12�� �� ������ 1�� ���ҽ�Ű�� ���� �ٺ�
	//		>> ���� �ϳ� ��� �� 0.1�� ���� �ְ� ��
	// 4. ����� Ŭ�������� �� Ŭ������ ��Ƽ��������
	
	
	public static void main(String[] args) {
		Thread th = new Thread(new Increment(50));
		Thread th2 = new Thread(new Decrement(12, 45));
		
		th.start();
		th2.start();
	}

}
