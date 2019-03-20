/**
 * EPAM Pre-Training
 * Main Task 01
 * Testing part (for class VectorAction)
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorActionTest {
	double delta = 0.0001;

	@Test
	public void testIfSortedAscending() throws Exception {
		double[] arr = {1.1, 3.2, 4.9};
		boolean expected = true;
		
		assertTrue(expected == VectorAction.ifSorted(arr));
	}
	
	@Test
	public void testIfSortedDescending() throws Exception {
		double[] arr = {4.9, 3.2, 1.7};
		boolean expected = true;
		
		assertTrue(expected == VectorAction.ifSorted(arr));
	}
	
	@Test
	public void testIfSortedFalse() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		boolean expected = false;
		
		assertTrue(expected == VectorAction.ifSorted(arr));
	}
	
	@Test
	public void testReverse() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		double[] expecteds = {4.9, 3.2, 5.4};
		
		VectorAction.reverse(arr);
		assertArrayEquals(expecteds, arr, delta);
	}

}
