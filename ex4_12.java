import java.util.*;
public class ex4_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input hex:");
		char c = Character.toUpperCase(input.next().charAt(0));
		int value = 0;
		if (c >= 'A' && c <= 'F') value = c - 'A' + 10;
		else if (c >= '0' && c <= '9') value = c - '0';
		else {
			System.out.println("Invalid input! Quitting...");
			System.exit(1);
		}
		System.out.println(Integer.toBinaryString(value));
	}
}


