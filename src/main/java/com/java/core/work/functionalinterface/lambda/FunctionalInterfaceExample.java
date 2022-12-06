package com.java.core.work.functionalinterface.lambda;

/**
 * @author balajisoundarrajan
 *
 */
public class FunctionalInterfaceExample implements FunctionalInterfaceDemo{

	@Override
	public void execute() {
		System.out.println("Hi Functional Interface!!!!");
		
	}
	
	public static void main(String args[]) {
		FunctionalInterfaceExample example = new FunctionalInterfaceExample();
		example.execute();
		
		example.methodDefault();
		
		FunctionalInterfaceDemo.methodStatic();
	}


}