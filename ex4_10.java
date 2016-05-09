import java.util.*;
public class ex4_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String set1 = " 1  3  5  7\n" + 
					  " 9 11 13 15\n" +
					  "17 19 21 23\n" +
					  "25 27 29 31\n";
		String set2 = " 2  3  6  7\n" +
					  "10 11 14 15\n" +
					  "18 19 22 23\n" +
					  "26 27 30 31\n";
		String set3 = " 4  5  6  7\n" +
					  "12 13 14 15\n" +
					  "20 21 22 23\n" +
					  "28 29 30 31\n";
		String set4 = " 8  9 10 11\n" +
					  "12 13 14 15\n" +
					  "24 25 26 27\n" +
					  "28 29 30 31\n";
		String set5 = "16 17 18 19\n" +
					  "20 21 22 23\n" +
					  "24 25 26 27\n" +
					  "28 29 30 31\n";
		int birth = 0;
		System.out.print("Is your birthday in this set?\n" + set1 + "Enter y/n:");
		char ans = input.next().charAt(0);
		if (ans == 'y') birth += 1;
		else if (ans != 'n') {
			System.out.println("Invalid input!");
			System.exit(1);
		}
		
		System.out.print("Is your birthday in this set?\n" + set2 + "Enter y/n:");
		ans = input.next().charAt(0);
		if (ans == 'y') birth += 2;
		else if (ans != 'n') {
			System.out.println("Invalid input!");
			System.exit(1);
		}
		System.out.print("Is your birthday in this set?\n" + set3 + "Enter y/n:");
		ans = input.next().charAt(0);
		if (ans == 'y') birth += 4;
		else if (ans != 'n') {
			System.out.println("Invalid input!");
			System.exit(1);
		}
		System.out.print("Is your birthday in this set?\n" + set4 + "Enter y/n:");
		ans = input.next().charAt(0);
		if (ans == 'y') birth += 8;
		else if (ans != 'n') {
			System.out.println("Invalid input!");
			System.exit(1);
		}
		System.out.print("Is your birthday in this set?\n" + set5 + "Enter y/n:");
		ans = input.next().charAt(0);
		if (ans == 'y') birth += 16;
		else if (ans != 'n') {
			System.out.println("Invalid input!");
			System.exit(1);
		}
		
		else if (ans != 'n') {
			System.out.println("Invalid input!");
			System.exit(1);
		}
		System.out.println("Your birthday is on " + birth + '!');
	}
}
	

