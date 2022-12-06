package com.java.core.work.abstract_eg;

public class Rectangle extends Shape{
	
	int length;
	int width;
	
	Rectangle(String name, int length, int width){
		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	public double findArea() {
		return length * width;
	}

	@Override
	public void draw(String shapename) {
		System.out.println("Drawing " + shapename);
		
	}
	
}
