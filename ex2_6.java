import java.util.*;
public class ex2_6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please writa your number between 0 and 1000:");
		int number = input.nextInt();
		int singleDigit = number % 10;
		number /= 10;
		int tensDigit = number % 10;
		number /= 10;
		int hundredsDigit = number % 10;
		int summary = singleDigit + tensDigit + hundredsDigit;
		System.out.println("The sum of the digits is " + summary);
	}
}

