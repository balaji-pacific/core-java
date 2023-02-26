/**
 * 
 */
package com.java.core.work.solid.dip;

/**
 * @author Balaji Soundarrajan
 *
 */
public class CreditCard implements BankCard{
	
	public void doTransaction(long amount) {
		System.out.println("Payment posted through Credit Card for the amount " + amount);
	}

}
