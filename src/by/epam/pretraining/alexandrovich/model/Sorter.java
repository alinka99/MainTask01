/**
 * EPAM Pre-Training
 * Main Task 01
 * Model part (logic) 2
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.model;

import by.epam.pretraining.alexandrovich.util.Checker;


public class Sorter {
	
	public static void swap(double[] array, int i, int j) {
		if (i == j) {
			return;
		}
		
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	} 
	
	
	public static void bubbleSort(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size = array.length;
		
		if (size == 1) {
			return;
		}
		
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (array[j + 1] < array[j]) {
					swap(array, j, j + 1);
				}
			}
		}
	}
	
	public static void descendingBubbleSort(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size = array.length;
		
		if (size == 1) {
			return;
		}
		
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j + 1] > array[j]) {
					swap(array,j, j + 1);
				}
			}
		}
	}
	
	
	public static void insertionSort(double[] array) throws Exception {
		Checker.checkSize(array);
			
		int size= array.length;
		
		if (size == 1) {
			return;
		}
		
		for (int i = 1; i < size; i++) {
			double currentElement = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] > currentElement) {
				array[j + 1] = array[j];
				j--;
			}
			
			array[j + 1] = currentElement;
		}
	}
	
	public static void descendingInsertionSort(double[] array) throws Exception {
		Checker.checkSize(array);
			
		int size= array.length;
		
		if (size == 1) {
			return;
		}
		
		for (int i = 1; i < size; i++) {
			double currentElement = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] < currentElement) {
				array[j + 1] = array[j];
				j--;
			}
			
			array[j + 1] = currentElement;
		}
	}
	
	
	public static void selectionSort(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size= array.length;
		
		if (size == 1) {
			return;
		}
		
		for (int i = 0; i < size; i++) {
			double min = array[i];
			int minInd = i;
			
			for (int j = i + 1; j < size; j++) {
				if (array[j] < min) {
					min = array[j];
					minInd = j;
				}
			}
			
			if (i != minInd) {
				swap(array, i, minInd);
			}
		}
	}
	
	public static void descendingSelectionSort(double[] array) throws Exception {
		Checker.checkSize(array);
			
		int size= array.length;
		
		if (size == 1) {
			return;
		}
		
		for (int i = 0; i < size; i++) {
			double max = array[i];
			int maxInd = i;
			
			for (int j = i + 1; j < size; j++) {
				if (array[j] > max) {
					max = array[j];
					maxInd = j;
				}
			}
			
			if (i != maxInd) {
				swap(array, i, maxInd);
			}
		}
	}
	
	
	public static void mergeSort(double[] array) throws Exception {
		Checker.checkSize(array);
			
		int size= array.length;

		if (size == 1) {
			return;
		}
		
		doMergeSort(array, 0, size - 1);
	}
	public static void doMergeSort(double[] array, int beg, int end) {
		if (beg >= end) { 
			return;
		}
		
		int mid = (beg + end) / 2;
		
		doMergeSort(array, beg, mid);
		doMergeSort(array, mid + 1, end);
		
		double[] buffer = new double[end - beg + 1];
		int i = beg, j = mid + 1, k = 0;
		
		while ((i <= mid) && (j <= end)) {
			if (array[i] < array[j]){
				buffer[k] = array[i++];
			} else {
				buffer[k] = array[j++];
			}
			k++;
		}
		
		while (i <= mid) {
			buffer[k++] = array[i++];
		}
		
		while (j <= end) {
			buffer[k++] = array[j++];
		}
		
		for (int m = 0; m < k; m++) {
			array[beg + m] = buffer[m];
		}
	}
	
	public static void descendingMergeSort(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size= array.length;

		if (size == 1) {
			return;
		}
		
		doDescendingMergeSort(array, 0, size - 1);
	}
	public static void doDescendingMergeSort(double[] array, int beg, int end) {
		if (beg >= end) { 
			return;
		}
		
		int mid = (beg + end) / 2;
		
		doDescendingMergeSort(array, beg, mid);
		doDescendingMergeSort(array, mid + 1, end);
		
		double[] buffer = new double[end - beg + 1];
		int i = beg, j = mid + 1, k = 0;
		
		while ((i <= mid) && (j <= end)) {
			if (array[i] > array[j]){
				buffer[k] = array[i++];
			} else {
				buffer[k] = array[j++];
			}
			k++;
		}
		
		while (i <= mid) {
			buffer[k++] = array[i++];
		}
		
		while (j <= end) {
			buffer[k++] = array[j++];
		}
		
		for (int m = 0; m < k; m++) {
			array[beg + m] = buffer[m];
		}
	}
	
	
	public static void quickSort(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size= array.length;

		if (size == 1) {
			return;
		}
		
		doQuickSort(array, 0, size - 1);
	}
	public static void doQuickSort(double[] array, int beg, int end) {
		if (beg >= end) {
			return;
		}
		
		int i = beg, j = end, mid = (beg + end) / 2;
		
		while (i < j) {
			while ((i < mid) && (array[i] < array[mid])) {
				i++;
			}
			while ((j > mid) && (array[j] > array[mid])) {
				j--;
			}
			if (i < j) {
				swap(array, i, j);
				if (i == mid) {
					mid = j;
				} else if (j == mid) {
					mid = i;
				}
			}
		}
		
		doQuickSort(array, beg, mid);
		doQuickSort(array, mid + 1, end);
	}
	
	public static void descendingQuickSort(double[] array) throws Exception {
		Checker.checkSize(array);
		
		int size= array.length;

		if (size == 1) {
			return;
		}
		
		doDescendingQuickSort(array, 0, size - 1);
	}
	public static void doDescendingQuickSort(double[] array, int beg, int end) {
		if (beg >= end) {
			return;
		}
		
		int i = beg, j = end, mid = (beg + end) / 2;
		
		while (i < j) {
			while ((i < mid) && (array[i] > array[mid])) {
				i++;
			}
			while ((j > mid) && (array[j] < array[mid])) {
				j--;
			}
			if (i < j) {
				swap(array, i, j);
				if (i == mid) {
					mid = j;
				} else if (j == mid) {
					mid = i;
				}
			}
		}
		
		doQuickSort(array, beg, mid);
		doQuickSort(array, mid + 1, end);
	}

}
