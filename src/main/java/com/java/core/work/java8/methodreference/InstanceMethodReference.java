package com.java.core.work.java8.methodreference;

interface InstanceMethod {
	public void print();
}

public class InstanceMethodReference {

	// Instance Method Reference
	public void print() {
		System.out.println("Value print in Instance Method reference");
	}

	public static void main(String arg[]) {

		// Instance Method Reference
		InstanceMethodReference methodReference = new InstanceMethodReference();
		InstanceMethod methodInstance = methodReference::print;
		methodInstance.print();
	}

}