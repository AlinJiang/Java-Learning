import java.util.*;
public class ex6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int number = input.nextInt();
		System.out.print("This number (" + number + ") is ");
		System.out.println(isPalindrome(number)? "a palindrome." : "not a palindrome.");
	}
	public static boolean isPalindrome(int number) {
		return reverse(number) == number ? true : false;
	}
	public static int reverse(int number) {
		String reverseNumberString = "";
		while(number != 0) {
			reverseNumberString += number % 10;
			number /= 10;
		}
		return Integer.parseInt(reverseNumberString);
	}
}
