/**
 * TicTacToe
 * UC4 converts a user-entered slot number (1-9) into corresponding
 * row and column indices of a 2D array
 */
public class TicTacToe {

    /**
     * Entry point of the program. Demonstrates slot-to-index conversion
     * using a sample slot value.
     */
    public static void main(String[] args) {
            int slot = 7;
            System.out.println("Row: " + getRowFromSlot(slot));
            System.out.println("Column: " + getColFromSlot(slot));
        }
    
        /**
         * Converts a slot number into row index using zero-based indexing
         * Input: slot number (1-9)
         * Output: row index (0-2)
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }
    
        /**
         * Converts a slot number into column index using zero-based indexing
         * Input: slot number (1-9)
         * Output: column index (0-2)
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
}
}
import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1-9)entered by the user. This use case
 * foucses only on input handling without validation.
 */
public class TicTacToe {

    /**
     * Entry point of the program. Reads slot input and prints it back
     * to verify correct user input handling.
     */

    public static void main(String[] args) {
        
                int slot = getUserSlot();
                System.out.println("Slot entered: "+slot);
        
        
            }
        
            /**
             * Reads an integer slot value from the user
             * Input: Scanner Object
             * Output: Slot number (1-9)
             * Hint: Validation will be added in later use cases.
     */
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }
}
import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program. Executes the toss logic and
     *  displays the result of turn and symbol assignment.
     */

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    /**
     * Uses a random logic to decide the first player and assigns symbols
     * based on the toss outcome. This method initializes the game state.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        isHumanTurn = random.nextBoolean(); // Randomly decide who goes first

        if (isHumanTurn) {
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }
    /**
     * Displays the toss result, indicating who plays first and 
     * which symbol is assigned to each player.
     */
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Toss Result: Human goes first with symbol " + humanSymbol);
        } else {
            System.out.println("Toss Result: Computer goes first with symbol " + computerSymbol);
        }
}
/*
TicTacToe
UC1: Initializes and displays an empty tic-Tac-Toe board in a proper
grid format. This use case introduces 2D arrays, nested loops,
and formatted console output.
 */
public class TicTacToe {
    static char[][] board = new char[3][3];
    
        /**
         * Entry point of the program. It initializes the board and prrints the 
         * empty grid on the console
     */
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    /**
     * Initializes the 3x3 board by filling each cell with '-' to indicate
     * an empty position. Students should focus on correct nested loop usage.
     */
    static void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }
