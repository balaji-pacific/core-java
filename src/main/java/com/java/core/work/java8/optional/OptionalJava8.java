package com.java.core.work.java8.optional;

import java.util.Date;
import java.util.Optional;

public class OptionalJava8 {
	
	public static void main(String arg[]) {
		Optional<String> str = Optional.empty();
		System.out.println("The value os str " + str);
		
		Optional<String> str1 = Optional.ofNullable(null);
		System.out.println("The value os str1 " + str1);
		
		Optional<String> str2 = Optional.of("Value Two");
		System.out.println("The value os str2 " + str2);
		
		str1.ifPresent(s -> System.out.println("The value os str1 " +  str1));
		
		System.out.println(str2.orElse("Hi"));
		
		Optional<Date> date = Optional.of(null);
		
		System.out.println(date.orElseGet(() -> new Date()));
		
		date.orElseThrow(NullPointerException :: new);
		
		
	}

}
