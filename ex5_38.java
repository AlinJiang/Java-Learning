import java.util.*;
public class ex5_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int num = input.nextInt();
		String octNumber = "";
		while (num != 0) {
			octNumber = num % 8 + octNumber;
			num /= 8;
		}
		System.out.println("Octal Number: " + octNumber);
	}
}
