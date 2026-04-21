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
