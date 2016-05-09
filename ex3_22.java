import java.util.*;
public class ex3_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double d = Math.pow(x * x + y * y, 0.5);
		System.out.print("Point (" + x + " , " + y + ") is ");
		System.out.println((d < 10) ? "Inside" : "Not inside");
	}
}
