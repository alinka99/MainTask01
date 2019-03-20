/**
 * EPAM Pre-Training
 * Main Task 01
 * Testing part (for class Sorter)
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.model;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SorterTest {
	double delta = 0.0001;
	double[] array;
	double[] arrayExpectedAscend;
	double[] arrayExpectedDescend;
	
	public SorterTest(double[] arr, double[] arrAscend, double[] arrDescend) {
		array = arr;
		arrayExpectedAscend = arrAscend;
		arrayExpectedDescend = arrDescend;
	}

	@Parameters
	public static Collection<Object[]> getParameters() {
		return Arrays.asList(new Object[][] {
				{new double[]{1.2}, new double[]{1.2}, new double[]{1.2}},
				{new double[]{1.3, 1.1}, new double[]{1.1,1.3}, new double[]{1.3, 1.1}},
				{new double[]{5.4, 3.2, 4.9}, new double[]{3.2, 4.9, 5.4}, new double[]{5.4, 4.9, 3.2}},
				{new double[]{4.9, 5.4, 3.2, 4.9}, new double[]{3.2, 4.9, 4.9, 5.4}, new double[]{5.4, 4.9, 4.9, 3.2}}
		});
	}
	
	@Test
	public void testBubbleSort() throws Exception {
		Sorter.bubbleSort(array);
		assertArrayEquals(arrayExpectedAscend, array, delta);
	}

	@Test
	public void testDescendingBubbleSort() throws Exception {
		Sorter.descendingBubbleSort(array);
		assertArrayEquals(arrayExpectedDescend, array, delta);
	}

	
	@Test
	public void testInsertionSort() throws Exception {
		Sorter.insertionSort(array);
		assertArrayEquals(arrayExpectedAscend, array, delta);
	}

	@Test
	public void testDescendingInsertionSort() throws Exception {
		Sorter.descendingInsertionSort(array);
		assertArrayEquals(arrayExpectedDescend, array, delta);
	}

	
	@Test
	public void testSelectionSort() throws Exception {
		Sorter.selectionSort(array);
		assertArrayEquals(arrayExpectedAscend, array, delta);
	}

	@Test
	public void testDescendingSelectionSort() throws Exception {
		Sorter.descendingSelectionSort(array);
		assertArrayEquals(arrayExpectedDescend, array, delta);
	}

	
	@Test
	public void testMergeSort() throws Exception {
		Sorter.mergeSort(array);
		assertArrayEquals(arrayExpectedAscend, array, delta);
	}

	@Test
	public void testDescendingMergeSort() throws Exception {
		Sorter.descendingMergeSort(array);
		assertArrayEquals(arrayExpectedDescend, array, delta);
	}

	
	@Test
	public void testQuickSortVector() throws Exception {
		Sorter.quickSort(array);
		assertArrayEquals(arrayExpectedDescend, array, delta);
	}

	@Test
	public void testDescendingQuickSort() throws Exception {
		Sorter.descendingQuickSort(array);
		assertArrayEquals(arrayExpectedDescend, array, delta);
	}


}
