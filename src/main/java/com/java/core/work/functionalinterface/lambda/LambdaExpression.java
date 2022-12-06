package com.java.core.work.functionalinterface.lambda;

public class LambdaExpression {
	
	public static void main(String args[]) {
		
		FunctionalInterfaceDemo fid = () -> System.out.println("Hi Functional Interface in lambda");
		
		fid.execute();
		
		FunctionalInterfaceDemoArgument fida = (int a, int b) -> System.out.println("Multiply " + a*b);
		fida.multiply(5, 5);
		
		FunctionalInterfaceWithArgumentReturnType fiart = (int a, int b) -> {return a+b; };
		
		System.out.println("Add : " + fiart.add(3, 3));
	}

}
