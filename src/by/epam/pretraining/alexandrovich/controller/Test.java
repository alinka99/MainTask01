/**
 * EPAM Pre-Training
 * Main Task 01
 * Controller part
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.controller;


import java.util.Arrays;

import by.epam.pretraining.alexandrovich.model.Finder;
import by.epam.pretraining.alexandrovich.model.Sorter;
import by.epam.pretraining.alexandrovich.model.VectorAction;
import by.epam.pretraining.alexandrovich.util.Creator;
import by.epam.pretraining.alexandrovich.util.Initializer;
import by.epam.pretraining.alexandrovich.view.Printer;

public class Test {
	
	public static void main (String[] args) {
		
		int N = 5, pos;
		double elementToFind = 1.0;
		
		try {
			double[] myVectorCopy, myVector = Creator.createArray(N);
			Initializer.initialize(myVector);
			
			Printer.print("Vector contents: " + VectorAction.toString(myVector));
			Printer.print("\nSome characteristics:\n");
			Printer.print("Min element: " + Finder.getMin(myVector));
			Printer.print("Max element: " + Finder.getMax(myVector));
			Printer.print("Arithmetic mean: " + Finder.getArithmeticMean(myVector));
			Printer.print("Geometric mean: " + Finder.getGeometricMean(myVector));
			Printer.print(VectorAction.ifSorted(myVector) ? "The vector is sorted" 
						: "The vector is not sorted");
			Printer.print("First local min: " + (((pos = Finder.getLocalMinIndex(myVector)) == -1) 
						? "no such element" : "at position " + pos));
			Printer.print("First local max: " + (((pos = Finder.getLocalMaxIndex(myVector)) == -1) 
						? "no such element" : "at position " + pos));
			Printer.print("The result of linear search for " + elementToFind + ": " +
						(((pos = Finder.getLinearSearchIndex(myVector, elementToFind)) == -1) 
						? "no such element" : "at position " + pos));
			VectorAction.reverse(myVector);
			Printer.print("Reversed vector: " + VectorAction.toString(myVector));
			
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.bubbleSort(myVectorCopy);
			Printer.print("Bubble sort, ascending: " + VectorAction.toString(myVectorCopy));
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.descendingBubbleSort(myVectorCopy);
			Printer.print("Bubble sort, descending: " + VectorAction.toString(myVectorCopy));
			
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.insertionSort(myVectorCopy);
			Printer.print("Insertion sort, ascending: " + VectorAction.toString(myVectorCopy));
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.descendingInsertionSort(myVectorCopy);
			Printer.print("Insertion sort, descending: " + VectorAction.toString(myVectorCopy));
			
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.selectionSort(myVectorCopy);
			Printer.print("Selection sort, ascending: " + VectorAction.toString(myVectorCopy));
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.descendingSelectionSort(myVectorCopy);
			Printer.print("Selection sort, descending: " + VectorAction.toString(myVectorCopy));
	
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.mergeSort(myVectorCopy);
			Printer.print("Merge sort, ascending: " + VectorAction.toString(myVectorCopy));
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.descendingMergeSort(myVectorCopy);
			Printer.print("Merge sort, descending: " + VectorAction.toString(myVectorCopy));
	
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.quickSort(myVectorCopy);
			Printer.print("Quick sort, ascending: " + VectorAction.toString(myVectorCopy));
			myVectorCopy = Arrays.copyOf(myVector, N);
			Sorter.descendingQuickSort(myVectorCopy);
			Printer.print("Quick sort, descending: " + VectorAction.toString(myVectorCopy));
			
			Sorter.bubbleSort(myVector);
			Printer.print("The result of binary search for " + elementToFind + ": " +
					(((pos = Finder.getBinarySearchIndex(myVector, elementToFind)) == -1) 
					? "no such element" : "at position " + pos));
			
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}
