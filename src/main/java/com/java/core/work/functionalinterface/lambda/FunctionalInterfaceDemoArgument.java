/**
 * 
 */
package com.java.core.work.functionalinterface.lambda;

/**
 * @author Balaji Soundarrajan
 *
 */
@FunctionalInterface
public interface FunctionalInterfaceDemoArgument {

	public void multiply(int a, int b);
	
	public static void executeStatic() {
		System.out.println("Hi Static method");
	}
	
	public default void executeDefault() {
		System.out.println("Hi Default Method");
	}
}
