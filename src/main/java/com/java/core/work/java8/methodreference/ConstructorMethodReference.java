/**
 * 
 */
package com.java.core.work.java8.methodreference;

/**
 * @author balajisoundarrajan
 *
 */

interface ConstructorInterface{
	public void print(String str);
}


public class ConstructorMethodReference {

	public ConstructorMethodReference(String str) {
		System.out.println(str);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConstructorInterface constructorInterface = ConstructorMethodReference::new;
		constructorInterface.print("Constructor Method Reference");

	}

}
