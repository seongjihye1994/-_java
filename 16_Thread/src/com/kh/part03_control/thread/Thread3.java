package com.kh.part03_control.thread;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i + "ÃÊ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
