package com.java.core.work.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJava8 {
	public static Student[] arrayOfStudents = {
			new Student(1, "Balaji", 100),
			new Student(2, "Vasuki", 90),
			new Student(3, "Deepa", 80)
	};
	
	
	public static void main(String arg[]) {
		List<String> list = new ArrayList<String>();
		list.add("Balaji");
		list.add("Soundarrajan");
	
		
		
		Stream s = Stream.of(arrayOfStudents);
		s.forEach(s1 -> System.out.println(s1));
		
		
		Stream.Builder<Student> studentBuilder = Stream.builder();
		studentBuilder.accept(new Student(4, "Yashika", 100));
		
		s = studentBuilder.build();
		s.forEach(st1 -> System.out.println(st1));
		
		//Map
		
		List<Student> l =  Stream.of(new Integer[] {2})
		.map(GetStudent::getStudent)
		.collect(Collectors.toList());
	
		System.out.println("Map: Get the ID Value");
		Stream s1 = Stream.of(l);
		s1.forEach(st2 -> System.out.println(st2));
		
		
		//Filer
		List<Student> l1 = Stream.of(new Integer[] {1,2,3,4})
				.map(GetStudent::getStudent)
				.filter(f -> f != null)
				.filter(f -> f.getMark() >= 50)
				.peek(f->System.out.println("Peek : " + f))
				.collect(Collectors.toList());
		
		System.out.println("Filter : Marks Greater than 90");
		Stream s2 = Stream.of(l1);
		s2.forEach(st3 -> System.out.println(st3));
		
		//Sorted
		
		Integer[] integerLists = {100, 300, 400, 46, 250};
		Stream sortedStream = Stream.of(integerLists).sorted();
		sortedStream.forEach(st4 -> System.out.println(st4));
		
		//FlatMap
		
		List<Integer> primeNumber = Arrays.asList(3,5,7,11);
		List<Integer> odd = Arrays.asList(13, 15, 17, 19);
		List<Integer> even = Arrays.asList(10, 22, 24, 26);
		
		List<List<Integer>> allData = Arrays.asList(primeNumber, odd, even);
		System.out.println("Before Flatten : " + allData);
		
		List<Integer> flatList = allData.stream().flatMap(listl -> listl.stream()).collect(Collectors.toList());
		System.out.println("After Flatten : " + flatList);
		
		
	}
	
	public class GetStudent{
		public static Student getStudent(int id) {
			for (Student student : arrayOfStudents) {
				if(id == student.getId()) {
					return student;
				}
			}
			return null;
		}
	}
	
}


