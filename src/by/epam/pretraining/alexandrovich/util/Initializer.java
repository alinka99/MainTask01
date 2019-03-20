/**
 * EPAM Pre-Training
 * Main Task 01
 * Utilities' part (Initializer)
 * 
 * @version 1.0 07 Mar 2019
 * @author Alina Alexandrovich
 */

package by.epam.pretraining.alexandrovich.util;


import java.util.Random;

public class Initializer {

	public static void initialize(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextDouble();
		}
	}
}
