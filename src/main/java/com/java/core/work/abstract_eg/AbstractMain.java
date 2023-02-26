/**
 * 
 */
package com.java.core.work.abstract_eg;

/**
 * @author Balaji Soundarrajan
 *
 */
public class AbstractMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape circle = new Circle("Circle", 4);
		circle.draw("Circle");
		circle.dimensionsOfShape(0, 4);
		System.out.println("Area of the circle : " + circle.findArea());
		
		System.out.println("");
		
		Shape rect = new Rectangle("rectangle", 3, 2);
		rect.draw("Rectangle");
		rect.dimensionsOfShape(3, 2);
		System.out.println("Area of the rectangle : " + rect.findArea());
		

	}

}
