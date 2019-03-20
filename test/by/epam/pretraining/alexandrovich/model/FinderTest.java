/**
 * EPAM Pre-Training
 * Main Task 01
 * Testing part (for class Finder)
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinderTest {
	double delta = 0.0001;

	@Test
	public void testGetMax() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		double expected = 5.4;
		
		assertTrue(expected == Finder.getMax(arr));
	}

	@Test
	public void testGetMin() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		double expected = 3.2;
		
		assertEquals(expected, Finder.getMin(arr), delta);
	}

	@Test
	public void testGetArithmeticMean() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		double expected = 4.5;
		
		assertEquals(expected, Finder.getArithmeticMean(arr), delta);
	}

	@Test
	public void testGetGeometricMean() throws Exception {
		double[] arr = {2.0, 4.0, 8.0};
		double expected = 4.0;
		
		assertEquals(expected, Finder.getGeometricMean(arr), delta);
	}
	
	@Test
	public void testGetLocalMinIndex() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		int expected = 1;
		
		assertEquals(expected, Finder.getLocalMinIndex(arr), delta);
	}
	
	@Test
	public void testGetLocalMinIndexNotFound() throws Exception {
		double[] arr = {5.4, 3.2, 3.2};
		int expected = -1;
		
		assertEquals(expected, Finder.getLocalMinIndex(arr), delta);
	}

	@Test
	public void testGetLocalMaxIndex() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		int expected = 0;
		
		assertEquals(expected, Finder.getLocalMaxIndex(arr), delta);
	}
	
	@Test
	public void testGetLocalMaxIndexNotFound() throws Exception {
		double[] arr = {5.4, 5.4, 4.9};
		int expected = -1;
		
		assertEquals(expected, Finder.getLocalMaxIndex(arr), delta);
	}

	
	@Test
	public void testGetLinearSearchIndex() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		double elementToFind = 3.2;
		int expected = 1;
		
		assertEquals(expected, Finder.getLinearSearchIndex(arr, elementToFind), delta);
	}
	
	@Test
	public void testGetLinearSearchIndexNotFound() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		double elementToFind = 3.0;
		int expected = -1;
		
		assertEquals(expected, Finder.getLinearSearchIndex(arr, elementToFind), delta);
	}

	@Test
	public void testGetBinarySearchIndex() throws Exception {
		double[] arr = {1.4, 3.2, 4.9};
		double elementToFind = 3.2;
		int expected = 1;

		assertEquals(expected, Finder.getBinarySearchIndex(arr, elementToFind), delta);
	}
	
	@Test
	public void testGetBinarySearchIndexNotFound() throws Exception {
		double[] arr = {1.4, 3.2, 4.9};
		double elementToFind = 3.0;
		int expected = -1;
		
		assertEquals(expected, Finder.getBinarySearchIndex(arr, elementToFind), delta);
	}
	
	@Test
	public void testGetBinarySearchIndexNotSorted() throws Exception {
		double[] arr = {5.4, 3.2, 4.9};
		double elementToFind = 3.2;

		try {
			Finder.getBinarySearchIndex(arr, elementToFind);
			fail();
		} catch (Exception e) {}
	}

}
