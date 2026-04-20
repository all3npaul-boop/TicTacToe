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
