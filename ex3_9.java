import java.util.*;
public class ex3_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your first-nine-digit ISBN:");
		int ISBN = input.nextInt();
		int ISBNCal = ISBN;
		int d9 = ISBN % 10;ISBN /= 10;
		int d8 = ISBN % 10;ISBN /= 10;
		int d7 = ISBN % 10;ISBN /= 10;
		int d6 = ISBN % 10;ISBN /= 10;
		int d5 = ISBN % 10;ISBN /= 10;
		int d4 = ISBN % 10;ISBN /= 10;
		int d3 = ISBN % 10;ISBN /= 10;
		int d2 = ISBN % 10;ISBN /= 10;
		int d1 = ISBN;  
		int d10 = (d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;
		System.out.print(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9);
		if (d10 == 10) System.out.println("X");
		else System.out.println(d10);
	}
}
			

