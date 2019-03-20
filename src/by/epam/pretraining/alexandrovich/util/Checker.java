/**
 * EPAM Pre-Training
 * Main Task 01
 * Utilities' part (Checker)
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.util;


public class Checker {
	
	public static void checkSize(double[] array) throws Exception {
		if (array == null) {
			throw new NullPointerException("Vector is not initilialized!");
		}
		
		if (array.length == 0) {
			throw new Exception("Vector size is 0!");
		}
	}
}
