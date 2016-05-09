import java.util.*;
public class ex8_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of banks: ");
		int n = input.nextInt();
		System.out.print("Enter the limit of bank legacy: ");
		double limit = input.nextDouble();
		double[][] bank = new double[n][];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the capital of bank " + i + " :  ");
			double capital = input.nextDouble();
			System.out.print("Enter the number of borrowers: ");
			int number = input.nextInt();
			bank[i] = new double[2 + number * 2];
			bank[i][0] = capital;
			bank[i][1] = number;
			System.out.print("Enter the borrowers: ");
			for (int j = 0; j < number; j++) {
				bank[i][j * 2 + 2] = input.nextInt();
				bank[i][j * 2 + 3] = input.nextDouble();
			}
		}

		checkBank(bank);
		printUnsafeBank(bank);
	}

	public static void checkBank(double[][] bank) {
		for (int i = 0; i < bank.length; i++) {
			double legacy = bank[i][0];
			for (int j = 0; j < bank[i][1]; j++) 
				legacy += bank[i][j * 2 + 3];
			if (legacy < 201 && bank[i][0] != -1) {
				bank[i][0] = -1;
				setBankrupt(bank, i);
				checkBank(bank);
				break;
			}
		}
	}

	public static void setBankrupt(double[][] bank, int index) {
		for (int i = 0; i < bank.length; i++) 
			for (int j = 0; j < bank[i][1]; j++) 
				if (bank[i][j * 2 + 2] == index) bank[i][j * 2 + 3] = 0;
	}

	public static void printUnsafeBank(double[][] bank) {
		System.out.print("Unsafe banks: ");
		for (int i = 0; i < bank.length; i++)
			if (bank[i][0] == -1) System.out.print(" " + i);
		System.out.println();
	}

}
