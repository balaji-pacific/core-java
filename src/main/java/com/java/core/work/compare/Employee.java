/**
 * 
 */
package com.java.core.work.compare;

/**
 * @author Balaji Soundarrajan
 *
 */
public class Employee {
	
	private String name;
	private Double salary;
	
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
