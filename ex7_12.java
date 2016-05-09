import java.util.*;
public class ex7_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < 10; i++) numbers[i] = input.nextDouble();
		reverse(numbers);
		for (double element : numbers) System.out.print(element + " ");
		System.out.println();
	}
	public static void reverse(double[] numbers) {
		for (int i = 0; i < numbers.length - i - 1; i++) {
			int j = numbers.length - i - 1;
			double temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}
}
