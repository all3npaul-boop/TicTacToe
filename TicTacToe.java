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
