/**
 * 
 */
package com.java.datastructures.sorting.selection;

/**
 * @author Balaji Soundarrajan
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] list = SelectionSort.selectionSort(new int[] {21,5,35,8,30,-4,9050,56});
		SelectionSort.printList(list);

	}
	
	public static int[] selectionSort(int[] list) {
		for(int i=0; i< list.length; i++) {
			for(int j=i+1; j< list.length; j++) {
				if(list[i] > list[j]) {
					int smallest = list[j];
					list[j] = list[i];
					list[i] = smallest;
				}
			}
		}
		return list;
	}
	
	public static void printList(int[] list) {
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
}
