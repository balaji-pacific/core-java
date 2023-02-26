/**
 * 
 */
package com.java.core.work.abstract_eg;

/**
 * @author Balaji Soundarrajan
 *
 */
public abstract class Shape {
	
	String objectName;
	
	Shape(String name){
		this.objectName = name;
	}
	
	abstract public double findArea();
	abstract public void draw(String shapename);
	
	public void dimensionsOfShape(int x, int y) {
		System.out.println("The shape of " + objectName + " is " + x + " and " + y);
	}

}
