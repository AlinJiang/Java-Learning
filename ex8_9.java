import java.util.*;
public class ex8_9 {
	public static void main(String[] args) {
		int[][] board = new int[3][3];
		int player = 0;
		do {
			printBoard(board);
			getChoice(board, player);
			player = (player + 1) % 2;
		} while(!checkWin(board));
		printBoard(board);
		System.out.println(((player == 1) ? "X" : "O") + " player won");
	}

	public static void printBoard(int[][] board) {
		System.out.println("—————————————");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) 
				if (board[i][j] == 0) System.out.print("|   ");
				else if (board[i][j] == 1) System.out.print("| X ");
				else System.out.print("| O ");
			System.out.println("|\n—————————————");
		}
	}

	public static void getChoice(int[][] board, int player) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a row (0, 1 or 2) for player " + ((player == 0) ? "X" : "O") + ": ");
		int row = input.nextInt();
		System.out.print("Enter a column (0, 1 or 2) for player " + ((player == 0) ? "X" : "O") + ": ");
		int col = input.nextInt();
		if (board[row][col] == 0) 
			board[row][col] = (player == 0) ? 1 : 2;
		else {
			System.out.println("Wrong place to put");
			getChoice(board, player);
		}
	}

	public static boolean checkWin(int[][] board) {
		for (int i = 0; i < 3; i++) 
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && (board[i][0] == 1 || board[i][0] == 2))
				return true;
		for (int j = 0; j < 3; j++) 
			if (board[0][j] == board[1][j] && board[0][j] == board[2][j] && (board[0][j] == 1 || board[0][j] == 2))
				return true;
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && (board[0][0] == 1 || board[0][0] == 2))
			return true;
		return false;
	}
}
