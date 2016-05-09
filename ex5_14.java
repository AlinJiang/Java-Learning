import java.util.*;
public class ex5_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int gcd = 1;
		for (int i = (num1 > num2) ? num2 : num1; i > 0; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println("The greatest common divisor is " + gcd);
	}
}
