package com.kh.practice.thread;

public class Decrement implements Runnable {
	
	private int num1;
	private int num2;
	
	public Decrement() {}

	public Decrement(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		int cnt = num2;
		
		while (cnt > num1) {
			System.out.println("°¨¼Ò°ª : " + cnt--);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
