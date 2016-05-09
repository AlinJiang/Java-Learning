import java.util.*;
public class ex8_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int column = input.nextInt();
		int[][] matrix = new int[row][column];
		System.out.print("Enter the element of matrix: ");
		for (int i = 0; i < row; i++) 
			for (int j = 0; j < column; j++)
				matrix[i][j] = input.nextInt();
		System.out.println(isConsecutiveFour(matrix));
	}

	public static boolean isConsecutiveFour(int[][] values) {
		if (values[0].length >= 4) {
			for (int i = 0; i < values.length; i++) {
				int temp = values[i][0];
				int count = 0;
				for (int j = 0; j < values[0].length; j++) {
					if (values[i][j] == temp) {
						count++;
						if (count >= 4) return true;
					}
					else {
						count = 0;
						temp = values[i][j];
					}
				}
			}
		}

		if (values.length >= 4) {
			for (int i = 0; i < values[0].length; i++) {
				int temp = values[0][i];
				int count = 0;
				for (int j = 0; j < values.length; j++) {
					if (values[j][i] == temp) {
						count++;
						if (count >= 4) return true;
					}
					else {
						count = 0;
						temp = values[j][i];
					}
				}
			}
		}

		if (values[0].length >= 4 && values.length >=4) {
			for (int i = 0; i < values.length - 3; i++) 
				for (int j = 0; j < values[0].length - 3; j++) 
					if (values[i][j] == values[i + 1][j + 1] && values[i][j] == values[i + 2][j + 2] && values[i][j] == values[i + 3][j + 3])
						return true;

			for (int i = 3; i < values.length; i++)
				for (int j = 0; j < values[0].length - 3; j++) 
					if (values[i][j] == values[i - 1][j + 1] && values[i][j] == values[i - 2][j + 2] && values[i][j] == values[i - 3][j + 3])
						return true;
		}
		return false;
	}
}
