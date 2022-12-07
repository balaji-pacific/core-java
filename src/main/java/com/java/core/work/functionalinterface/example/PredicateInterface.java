/**
 * 
 */
package com.java.core.work.functionalinterface.example;

import java.util.List;

/**
 * @author balajisoundarrajan
 *
 */
public interface PredicateInterface {
	
	public boolean isTrue(List<String> list);
	
	public default void defaultMethod() {
		System.out.println("Default Method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}
