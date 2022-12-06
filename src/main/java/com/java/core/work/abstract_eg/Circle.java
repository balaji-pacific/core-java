/**
 * 
 */
package com.java.core.work.abstract_eg;

/**
 * @author balajisoundarrajan
 *
 */
public class Circle extends Shape{

	double pi = 3.14;
	int radius;
	
	Circle(String name, int radius){
		super(name);
		this.radius = radius;
	}

	@Override
	public double findArea() {
		return  pi * radius * radius;
	}

	@Override
	public void draw(String shapename) {
		System.out.println("Drawing " + shapename);
		
	}

}
