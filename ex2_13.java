import java.util.*;
public class ex2_13{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double monthly = input.nextDouble();
		double value = monthly;
		for (int i = 0; i < 6; i++){
			value *= 1.00417;
			value = (int)(value * 1000)/1000.0;
			System.out.println("After " + (i+1) + " month(s), the account value is " + value);
			value += monthly;
		}
	}
}

