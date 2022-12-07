/**
 * 
 */
package com.java.core.work.functionalinterface.example;

import java.util.List;

/**
 * @author balajisoundarrajan
 *
 */
public interface FunctionInterface {
	
	public List<String> startsWith(List<String> list);
	
	public default void defaultMethod() {
		System.out.println("Default Method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}
