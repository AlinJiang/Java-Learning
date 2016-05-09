import java.util.*;
public class ex5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.print("Number of Years: ");
		int year = input.nextInt();
		System.out.print("Annual Interest Rate in % (like 7 or 8): ");
		double annualRate = input.nextDouble();
		
		double monthlyRate = annualRate / 1200;
		double totalPayment = loan * (1 + 0.01 * annualRate * year);
		double monthlyPayment = totalPayment / year / 12;
		
		System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("Total Payment: " + (int)(totalPayment * 100) / 100.0);
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for (int i = 1; i <= year * 12; i++) {
			double interest = loan * monthlyRate;
			loan -= monthlyPayment;
			double principal = monthlyPayment - interest;
			System.out.println(i + "\t\t" + (int)(interest * 100) / 100.0 + "\t\t" + (int)(principal * 100) / 100.0 + "\t\t" + (int)(loan * 100) / 100.0);
		}
	}
}

