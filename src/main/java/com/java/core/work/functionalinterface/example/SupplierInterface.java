/**
 * 
 */
package com.java.core.work.functionalinterface.example;

/**
 * @author balajisoundarrajan
 *
 */
public interface SupplierInterface {
	
	public Object getRandomValue();

	public default void defaultMethod() {
		System.out.println("Default Method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}
	
}
