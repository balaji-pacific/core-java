/**
 * 
 */
package com.java.datastructures.sorting.bubble;

/**
 * @author balaji soundarrajan
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] list = BubbleSort.bubbleSort(new int[] {32, 45, 1, 6, 23, -9, 3});
		BubbleSort.print(list);

	}
	
	public static int[] bubbleSort(int[] list) {
		for(int j=0; j<list.length ; j++) {
			for(int i=0; i< list.length-j-1; i++) {
				if(list[i] > list [i+1]) {
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}
		}
		return list;
	}
	
	public static void print(int[] list) {
		for(int i : list) {
			System.out.print(i + " ");
		}
	}

}
