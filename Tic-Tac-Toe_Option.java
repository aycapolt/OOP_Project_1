import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static char[][] board = new char[3][3];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        
        while (true) {
            initializeBoard();
            char currentPlayer = PLAYER_X;
            int turns = 0;
            boolean gameOver = false;

            while (!gameOver) {
                printBoard();
                System.out.println("Player " + currentPlayer + "'s turn.");

                // Get row and column input for the move
                int row = getInput("Enter row (0, 1, 2): ");
                int col = getInput("Enter col (0, 1, 2): ");

                // Validate move
                if (!isValidMove(row, col)) {
                    System.out.println("Invalid move. Try another box.");
                    continue;
                }

                // Make the move
                board[row][col] = currentPlayer;
                turns++;

                // Check for a result
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

            // End of game
            System.out.println("Game over. Total turns: " + turns);

            // Prompt for a new game
            System.out.print("Do you want to play again? (yes/no): ");
            if (!scanner.next().equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
    }

    private static boolean checkWinner(char player) {
        // Check rows, cols and diagonals
        return (board[0][0] == player && board[0][1] == player && board[0][2] == player) || // row1
               (board[1][0] == player && board[1][1] == player && board[1][2] == player) || // row2
               (board[2][0] == player && board[2][1] == player && board[2][2] == player) || // row3
               (board[0][0] == player && board[1][0] == player && board[2][0] == player) || // col1
               (board[0][1] == player && board[1][1] == player && board[2][1] == player) || // col2
               (board[0][2] == player && board[1][2] == player && board[2][2] == player) || // col3
               (board[0][0] == player && board[1][1] == player && board[2][2] == player) || // diagonal1
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);   // diagonal2
    }
    

    private static boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int getInput(String message) {
        int input;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0 && input <= 2) {
                    break;
                }
            } else {
                scanner.next(); // Clear invalid input
            }
            System.out.println("Invalid input. Please enter a number between 0 and 2.");
        }
        return input;
    }
}
