/**
 * 
 */
package com.java.core.work.functionalinterface.lambda;

/**
 * @author balajisoundarrajan
 *
 */

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	public void execute();
	
	public static void methodStatic() {
		System.out.println("Static Method");
	}
	
	default void methodDefault() {
		System.out.println("Method Default");
	}

}
