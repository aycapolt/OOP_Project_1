// Main menu is structured with ASCII and 5 options (Statistics method is completely added) as a base.

package oop;

import java.util.Arrays;
import java.util.Scanner;

public class oop {

	public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String choice;

        System.out.printf("									   *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*%n");
        System.out.printf("							         		     WELCOME TO OUR PROJECT!                   %n");
        System.out.printf("									   *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*%n");
        System.out.printf("											    ,-. __ .-,%n");
        System.out.printf("											  --;. '   .'%n");
        System.out.printf("											   / (  ^__^  )%n");
        System.out.printf("											  ;   (_'_)' \\%n");
        System.out.printf("											  '   .--'_,  ;%n");
        System.out.printf("											~~-..._)))(((.' %n");
        System.out.printf("%n");
        System.out.printf("Team Members:"
        		+ "  		                                                                         \r\n"
        		+ "(   )                          (   )                   (   )                 (   )          \r\n"
        		+ " | |.-.     .--.    ___ .-.     | |   ___     .--.      | |   ___     .---.   | |    .--.   \r\n"
        		+ " | /   \\   /    \\  (   )   \\    | |  (   )   /    \\     | |  (   )   / .-, \\  | |   /    \\  \r\n"
        		+ " |  .-. | |  .-. ;  | ' .-. ;   | |  ' /    |  .-. ;    | |  ' /    (__) ; |  | |  |  .-. ; \r\n"
        		+ " | |  | | |  | | |  |  / (___)  | |,' /     |  | | |    | |,' /       .'`  |  | |  |  | | | \r\n"
        		+ " | |  | | |  |/  |  | |         | .  '.     |  |/  |    | .  '.      / .'| |  | |  |  |/  | \r\n"
        		+ " | |  | | |  ' _.'  | |         | | `. \\    |  ' _.'    | | `. \\    | /  | |  | |  |  ' _.' \r\n"
        		+ " | '  | | |  .'.-.  | |         | |   \\ \\   |  .'.-.    | |   \\ \\   ; |  ; |  | |  |  .'.-. \r\n"
        		+ " ' `-' ;  '  `-' /  | |         | |    \\ .  '  `-' /    | |    \\ .  ' `-'  |  | |  '  `-' / \r\n"
        		+ "  `.__.    `.__.'  (___)       (___ ) (___)  `.__.'    (___ ) (___) `.__.'_. (___)  `.__.'  \r\n"
        		+ "                                                                                           , "
        		+ "                                                                                \r\n"
        		+ " .-.  (   )                          (   )       .-.                   (   )                                     (   )            .-.  \r\n"
        		+ "( __)  | |.-.    ___ .-.      .---.   | | .-.   ( __)  ___ .-. .-.      | |   ___     .---.   ___  ___    .---.   | |    .--.    ( __) \r\n"
        		+ "(''\")  | /   \\  (   )   \\    / .-, \\  | |/   \\  (''\") (   )   '   \\     | |  (   )   / .-, \\ (   )(   )  / .-, \\  | |   /    \\   (''\") \r\n"
        		+ " | |   |  .-. |  | ' .-. ;  (__) ; |  |  .-. .   | |   |  .-.  .-. ;    | |  ' /    (__) ; |  | |  | |  (__) ; |  | |  |  .-. ;   | |  \r\n"
        		+ " | |   | |  | |  |  / (___)   .'`  |  | |  | |   | |   | |  | |  | |    | |,' /       .'`  |  | |  | |    .'`  |  | |  |  |(___)  | |  \r\n"
        		+ " | |   | |  | |  | |         / .'| |  | |  | |   | |   | |  | |  | |    | .  '.      / .'| |  | |  | |   / .'| |  | |  |  |       | |  \r\n"
        		+ " | |   | |  | |  | |        | /  | |  | |  | |   | |   | |  | |  | |    | | `. \\    | /  | |  | |  | |  | /  | |  | |  |  | ___   | |  \r\n"
        		+ " | |   | '  | |  | |        ; |  ; |  | |  | |   | |   | |  | |  | |    | |   \\ \\   ; |  ; |  ' '  ; '  ; |  ; |  | |  |  '(   )  | |  \r\n"
        		+ " | |   ' `-' ;   | |        ' `-'  |  | |  | |   | |   | |  | |  | |    | |    \\ .  ' `-'  |   \\ `' /   ' `-'  |  | |  '  `-' |   | |  \r\n"
        		+ "(___)   `.__.   (___)       `.__.'_. (___)(___) (___) (___)(___)(___)  (___ ) (___) `.__.'_.    '_.'    `.__.'_. (___)  `.__,'   (___), "
        		+ "                                \r\n"
        		+ "                        (   )                              (   )        /    \\                                   (   )          (   )                             (   )                   (   )     \r\n"
        		+ " ___ .-. .-.     .--.    | | .-.    ___ .-. .-.     .--.    | |_        | .`. ;    .---.   ___ .-.     ___  ___   | |   ___      | |   ___     .--.    ___ .-.     | |   ___    ___  ___   | |_     \r\n"
        		+ "(   )   '   \\   /    \\   | |/   \\  (   )   '   \\   /    \\  (   __)      | |(___)  / .-, \\ (   )   \\   (   )(   )  | |  (   )     | |  (   )   /    \\  (   )   \\    | |  (   )  (   )(   ) (   __)   \r\n"
        		+ " |  .-.  .-. ; |  .-. ;  |  .-. .   |  .-.  .-. ; |  .-. ;  | |         | |_     (__) ; |  | ' .-. ;   | |  | |   | |  ' /       | |  ' /    |  .-. ;  | ' .-. ;   | |  ' /     | |  | |   | |      \r\n"
        		+ " | |  | |  | | |  | | |  | |  | |   | |  | |  | | |  | | |  | | ___    (   __)     .'`  |  |  / (___)  | |  | |   | |,' /        | |,' /     | |  | |  |  / (___)  | |,' /      | |  | |   | | ___  \r\n"
        		+ " | |  | |  | | |  |/  |  | |  | |   | |  | |  | | |  |/  |  | |(   )    | |       / .'| |  | |         | |  | |   | .  '.        | .  '.     | |  | |  | |         | .  '.      | |  | |   | |(   ) \r\n"
        		+ " | |  | |  | | |  ' _.'  | |  | |   | |  | |  | | |  ' _.'  | | | |     | |      | /  | |  | |         | |  | |   | | `. \\       | | `. \\    | |  | |  | |         | | `. \\     | |  | |   | | | |  \r\n"
        		+ " | |  | |  | | |  .'.-.  | |  | |   | |  | |  | | |  .'.-.  | ' | |     | |      ; |  ; |  | |         | |  ; '   | |   \\ \\      | |   \\ \\   | '  | |  | |         | |   \\ \\    | |  ; '   | ' | |  \r\n"
        		+ " | |  | |  | | '  `-' /  | |  | |   | |  | |  | | '  `-' /  ' `-' ;     | |      ' `-'  |  | |         ' `-'  /   | |    \\ .     | |    \\ .  '  `-' /  | |         | |    \\ .   ' `-'  /   ' `-' ;  \r\n"
        		+ "(___)(___)(___) `.__.'  (___)(___) (___)(___)(___) `.__.'    `.__.     (___)     `.__.'_. (___)         '.__.'   (___ ) (___)   (___ ) (___)  `.__.'  (___)       (___ ) (___)   '.__.'     `.__.  , "
        		+ "                                                                                                                            ___            ___      \r\n"
        		+ "                                                                                                                           (   )          (   )     \r\n"
        		+ "   .--.      .--.    ___  ___   ___ .-.     .--.      .-..       .---.   ___  ___    .--.      .---.       .-..     .--.    | |    .---.   | |_     \r\n"
        		+ "  /    \\    /    \\  (   )(   ) (   )   \\   /    \\    /    \\     / .-, \\ (   )(   )  /    \\    / .-, \\     /    \\   /    \\   | |   / .-, \\ (   __)   \r\n"
        		+ " .  .-. |  |  .-. ;  | |  | |   |  .-. .  |  .-. ;  ' .-,  ;   (__) ; |  | |  | |  |  .-. ;  (__) ; |    ' .-,  ; |  .-. ;  | |  (__) ; |  | |      \r\n"
        		+ " | |  | |  |  | | |  | |  | |   | |  | |  |  | | |  | |  . |     .'`  |  | |  | |  |  |(___)   .'`  |    | |  . | | |  | |  | |    .'`  |  | | ___  \r\n"
        		+ " | |  | |  |  |/  |  | '  | |   | |  | |  |  |/  |  | |  | |    / .'| |  | '  | |  |  |       / .'| |    | |  | | | |  | |  | |   / .'| |  | |(   ) \r\n"
        		+ "(___)-` /  |  ' _.'  '  `-' |   | |  | |  |  ' _.'  | |  | |   | /  | |  '  `-' |  |  | ___  | /  | |    | |  | | | |  | |  | |  | /  | |  | | | |  \r\n"
        		+ "    '. \\   |  .'.-.   `.__. |   | |  | |  |  .'.-.  | |  ' |   ; |  ; |   `.__. |  |  '(   ) ; |  ; |    | |  ' | | '  | |  | |  ; |  ; |  | ' | |  \r\n"
        		+ "  ___ \\ '  '  `-' /   ___ | |   | |  | |  '  `-' /  | `-'  '   ' `-'  |   ___ | |  '  `-' |  ' `-'  |    | `-'  ' '  `-' /  | |  ' `-'  |  ' `-' ;  \r\n"
        		+ " (   ) ; |  `.__.'   (   )' |  (___)(___)  `.__.'   | \\__.'    `.__.'_.  (   )' |   `.__,'   `.__.'_.    | \\__.'   `.__.'  (___) `.__.'_.   `.__.   \r\n"
        		+ "  \\ `-'  /            ; `-' '                       | |                   ; `-' '                        | |                                        \r\n"
        		+ "   ',__.'              .__.'                       (___)                   .__.'                        (___)                                     %n%n");

        do {
            System.out.printf("Please choose an option from our menu :) :%n");
            System.out.printf("[A] Statistical Information about an array%n");
            System.out.printf("[B] Matrix Operations%n");
            System.out.printf("[C] Text Encryption/Decryption%n");
            System.out.printf("[D] Tic-tac-toe HotSeat%n");
            System.out.printf("[E] Terminate the Program%n");
            System.out.print("Enter your choice please!: ");
            
            choice = inputScanner.nextLine().toUpperCase();
            
            switch (choice) {
                case "A":
                    System.out.printf("Selection: Statistical Information about an array.%n");
                    statisticsMenu(inputScanner);
                    break;
                case "B":
                    System.out.printf("Selection: Matrix Operations.%n");
                    matrixOperationsMenu(inputScanner);
                    break;
                case "C":
                    System.out.printf("Selection: Text Encryption/Decryption.%n");
                    textEncryptionMenu(inputScanner);
                    break;
                case "D":
                    System.out.printf("Selection: Tic-tac-toe HotSeat.%n");
                    ticTacToeMenu(inputScanner);
                    break;
                case "E":
                    System.out.printf("Terminating the program. Goodbye!%n");
                    break;
                default:
                    System.out.printf("Invalid option. Please try again.%n");
            }
            System.out.println();

        } while (!choice.equals("E"));

        inputScanner.close();
    }
    
    
	/* First operation's sub menu: */
	/* This method is added and it is the first sub-menu. It does not return anything, so the matrix operations' methods are declared outside of this method. 
	 * the method here is only to declare the sub-menu and get the user input.*/
    private static void statisticsMenu(Scanner arrays) {
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
    private static double arithmeticMean(double[] array) {
        double sum = 0;
     // Iterating through each value in the array and adding it to the sum;
        for (double v : array) sum += v;
        return sum / array.length;
    }

    // If n is odd: Median = x((n+1)/2);
    // If n is even: Median = (x(n/2) + x(n/2 + 1)) / 2;
    private static double calculateMedian(double[] array) {
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
    private static double geometricMean(double[] array) {
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
    private static double harmonicMean(double[] array, int index) {
        if (index == 0) return array.length / array[0];

        // Harmonic Mean = n / (1/x_1 + 1/x_2 + ... + 1/x_n), the following line indicates the recursiveness. 
        return array.length / (array[index] + 1.0 / harmonicMean(array, index - 1));
    }
    
    /* Second operation's sub menu: */
    private static void matrixOperationsMenu(Scanner matrices) {
        int choice;
        
        do {
            clearScreen(); // Clears the screen.
            // Displays the menu options to the user.
            System.out.println("       MATRIX OPERATIONS MENU       ");
            System.out.println("\n1. Transpose");
            System.out.println("2. Inverse");
            System.out.println("3. Matrix Multiplication");
            System.out.println("4. Element-wise Multiplication");
            System.out.println("5. Return to Main Menu");
            System.out.print("\nChoose an option (1-5): ");

            choice = getValidInteger(scanner); // Gets a valid option from the user.

            if (choice == 5) { // Exit to main menu.
                System.out.println("Returning to main menu...");
                break;
            }

            clearScreen(); // Clears the screen and provides information about the selected operation.
            switch (choice) { // Displays information based on the user's choice.
                case 1:
                    System.out.println("       TRANSPOSE OF A MATRIX       ");
                    break;
                case 2:
                    System.out.println("       INVERSE OF A MATRIX         ");
                    break;
                case 3:
                    System.out.println("       MATRIX MULTIPLICATION       ");
                    break;
                case 4:
                    System.out.println("   ELEMENT-WISE MATRIX MULTIPLICATION   ");
                    break;
            }
			
			
			System.out.println("\n====================================");
            System.out.print("Enter the number of rows: ");
            int rows = getValidInteger(scanner); // Gets the number of rows for the matrix.
            System.out.print("Enter the number of columns: ");
            int cols = getValidInteger(scanner); // Gets the number of columns for the matrix.

            double[][] matrix1 = new double[rows][cols]; // Creates the first matrix.
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) { // Gets the elements of the matrix from the user.
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element (" + (i + 1) + ", " + (j + 1) + "): ");
                    matrix1[i][j] = getValidDouble(scanner); // Ensures a valid number is entered.
                }
            }

            switch (choice) { // Performs the operation based on the user's choice.
                case 1:
                    clearScreen(); // Clears the screen.
                    System.out.println("       TRANSPOSE RESULT            ");
                    double[][] transposed = transpose(matrix1); // Computes the transpose of the matrix.
                    System.out.println("Original Matrix:");
                    printMatrix(matrix1); // Prints the original matrix.
                    System.out.println("Transposed Matrix:");
                    printMatrix(transposed); // Prints the transposed matrix.
                    break;
                case 2:
                    clearScreen(); // Clears the screen.
                    if (rows != cols) { // Checks if the matrix is square for inverse calculation.
                        System.out.println("       INVERSE ERROR               ");
                        System.out.println("\nInverse can only be found for square matrices.");
                    } else {
                        double[][] inverse = inverse(matrix1); // Computes the inverse of the matrix.
                        if (inverse == null) { // If the matrix is singular, it cannot be inverted.
                            System.out.println("       INVERSE ERROR               ");
                            System.out.println("\nMatrix is singular and cannot be inverted.");
                        } else {
                            System.out.println("       INVERSE RESULT              ");
                            System.out.println("\nOriginal Matrix:");
                            printMatrix(matrix1); // Prints the original matrix.
                            System.out.println("\nInverse Matrix:");
                            printMatrix(inverse); // Prints the inverse matrix.
                        }
                    }
                    break;
                case 3:
                    clearScreen(); // Clears the screen.
                    System.out.print("\nEnter the number of rows for the second matrix: ");
                    int rows2 = getValidInteger(scanner); // Gets the number of rows for the second matrix.
                    System.out.print("Enter the number of columns for the second matrix: ");
                    int cols2 = getValidInteger(scanner); // Gets the number of columns for the second matrix.
                    if (cols != rows2) {
                        System.out.println("   MATRIX MULTIPLICATION ERROR     ");
                        System.out.println("\nNumber of columns of the first matrix must equal the number of rows of the second matrix.");
                    } else {
                        double[][] matrix2 = new double[rows2][cols2]; // Creates the second matrix.
                        System.out.println("Enter elements of the second matrix:");
                        for (int i = 0; i < rows2; i++) { // Gets the elements of the second matrix.
                            for (int j = 0; j < cols2; j++) {
                                System.out.print("Element (" + (i + 1) + ", " + (j + 1) + "): ");
                                matrix2[i][j] = getValidDouble(scanner); // Ensures a valid number is entered.
                            }
                        }
                        System.out.println("\nResult of Matrix Multiplication:");
                        double[][] product = multiplyMatrices(matrix1, matrix2); // Computes the product of the two matrices.
                        System.out.println("       MULTIPLICATION RESULT       ");
                        System.out.println("\nFirst Matrix:");
                        printMatrix(matrix1); // Prints the first matrix.
                        System.out.println("Second Matrix:");
                        printMatrix(matrix2); // Prints the second matrix.
                        System.out.println("Product Matrix:");
                        printMatrix(product); // Prints the product matrix.
                    }
                    break;
                case 4:
                    clearScreen(); // Clears the screen.
                    System.out.print("\nEnter the number of rows for the second matrix: ");
                    int rows3 = getValidInteger(scanner); // Gets the number of rows for the second matrix.
                    System.out.print("Enter the number of columns for the second matrix: ");
                    int cols3 = getValidInteger(scanner); // Gets the number of columns for the second matrix.
                    if (rows != rows3 || cols != cols3) {
                        System.out.println("   ELEMENT-WISE MULTIPLICATION ERROR");
                        System.out.println("\nMatrices must have the same dimensions for element-wise multiplication.");
                    } else {
                        double[][] matrix3 = new double[rows3][cols3]; // Creates the second matrix.
                        System.out.println("Enter elements of the second matrix:");
                        for (int i = 0; i < rows3; i++) { // Gets the elements of the second matrix.
                            for (int j = 0; j < cols3; j++) {
                                System.out.print("Element (" + (i + 1) + ", " + (j + 1) + "): ");
                                matrix3[i][j] = getValidDouble(scanner); // Ensures a valid number is entered.
                            }
                        }
                        System.out.println("\nResult of Element-wise Multiplication:");
                        double[][] elementWiseProduct = elementWiseMultiply(matrix1, matrix3); // Computes element-wise multiplication.
                        System.out.println("ELEMENT-WISE MULTIPLICATION RESULT ");
                        System.out.println("\nFirst Matrix:");
                        printMatrix(matrix1); // Prints the first matrix.
                        System.out.println("Second Matrix:");
                        printMatrix(matrix3); // Prints the second matrix.
                        System.out.println("Element-wise Multiplication Result:");
                        printMatrix(elementWiseProduct); // Prints the element-wise multiplication result.
                    }
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again."); // Shows an error message for invalid choices.
                    break;
            }
            System.out.println("\nPress Enter to return to the menu...");
            scanner.nextLine(); // Waits for the user to press Enter to return to the menu.
            scanner.nextLine();
        } while (choice != 5);
    }

    /* Third operation's sub menu*/
    /* This method is only declared to create a sub menu as an example like the matrix operations. 
     * Operation numbers can be changed, cases are only examples. Methods are not declared.. */
    private static void textEncryptionMenu(Scanner texts) {
        String choice_text;
        do {
            System.out.printf("%nText Encryption/Decryption Submenu:%n");
            System.out.printf("[1] Encrypt%n");
            System.out.printf("[2] Decrypt%n");
            System.out.printf("[B] Back to Main Menu%n");
            System.out.print("Enter your choice: ");
            choice_text = texts.next().toUpperCase();

            switch (choice_text) {
                case "1":
                    System.out.print("Enter the message to encrypt: ");
                    String message = texts.next();
                    System.out.printf("Encrypted message: " + message); // add encryption, might change
                    break;
                case "2":
                    System.out.printf("Enter the message to decrypt: ");
                    String encryptedMessage = texts.next();
                    System.out.printf("Decrypted message: " + encryptedMessage); // add decryption, might change
                    break;
                case "B":
                    System.out.printf("Returning to Main Menu :)! %n");
                    break;
                default:
                    System.out.printf("Invalid option. Please try again.%n");
            }
        } while (!choice_text.equals("B"));
    }

    /* Fourth operation's sub menu*/
    private static void ticTacToeMenu(Scanner game) {
        System.out.printf("Starting Tic-tac-toe game...");
        //ADD TIKTOKTOE GAME HERE
    }
    
    
}



