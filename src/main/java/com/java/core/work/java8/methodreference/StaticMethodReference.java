package com.java.core.work.java8.methodreference;

interface Method {
	public void print();
}

public class StaticMethodReference {

	public static void print() {
		System.out.println("Value print in Static Method reference");
	}

	public static void main(String arg[]) {
		Method method = StaticMethodReference::print;
		method.print();

	}

}
