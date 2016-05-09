import java.util.*;
public class ex5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int line = input.nextInt();
		for (int i = 1; i <= line; i++) {
			for (int j = 0; j < 4 * (line - i); j++) System.out.print(" ");
			for (int j = i; j > 0; j--) System.out.printf("%4d",j);
			for (int j = 2; j <= i; j++) System.out.printf("%4d",j);
			System.out.println();
		}
	}
}

