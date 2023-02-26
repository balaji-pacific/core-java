/**
 * 
 */
package com.java.core.work.solid.dip;

/**
 * @author Balaji Soundarrajan
 *
 */
public class ShoppingMall {
	
	private DebitCard debitCard;
	
	public ShoppingMall() {
		super();
	}

	public ShoppingMall(DebitCard debitCard) {
		super();
		this.debitCard = debitCard;
	}
	
	public void doPostTransaction(long amount) {
		debitCard.doTransaction(amount);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShoppingMall mall = new ShoppingMall();
		mall.doPostTransaction(100);
		

	}

}
