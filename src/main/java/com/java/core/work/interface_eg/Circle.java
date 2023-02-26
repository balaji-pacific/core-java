/**
 * 
 */
package com.java.core.work.interface_eg;

/**
 * @author Balaji Soundarrajan
 *
 */
public class Circle implements Shape {
	
	int radius;
	double pi = 3.14;
	String name;
	
	Circle(String name, int radius){
		this.radius = radius;
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + name);
	}

	@Override
	public double area() {
		return pi * radius * radius;
	}

}
