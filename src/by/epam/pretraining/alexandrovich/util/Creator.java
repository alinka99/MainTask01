/**
 * EPAM Pre-Training
 * Main Task 01
 * Utilities' part (Creator)
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.util;

public class Creator {

	public static double[] createArray(int N) throws Exception {
		if (N < 0) {
			throw new Exception("Negative size!");
		}
		
		double[] arr = new double[N]; 
		return arr;
	}
}
