import java.util.*;
public class ex8_6 {
	public static void main(String[] args) {
		double[][] matrix1 = new double[3][3], matrix2 = new double[3][3], result = new double[3][3];
		System.out.print("Enter matrix1: ");
		enterMatrix(matrix1);
		System.out.print("Enter matrix2: ");
		enterMatrix(matrix2);
		result = multiplyMatrix(matrix1, matrix2);
		printMatrix(matrix1, matrix2, result);
	}

	public static void enterMatrix(double[][] matrix) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = input.nextDouble();
	}

	public static double[][] multiplyMatrix(double[][] mat1, double[][] mat2) {
		double[][] result = new double[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				result[i][j] = mat1[i][0] * mat2[0][j] + mat1[i][1] * mat2[1][j] + mat1[i][2] * mat2[2][j];
		return result;
	}

	public static void printMatrix(double[][] mat1, double[][] mat2, double[][] result) {
		System.out.println("The multiplication of the matrices is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) 
				System.out.printf("%f\t", mat1[i][j]);
			System.out.print((i == 1) ? "\t*\t" : "\t\t");
			for (int j = 0; j < 3; j++) 
				System.out.printf("%f\t", mat2[i][j]);
			System.out.print((i == 1) ? "\t=\t" : "\t\t");
			for (int j = 0; j < 3; j++) 
				System.out.printf("%f\t", result[i][j]);
			System.out.println();
		}
	}
}
