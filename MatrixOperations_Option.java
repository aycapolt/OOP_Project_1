import java.util.Scanner;

/**
 * This class provides operations for matrix manipulation such as transpose, inverse,
 * multiplication, and element-wise multiplication. The user can interact through a menu to
 * perform these operations on matrices.
 */

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            clearScreen(); // Clears the screen.
            // Displays the menu options to the user.
            System.out.println("       MATRIX OPERATIONS MENU       ");
            System.out.println("\n1. Transpose");
            System.out.println("2. Inverse");
            System.out.println("3. Matrix Multiplication");
            System.out.println("4. Element-wise Multiplication");
            System.out.println("5. Return to Main Menu");
            System.out.print("\nChoose an option (1-5): ");

            int choice = getValidInteger(scanner); // Gets a valid option from the user.

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
        }
    }
	
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

    public static int getValidInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

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

    public static double[][] inverse(double[][] matrix) {
        int n = matrix.length;
        double[][] augmented = new double[n][2 * n];

        // Create the augmented matrix (original matrix | identity matrix).
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmented[i][j] = matrix[i][j];
            }
            augmented[i][i + n] = 1;
        }

        // Perform row operations to find the inverse.
        for (int i = 0; i < n; i++) {
            double diagElement = augmented[i][i];
            if (diagElement == 0) {
                return null; // If the diagonal element is zero, the matrix is singular.
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

        // Extract the right half of the augmented matrix as the inverse.
        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = augmented[i][j + n];
            }
        }
        return inverse;
    }

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

    public static void printMatrix(double[][] matrix) {
        System.out.println("\nMatrix:");
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f\n", value); // Prints each value in a formatted manner.
            }
            System.out.println();
        }
    }
}
