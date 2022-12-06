/**
 * 
 */
package com.java.core.work.java8.streams;

/**
 * @author balaji soundarrajan
 *
 */
public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private int mark;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mark
	 */
	public int getMark() {
		return mark;
	}
	/**
	 * @param mark the mark to set
	 */
	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getMark() - o.getMark();
	}
}
