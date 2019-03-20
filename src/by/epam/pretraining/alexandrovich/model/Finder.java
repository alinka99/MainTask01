/**
 * EPAM Pre-Training
 * Main Task 01
 * Model part (logic) 1
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.model;

import by.epam.pretraining.alexandrovich.util.Checker;

public class Finder {
	
	public static double getMax(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size = array.length;
		double max = array[0];
		
		if (size != 1) {
			for (int i = 1; i < size; i++) {
				if (array[i] > max) {
					max = array[i];
				}
			}
		}
		
		return max;
	}
	
	public static double getMin(double[] array) throws Exception {
		Checker.checkSize(array);

		int size = array.length;
		double min = array[0];
		
		if (size != 1) {
			for (int i = 1; i < size; i++) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		
		return min;
	}
	
	
	public static double getArithmeticMean(double[] array) throws Exception {
		Checker.checkSize(array);

		int size = array.length;
		double sum = array[0];
		
		if (size != 1) {
			for (int i = 1; i < size; i++) {
				sum += array[i];
			}
			sum /= size;   
		}
		
		return sum; 
	}
	
	public static double getGeometricMean(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size = array.length;
		double mul = array[0];
		
		if (size != 1) {
			for (int i = 1; i < size; i++) {
				mul *= array[i];
			}
			mul = Math.pow(mul, 1.0 / size);  
		}
		
		return mul;
	}
	
	
	public static int getLocalMinIndex(double[] array) throws Exception{
		Checker.checkSize(array);
		
		int size = array.length;
		int ind = -1;
		
		if (size == 1) {
			ind = 0;
		} else if (array[0] < array[1]) {
			ind = 0;
		} else {
			for (int i = 1; i < size - 1; i++) {
				if ((array[i] < array[i - 1]) && (array[i] < array[i + 1])) {
					ind = i;
					break;
				}
			}
			
			if (ind == -1) {
				if (array[size - 1] < array[size - 2]) {
					ind = size - 1;
				}
			}		
		}
		
		return ind;
	}
	
	public static int getLocalMaxIndex(double[] array) throws Exception{
		Checker.checkSize(array);
		
		int size = array.length;
		int ind = -1;
		
		if (size == 1) {
			ind = 0;
		} else if (array[0] > array[1]) {
			ind = 0;
		} else {
			for (int i = 1; i < size - 1; i++) {
				if ((array[i] > array[i - 1]) && (array[i] > array[i + 1])) {
					ind = i;
					break;
				}
			}
			
			if (ind == -1) {
				if (array[size - 1] > array[size - 2]) {
					ind = size - 1;
				}
			}
		}
		
		return ind;
	}
	
	
	public static int getLinearSearchIndex(double[] array, double element) throws Exception {
		Checker.checkSize(array);
		
		int size = array.length;
		int ind = -1;
		
		for (int i = 0; i < size; i++) {
			if (array[i] == element){
				ind = i;
				break;
			}
		}
		
		return ind;
	}
	
	public static int getBinarySearchIndex(double[] array, double element) throws Exception {
		Checker.checkSize(array);
		
		if (!VectorAction.ifSorted(array)) {
			throw new Exception("Vector is not sorted!");
		}
		
		int size = array.length;
		int ind = -1;
		int beg = 0, end = size - 1;
		
		while (beg <= end) {
			int pos = (beg + end) / 2;
			
			if (array[pos] == element) {
				ind = pos;
				break;
			} else if (array[pos] < element) {
				beg = pos + 1;
			} else {
				end = pos - 1;
			} 
		}
		
		return ind;
	}
}
