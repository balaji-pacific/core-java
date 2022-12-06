/**
 * 
 */
package com.java.core.work.interface_eg;

/**
 * @author balajisoundarrajan
 *
 */
public class InterfaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape circle = new Circle("Circle", 4);
		circle.draw();
		System.out.println("Area of Circle " + circle.area());

		System.out.println("");
		
		Shape rect = new Rectangle("Rectangle", 3, 2);
		rect.draw();
		System.out.println("Area of Rectangle : " + rect.area());
	}

}
