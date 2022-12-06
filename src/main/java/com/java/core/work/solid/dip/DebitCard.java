package com.java.core.work.solid.dip;

public class DebitCard implements BankCard{
	
	public void doTransaction(long amount) {
		System.out.println("Payment posted through Debit Card for the amount " + amount);
	}

}
