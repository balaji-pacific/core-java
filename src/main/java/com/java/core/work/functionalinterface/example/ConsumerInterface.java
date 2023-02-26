/**
 * 
 */
package com.java.core.work.functionalinterface.example;

import java.util.List;

/**
 * @author Balaji Soundarrajan
 *
 */
public interface ConsumerInterface {
	
	public void iterate(List<String> list);
	
	public default void defaultMethod() {
		System.out.println("Default Method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}
}
