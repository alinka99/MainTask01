/**
 * EPAM Pre-Training
 * Main Task 01
 * Model part (logic) 3
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */
package by.epam.pretraining.alexandrovich.model;


import by.epam.pretraining.alexandrovich.util.Checker;

public class VectorAction {
	
	public static String toString(double[] array) {
		String str = "";
		
		for (int i = 0; i < array.length; i++) {
			str += array[i] +  " ";
		}
		
		return str;
	}
	
	public static boolean ifSorted(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size = array.length;
		boolean ifSorted = true;
		
		if (size != 1) {
			int ascending = 0, descending = 0;
			
			for (int i = 0; i <size - 1; i++) {
				if (array[i + 1] >= array[i]) {
					ascending++;
				}
				if (array[i + 1] <= array[i]) {
					descending++;
				}
			}
		
			if (ascending != size - 1 && descending != size - 1) {
				ifSorted = false;
			}
		}
		
		return ifSorted;
	}
	
	public static void reverse(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size = array.length;
		
		if (size == 1) {
			return;
		}
		
		for (int i = 0; i < size / 2; i++){
			Sorter.swap(array, i, size - i - 1);
		}
	}
}
