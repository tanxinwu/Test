package com.base;

public class TestV {
	volatile static int sum=0;
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {			
			new Thread(new Runnable() {				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int j = 0; j < 1000; j++) {
						sum++;
					}
				}
			}).start();
		}
		while (Thread.activeCount()>1) {
			Thread.yield();
		}
		System.out.println(sum);
	}
}
