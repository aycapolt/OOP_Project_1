package STATISTICS;

import java.util.Arrays;
import java.util.Scanner;

public class statistics {
	
	/* First operation's sub menu: */
	/* This method is added and it is the first sub-menu. It does not return anything, so the matrix operations' methods are declared outside of this method. 
	 * the method here is only to declare the sub-menu and get the user input.*/
    public static void statisticsMenu(Scanner arrays) {
        System.out.print("Enter the number of elements you want in the array: ");
        int n;
        while (true) {
            try {
                n = Integer.parseInt(arrays.nextLine());
                /* if the number of arrays are negative numbers, application warns user to write a positive number. */
                if (n > 0) break;
                else System.out.println("Enter a positive integer, please!");
                /* If the user tries to enter anything other than integer numbers, application also warns the user. */
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        /* arrays are declared as doubles as in the assignment. */
        double[] array = new double[n];
        System.out.println("Enter the elements of the array, please!:");
        /* as long as the i is smaller than the number of elements in array, continue to loop. add 1 to the i each time till the i is no longer
         * smaller than n.
         */
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.printf("Element %d: ", i + 1);
                    array[i] = Double.parseDouble(arrays.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }
        
        /* printing the results, there are four in total. */
        System.out.printf("Arithmetic Mean: %.2f%n", arithmeticMean(array));
        System.out.printf("Median: %.2f%n", calculateMedian(array));
        System.out.printf("Geometric Mean: %.2f%n", geometricMean(array));
        System.out.printf("Harmonic Mean: %.2f%n", harmonicMean(array, array.length - 1));

        System.out.println("Returning to the Main Menu :)!");
    }

    // Arithmetic Mean = (1/n) * Σx_i;
    // Where n is the number of observations and x_i are the values in the sample;
    public static double arithmeticMean(double[] array) {
        double sum = 0;
     // Iterating through each value in the array and adding it to the sum;
        for (double v : array) sum += v;
        return sum / array.length;
    }

    // If n is odd: Median = x((n+1)/2);
    // If n is even: Median = (x(n/2) + x(n/2 + 1)) / 2;
    public static double calculateMedian(double[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
     // Checking if the number of elements in the array is even;
        if (array.length % 2 == 0) {
        	/* If even: */
            return (array[middle - 1] + array[middle]) / 2.0;
        } else {
        	/* If odd: */
            return array[middle];
        }
    }
    
    // Geometric Mean = (Πx_i)^(1/n);
    // Where n is the number of observations and x_i are the values in the sample;
    public static double geometricMean(double[] array) {
    	double product = 1.0; // Declaring product to be 1;
        // Looping through each value in the array;
        for (double v : array) {
            product *= v; // Multiply each value to the product (Π indicates that.);
        }

        // We calculate the nth root of the product using a loop;
        int n = array.length; // Getting the number of values;
        double nthRoot = 1.0; // Declaring the variable;
        for (int i = 0; i < n; i++) {
            nthRoot *= product; // Multiplying the product for n times;
        }
        
        // To find the nth root, we will approximate by repeated multiplication;
        double result = 1.0;
        double factor = product; // Starting with the product;
        for (int i = 0; i < n; i++) {
            result *= factor; // Multiplying the factor for n times;
            if (i < n - 1) { // Decreasing the factor for approximation;
                factor = Math.sqrt(factor); // Taking the square root for the next iteration;
            }
        }
        return result; 
    }

    // Harmonic Mean = n / (Σ(1/x_i))
    // Where n is the number of observations and x_i are the values in the sample;
    public static double harmonicMean(double[] array, int index) {
        if (index == 0) return array.length / array[0];

        // Harmonic Mean = n / (1/x_1 + 1/x_2 + ... + 1/x_n), the following line indicates the recursiveness. 
        return array.length / (array[index] + 1.0 / harmonicMean(array, index - 1));
    }

}
