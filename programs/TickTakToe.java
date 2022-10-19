import java.util.Scanner;

public class TickTakToe {
    //  Tik Tak Toe Game in the console
    public static void main(String[] args) {
        // Create a tic-tac-toe board
        char[][] board = new char[3][3];
        // Initialize the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // The game is not over yet
        boolean gameOver = false;
        // The game is a draw
        boolean draw = false;
        // The current player
        char player = 'X';
        // The current row and column
        int row = 0;
        int column = 0;
        // The number of turns
        int turns = 0;
        // Display the board
        displayBoard(board);
        // Keep playing until the game is over
        while (!gameOver) {
            // Prompt the player to enter a row and column
            System.out.print("Enter a row (0, 1, or 2) for player " + player + ": ");
            row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + player + ": ");
            column = input.nextInt();
            // Place a token in the board
            board[row][column] = player;
            // Display the board
            displayBoard(board);
            // Check if the game is over
            gameOver = isWon(board, player);
            // Check if the game is a draw
            draw = isDraw(turns);
            // Change the player
            player = (player == 'X') ? 'O' : 'X';
            // Increment the number of turns
            turns++;
            // Check if the game is over
            if (gameOver || draw) {
                // Display the result
                if (gameOver) {
                    System.out.println("Player " + player + " won!");
                } else {
                    System.out.println("The game is a draw!");
                }
                // Exit the loop
                break;
            }
        }

    }

    private static boolean isDraw(int turns) {
        // TODO Auto-generated method stub
        return turns == 9;
    }

    private static boolean isWon(char[][] board, char player) {
        // Check if the player has won
        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static void displayBoard(char[][] board) {
        // Display the board
        for (int i = 0; i < board.length; i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }


}
