import java.util.*;
public class ex2_21{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment am: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double percent = input.nextDouble();
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		double accumulatedValue = amount * Math.pow(1 + percent / 100 , years);
		System.out.println("Accumulate value is " + accumulatedValue);
	}
}
