package com.java.core.work.threading;

public class ThreadClass extends Thread{
	
	public void run() {
		for(int i=0;i<5; i++) {
			Thread.yield();
			System.out.println("Child Thread : " + i);
		}
	}

}