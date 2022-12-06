package com.java.core.work.threading;

public class ThreadDemo implements Runnable {
	
	public static void main(String arg[]) {
		ThreadClass threadClass = new ThreadClass();
		threadClass.start();
		
		for(int i=0;i<5; i++) {
			System.out.println("Main Thread : " + i);
		}
	}

	@Override
	public void run() {
		
		
		
	}

}
