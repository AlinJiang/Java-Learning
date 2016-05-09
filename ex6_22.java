import java.util.*;
public class ex6_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long number = input.nextLong();
		System.out.println("The sqrt(" + number + ") = " + sqrt(number));
	}
	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		final double ERR = 0.0001;
		double err = nextGuess - lastGuess;
		while (err > ERR || err < -ERR) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
			err = nextGuess - lastGuess;
		}
		return nextGuess;
	}
}




