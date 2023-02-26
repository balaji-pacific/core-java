/**
 * 
 */
package com.java.core.work.compare;

import java.util.Comparator;

/**
 * @author Balaji Soundarrajan
 *
 */
public class SortUsingName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
