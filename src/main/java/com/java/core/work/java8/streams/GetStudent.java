package com.java.core.work.java8.streams;

public class GetStudent{
	
	public static Student[] arrayOfStudents = {
			new Student(1, "Balaji", 100),
			new Student(2, "Vasuki", 90),
			new Student(3, "Deepa", 80)
	};
	
	public static Student getStudent(int id) {
		for (Student student : arrayOfStudents) {
			if(id == student.getId()) {
				return student;
			}
		}
		return null;
	}
}