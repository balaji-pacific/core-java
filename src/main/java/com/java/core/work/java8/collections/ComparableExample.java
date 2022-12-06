package com.java.core.work.java8.collections;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.core.work.java8.streams.Student;

public class ComparableExample {
	
	public static void main(String arg[]) {
		
		List<Student> l = getStudentList();
		Collections.sort(l);
		System.out.println(l);
	}
	

	public static List<Student> getStudentList(){
		return Stream.of(new Student(12, "Balaji", 1000),
						 new Student(13, "Yashika", 200),
						 new Student(14, "Yashika", 300))
				.collect(Collectors.toList());
	}

}


