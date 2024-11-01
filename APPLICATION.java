package oop;

import java.util.Arrays;
import java.util.Scanner;

public class APPLICATION {

    public static final char EMPTY = ' ';
    public static final char PLAYER_X = 'X';
    public static final char PLAYER_O = 'O';
    public static char[][] board = new char[3][3];
    public static Scanner scanner = new Scanner(System.in);

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
                    ticTacToeMenu();
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
	/**
	* This method provides a sub-menu for statistics operations and does not return anything.
	* It prompts the user for input, collects elements for an array, and then calculates
	* and displays the arithmetic mean, median, geometric mean, and harmonic mean.
	*
	* @param arrays Scanner object for capturing user input.
	*/
    public static void statisticsMenu(Scanner arrays) {
    	clearScreen();
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

    /**
	* Calculates the arithmetic mean of an array.
	* 
	* @param array the array of double values to calculate the mean.
	* @return the arithmetic mean of the array.
	*/
	
    public static double arithmeticMean(double[] array) {
        double sum = 0;
     /*  Iterating through each value in the array and adding it to the sum; */
        for (double v : array) sum += v;
        return sum / array.length;
    }

	/**
	* Calculates the median of an array.
	* 
	* @param array the array of double values to calculate the median.
	* @return the median value of the array.
	*/
	
    /*  If n is odd: Median = x((n+1)/2); */
    /* If n is even: Median = (x(n/2) + x(n/2 + 1)) / 2; */
    public static double calculateMedian(double[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
     /* Checking if the number of elements in the array is even;*/ 
        if (array.length % 2 == 0) {
        	/* If even: */
            return (array[middle - 1] + array[middle]) / 2.0;
        } else {
        	/* If odd: */
            return array[middle];
        }
    }
	
    /**
	* Calculates the geometric mean of an array.
	* 
	* @param array the array of double values to calculate the geometric mean.
	* @return the geometric mean of the array.
	*/
	
    /* Geometric Mean = (Πx_i)^(1/n); */ 
    /*  Where n is the number of observations and x_i are the values in the sample; */ 
    public static double geometricMean(double[] array) {
    	double product = 1.0; /* Declaring product to be 1; */ 
        /* Looping through each value in the array; */ 
        for (double v : array) {
            product *= v; /* Multiply each value to the product (Π indicates that.); */ 
        }

        /* We calculate the nth root of the product using a loop; */
        int n = array.length; /* Getting the number of values; */ 
        double nthRoot = 1.0; /* Declaring the variable; */ 
        for (int i = 0; i < n; i++) {
            nthRoot *= product; /* Multiplying the product for n times; */ 
        }
        
        /* To find the nth root, we will approximate by repeated multiplication; */ 
        double result = 1.0;
        double factor = product; /* Starting with the product; */ 
        for (int i = 0; i < n; i++) {
            result *= factor; /* Multiplying the factor for n times; */
            if (i < n - 1) { /* Decreasing the factor for approximation; */ 
                factor = Math.sqrt(factor); /* Taking the square root for the next iteration; */ 
            }
        }
        return result; 
    }
	
	/**
	* Calculates the harmonic mean of an array recursively.
	* 
	* @param array the array of double values to calculate the harmonic mean.
	* @param index the current index for recursion.
	* @return the harmonic mean of the array.
	*/
	
    /* Harmonic Mean = n / (Σ(1/x_i)) */ 
    /* Where n is the number of observations and x_i are the values in the sample; */ 
    public static double harmonicMean(double[] array, int index) {
        if (index == 0) return array.length / array[0];

        /* Harmonic Mean = n / (1/x_1 + 1/x_2 + ... + 1/x_n), the following line indicates the recursiveness.  */ 
        return array.length / (array[index] + 1.0 / harmonicMean(array, index - 1));
    }

    /**
	* Second operation's sub menu for matrix operations.
	* Provides the user with a menu for matrix operations including transpose, inverse,
	* matrix multiplication, and element-wise multiplication.
	*
	* @param matrices Scanner object for capturing user input.
	*/
	
    public static void matrixOperationsMenu(Scanner matrices) {
        int choice;
        
        do {
            clearScreen(); /* Clears the screen. */ 
            /* Displays the menu options to the user. */ 
            Scanner scanner = new Scanner(System.in);
            System.out.println("       MATRIX OPERATIONS MENU       ");
            System.out.println("\n1. Transpose");
            System.out.println("2. Inverse");
            System.out.println("3. Matrix Multiplication");
            System.out.println("4. Element-wise Multiplication");
            System.out.println("5. Return to Main Menu");
            System.out.print("\nChoose an option (1-5): ");

            choice = getValidInteger(scanner); /* Gets a valid option from the user. */ 

            if (choice == 5) { // Exit to main menu.
                System.out.println("Returning to main menu...");
                break;
            }

            clearScreen(); /* Clears the screen and provides information about the selected operation. */ 
            switch (choice) { /* Displays information based on the user's choice. */ 
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
            int rows = getValidInteger(scanner); /* Gets the number of rows for the matrix. */ 
            System.out.print("Enter the number of columns: ");
            int cols = getValidInteger(scanner); /* Gets the number of columns for the matrix. */ 

            double[][] matrix1 = new double[rows][cols]; /* Creates the first matrix. */ 
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) { /* Gets the elements of the matrix from the user. */ 
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element (" + (i + 1) + ", " + (j + 1) + "): ");
                    matrix1[i][j] = getValidDouble(scanner); /* Ensures a valid number is entered. */ 
                }
            }

            switch (choice) { /* Performs the operation based on the user's choice. */ 
                case 1:
                    clearScreen(); /* Clears the screen. */ 
                    System.out.println("       TRANSPOSE RESULT            ");
                    double[][] transposed = transpose(matrix1); /* Computes the transpose of the matrix. */ 
                    System.out.println("Original Matrix:");
                    printMatrix(matrix1); /* Prints the original matrix. */ 
                    System.out.println("Transposed Matrix:");
                    printMatrix(transposed); /* Prints the transposed matrix. */ 
                    break;
                case 2:
                    clearScreen(); /* Clears the screen. */ 
                    if (rows != cols) { /* Checks if the matrix is square for inverse calculation. */ 
                        System.out.println("       INVERSE ERROR               ");
                        System.out.println("\nInverse can only be found for square matrices.");
                    } else {
                        double[][] inverse = inverse(matrix1); /* Computes the inverse of the matrix. */ 
                        if (inverse == null) { /* If the matrix is singular, it cannot be inverted. */ 
                            System.out.println("       INVERSE ERROR               ");
                            System.out.println("\nMatrix is singular and cannot be inverted.");
                        } else {
                            System.out.println("       INVERSE RESULT              ");
                            System.out.println("\nOriginal Matrix:");
                            printMatrix(matrix1); /* Prints the original matrix. */ 
                            System.out.println("\nInverse Matrix:");
                            printMatrix(inverse); /* Prints the inverse matrix. */ 
                        }
                    }
                    break;
                case 3:
                    clearScreen(); /* Clears the screen. */ 
                    System.out.print("\nEnter the number of rows for the second matrix: ");
                    int rows2 = getValidInteger(scanner); /* Gets the number of rows for the second matrix. */ 
                    System.out.print("Enter the number of columns for the second matrix: ");
                    int cols2 = getValidInteger(scanner); /* Gets the number of columns for the second matrix. */ 
                    if (cols != rows2) {
                        System.out.println("   MATRIX MULTIPLICATION ERROR     ");
                        System.out.println("\nNumber of columns of the first matrix must equal the number of rows of the second matrix.");
                    } else {
                        double[][] matrix2 = new double[rows2][cols2]; /* Creates the second matrix. */ 
                        System.out.println("Enter elements of the second matrix:");
                        for (int i = 0; i < rows2; i++) { /* Gets the elements of the second matrix. */ 
                            for (int j = 0; j < cols2; j++) {
                                System.out.print("Element (" + (i + 1) + ", " + (j + 1) + "): ");
                                matrix2[i][j] = getValidDouble(scanner); /* Ensures a valid number is entered. */ 
                            }
                        }
                        System.out.println("\nResult of Matrix Multiplication:");
                        double[][] product = multiplyMatrices(matrix1, matrix2); /* Computes the product of the two matrices. */
                        System.out.println("       MULTIPLICATION RESULT       ");
                        System.out.println("\nFirst Matrix:");
                        printMatrix(matrix1); /* Prints the first matrix. */ 
                        System.out.println("Second Matrix:");
                        printMatrix(matrix2); /* Prints the second matrix. */ 
                        System.out.println("Product Matrix:");
                        printMatrix(product); /* Prints the product matrix. */ 
                    }
                    break;
                case 4:
                    clearScreen(); /* Clears the screen. */ 
                    System.out.print("\nEnter the number of rows for the second matrix: ");
                    int rows3 = getValidInteger(scanner); /* Gets the number of rows for the second matrix. */ 
                    System.out.print("Enter the number of columns for the second matrix: ");
                    int cols3 = getValidInteger(scanner); /* Gets the number of columns for the second matrix. */ 
                    if (rows != rows3 || cols != cols3) {
                        System.out.println("   ELEMENT-WISE MULTIPLICATION ERROR");
                        System.out.println("\nMatrices must have the same dimensions for element-wise multiplication.");
                    } else {
                        double[][] matrix3 = new double[rows3][cols3]; /* Creates the second matrix. */ 
                        System.out.println("Enter elements of the second matrix:");
                        for (int i = 0; i < rows3; i++) { /* Gets the elements of the second matrix. */ 
                            for (int j = 0; j < cols3; j++) {
                                System.out.print("Element (" + (i + 1) + ", " + (j + 1) + "): ");
                                matrix3[i][j] = getValidDouble(scanner); /* Ensures a valid number is entered. */ 
                            }
                        }
                        System.out.println("\nResult of Element-wise Multiplication:");
                        double[][] elementWiseProduct = elementWiseMultiply(matrix1, matrix3); /* Computes element-wise multiplication. */ 
                        System.out.println("ELEMENT-WISE MULTIPLICATION RESULT ");
                        System.out.println("\nFirst Matrix:");
                        printMatrix(matrix1); /* Prints the first matrix. */ 
                        System.out.println("Second Matrix:");
                        printMatrix(matrix3); /* Prints the second matrix. */ 
                        System.out.println("Element-wise Multiplication Result:");
                        printMatrix(elementWiseProduct); /* Prints the element-wise multiplication result. */ 
                    }
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again."); /* Shows an error message for invalid choices. */ 
                    break;
            }
            System.out.println("\nPress Enter to return to the menu...");
            scanner.nextLine(); /* Waits for the user to press Enter to return to the menu. */ 
            scanner.nextLine();
        } while (choice != 5);
    }
    
	/**
	* Prompts the user to enter a valid integer.
	* Repeatedly asks until an integer is provided.
	*
	* @param scanner Scanner to read user input.
	* @return The valid integer input.
	*/
    public static int getValidInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
	
	/**
	* Prompts the user to enter a valid double.
	* Repeatedly asks until a valid double is provided.
	*
	* @param scanner Scanner to read user input.
	* @return The valid double input.
	*/
	
    public static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
	/**
	* Calculates the transpose of a given matrix.
	*
	* @param matrix The matrix to be transposed.
	* @return The transposed matrix.
	*/
	
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
	/**
	* Calculates the inverse of a square matrix using Gauss-Jordan elimination.
	* If the matrix is singular, returns null.
	*
	* @param matrix The square matrix to be inverted.
	* @return The inverse of the matrix, or null if the matrix is singular.
	*/
    public static double[][] inverse(double[][] matrix) {
        int n = matrix.length;
        double[][] augmented = new double[n][2 * n];

        /* Create the augmented matrix (original matrix | identity matrix). */ 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmented[i][j] = matrix[i][j];
            }
            augmented[i][i + n] = 1;
        }

        /* Perform row operations to find the inverse. */ 
        for (int i = 0; i < n; i++) {
            double diagElement = augmented[i][i];
            if (diagElement == 0) {
                return null; /* If the diagonal element is zero, the matrix is singular. */ 
            }
            for (int j = 0; j < 2 * n; j++) {
                augmented[i][j] /= diagElement;
            }
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmented[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        augmented[k][j] -= factor * augmented[i][j];
                    }
                }
            }
        }

        /* Extract the right half of the augmented matrix as the inverse. */ 
        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = augmented[i][j + n];
            }
        }
        return inverse;
    }
	
	/**
	* Multiplies two matrices and returns the resulting matrix.
	* The number of columns in the first matrix must equal the number of rows in the second matrix.
	*
	* @param matrix1 The first matrix.
	* @param matrix2 The second matrix.
	* @return The product of the two matrices.
	*/
	
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
	
	/**
	* Performs element-wise multiplication of two matrices with the same dimensions.
	*
	* @param matrix1 The first matrix.
	* @param matrix2 The second matrix.
	* @return The element-wise product of the two matrices.
	*/
	
    public static double[][] elementWiseMultiply(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }
	
	/**
	* Prints the given matrix in a formatted manner.
	*
	* @param matrix The matrix to be printed.
	*/
	
    public static void printMatrix(double[][] matrix) {
        System.out.println("\nMatrix:");
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f\n", value); /* Prints each value in a formatted manner. */ 
            }
            System.out.println();
        }
    }

    /* Third operation's sub menu: */
	/**
	* Displays the text encryption menu and handles user input for encryption, decryption, and returning to the main menu.
	*
	* @param input Scanner object for reading user input.
	*/
	
    public static void textEncryptionMenu(Scanner input) {
    	clearScreen();
        int shiftvalue;
        int selection;
        String newstr;

        do {
            System.out.println("[1] Encryption,\n[2] Decryption,\n[3] Return to the Main Menu.");
            selection = input.nextInt();
            input.nextLine(); /* advance the scanner to the next line */
            newstr = "";

            switch (selection) {
                case 1:
                    System.out.println("Enter an integer shift value within the range of [-26] and [26] for encryption:");
                    shiftvalue = input.nextInt();
                    input.nextLine();
                    if (shiftvalue >= -26 && shiftvalue <= 26) {
                        System.out.print("Enter a string: ");
                        String str = input.nextLine();
                        for (int i = 0; i < str.length(); i++) {
                            char character = str.charAt(i);
                            int ascii = (int) character;
                            if (ascii >= 65 && ascii <= 90) {
                                ascii = ascii + shiftvalue;
                                if (ascii > 90) {
                                    ascii = ascii - 26;
                                }
                                newstr += (char) ascii;
                            } else if (ascii >= 97 && ascii <= 122) {
                                ascii = ascii + shiftvalue;
                                if (ascii > 122) {
                                    ascii = ascii - 26;
                                }
                                newstr += (char) ascii;
                            } else {
                                newstr += (char) ascii;
                            }
                        }
                        System.out.println("Encrypted message: " + newstr);
                    } else {
                        System.out.println("Outside the range.");
                    }
                    break;
                case 2:
                    System.out.println("Enter an integer shift value within the range of [-26] and [26] for decryption:");
                    shiftvalue = input.nextInt();
                    input.nextLine();
                    if (shiftvalue >= -26 && shiftvalue <= 26) {
                        System.out.print("Enter a string: ");
                        String str = input.nextLine();
                        for (int i = 0; i < str.length(); i++) {
                            char character = str.charAt(i);
                            int ascii = (int) character;
                            if (ascii >= 65 && ascii <= 90) {
                                ascii = ascii - shiftvalue;
                                if (ascii < 65) {
                                    ascii = ascii + 26;
                                }
                                newstr += (char) ascii;
                            } else if (ascii >= 97 && ascii <= 122) {
                                ascii = ascii - shiftvalue;
                                if (ascii < 97) {
                                    ascii = ascii + 26;
                                }
                                newstr += (char) ascii;
                            } else {
                                newstr += (char) ascii;
                            }
                        }
                        System.out.println("Decrypted message: " + newstr);
                    } else {
                        System.out.println("Outside the range.");
                    }
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        } while (selection != 3);
    }

    /* Fourth operation's sub menu: */
	/**
	* Displays the Tic Tac Toe game menu, allowing players to take turns, make moves, and check for a winner or a tie.
	* After the game ends, prompts the user if they want to play again.
	*/
	
    public static void ticTacToeMenu() {
    	clearScreen();
        initializeBoard();
        char currentPlayer = PLAYER_X;
        int turns = 0;
        boolean gameOver = false;

        while (!gameOver) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn.");

            int row = getInput("Enter row (0, 1, 2): ");
            int col = getInput("Enter col (0, 1, 2): ");

            if (!isValidMove(row, col)) {
                System.out.println("Invalid move. Try another box.");
                continue;
            }

            board[row][col] = currentPlayer;
            turns++;

            if (checkWinner(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            } else if (isFull()) {
                printBoard();
                System.out.println("Tie!");
                gameOver = true;
            } else {
                // Switch players
                currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
            }
        }
        
        
        System.out.println("Game over. Total turns: " + turns);
        
        // Ask if the user wants to play again
        System.out.print("Do you want to play again? (yes/no): ");
        String response = scanner.next().toLowerCase();

        if (response.equals("yes")) {
            ticTacToeMenu();  // Restart the game
        } else {
            System.out.println("Returning to the main menu...");
        }
    }

	/**
	* Initializes the Tic Tac Toe board with empty spaces.
	*/
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
	
	/**
	* Prints the current state of the Tic Tac Toe board.
	*/
	
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }
	
	/**
	* Checks if a move is valid by ensuring the chosen position is within bounds and unoccupied.
	*
	* @param row The row index of the board.
	* @param col The column index of the board.
	* @return true if the move is valid; false otherwise.
	*/
	
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
    }
	
	/**
	* Checks if the specified player has won by forming a line horizontally, vertically, or diagonally.
	*
	* @param player The current player symbol (PLAYER_X or PLAYER_O).
	* @return true if the player has won; false otherwise.
	*/
	
    public static boolean checkWinner(char player) {
        return (board[0][0] == player && board[0][1] == player && board[0][2] == player) ||
               (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
               (board[2][0] == player && board[2][1] == player && board[2][2] == player) ||
               (board[0][0] == player && board[1][0] == player && board[2][0] == player) ||
               (board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
               (board[0][2] == player && board[1][2] == player && board[2][2] == player) ||
               (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
	
	/**
	* Checks if the board is full (all positions occupied).
	*
	* @return true if the board is full; false otherwise.
	*/
	
    public static boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
	
	/**
	* Prompts the user for a row or column input and validates it.
	*
	* @param prompt The prompt message to display to the user.
	* @return The validated integer input for row or column.
	*/
	
    public static int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
	/**
	* Clears the console screen based on the operating system.
	* For Windows, it uses the command line to execute the 'cls' command.
	* For other operating systems, it uses ANSI escape codes to clear the screen.
	*/
	
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Failed to clear the screen.");
        }
    }


}
