/**
 * 
 */
package com.java.core.work.interface_eg;

/**
 * @author balajisoundarrajan
 *
 */
public class Rectangle implements Shape {

	int length;
	int width;
	String name;
	
	Rectangle(String name, int length, int width){
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing " + name);
		
	}

	@Override
	public double area() {
		return length * width;
	}

	
}
