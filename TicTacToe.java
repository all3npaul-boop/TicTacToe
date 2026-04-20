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
