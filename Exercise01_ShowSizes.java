/**
 * 
 */
package slideDeckExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise01_ShowSizes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Dataset 1");
		System.out.println();
		double[] newArray = arrayCollection(6);
		System.out.println();
		printArrayToScreen(newArray);
		System.out.println();
		double average = calcAverageSize(newArray);
		System.out.println("Average to nearest half size: " + average);
		
		System.out.println();
		System.out.println("Dataset 2");
		System.out.println();
		double[] differentArray = new double[] {8.5, 9.3, 7.2, 8.6, 9.0, 14.2 };
		printArrayToScreen(differentArray);
		System.out.println("Average to nearest half size: " + calcAverageSize(differentArray));
		
		

	}
	/**
	 * This method calculated the average to the nearest half of the inputed array
	 * @param myArray - Array to be inputed
	 * @return - double of average to the nearest half size
	 */
	public static double  calcAverageSize(double[] myArray) {
		
		double total = 0;
		double average = 0;
		double averageToNearestHalfSize;
		
		for (int i = 0 ; i < myArray.length; i++) {
			total += myArray[i];
		}
		
		average = total / myArray.length;
		
		averageToNearestHalfSize = Math.round(average * 2) / 2.0;
		
		return averageToNearestHalfSize;
	}
	
	/**
	 * This method prints the values of an inputed array to the console
	 * @param newArray - inputed array
	 */
	public static void printArrayToScreen(double[] newArray) {
		System.out.println("Shoe\tSize");
		for (int i = 0; i < newArray.length; i++)
			System.out.println((i + 1) + ": \t" + newArray[i]);
	}

	/**
	 * This method collects user input to create and array of the desired length
	 * @param individualShoeSizes - amount of items needed in the array
	 * @return - returns created double array
	 */
	public static double[] arrayCollection(int individualShoeSizes) {

		Scanner myScan = new Scanner(System.in);

		double[] shoeSizes = new double[individualShoeSizes];

		// for Loop with User Prompt and Data Collection

		for (int i = 0; i < shoeSizes.length; i++) {

			System.out.println("Input shoe size: (" + (i + 1) + " of " + shoeSizes.length + ")");
			shoeSizes[i] = myScan.nextDouble();
		}

		return shoeSizes;

	}
}
