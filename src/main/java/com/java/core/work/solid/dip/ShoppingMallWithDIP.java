/**
 * 
 */
package com.java.core.work.solid.dip;

/**
 * @author Balaji Soundarrajan
 *
 */
public class ShoppingMallWithDIP implements BankCard{
	
	private BankCard card;
	
	public ShoppingMallWithDIP() {
		super();
	}

	public ShoppingMallWithDIP(BankCard card) {
		super();
		this.card = card;
	}

	@Override
	public void doTransaction(long amount) {
		card.doTransaction(amount);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//DebitCard dCard = new DebitCard();
		CreditCard cCard = new CreditCard();
		ShoppingMallWithDIP mallWithDIP = new ShoppingMallWithDIP(cCard);
		
		mallWithDIP.doTransaction(100);

	}
}
