package com.kh.practice.thread;

public class Increment implements Runnable {
	
	private int num;
	
	public Increment() {}
	
	public Increment(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		int cnt = 0;
		while (cnt < num) {
			cnt += 2;
			System.out.println("증가값 : " + cnt);
			try {
				Thread.sleep(50); // 0.05초
			} catch (InterruptedException e) {
			}
			
		}
		
	}

}
