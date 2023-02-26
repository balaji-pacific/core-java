/**
 * 
 */
package com.java.datastructures.sorting.insertion;

/**
 * @author Balaji Soundarrajan
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] list = {1,12,5,70,4,2};
		list = InsertionSort.insertionSort(list);
		for (int i : list) {
			System.out.print(" "+i);
		}
	}
	
	
	public static int[] insertionSort(int[] list) {
		
		for(int i=1; i< list.length; i++) {
			int j = i-1;
			int key = list[i];
			while(j>=0 && list[j]>key) {
				list[j+1] = list[j];
				j = j-1;
			}
			list[j+1] = key;
		}
		
		return list;
	}

}
