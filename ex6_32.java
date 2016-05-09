import java.util.*;
public class ex6_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many times do you want to emulate: ");
		long times = input.nextLong();
		long  count = 0;
		for (int j = 0; j < times; j++) if (play())  count++;
		System.out.println("Out of " + times + " games, winned " + count + " times.\nThe probability is " + (count + 0.0) / times);
		}
		
	public static boolean play() {
		int sum = roll();
		if (sum == 2 || sum == 3 || sum == 12) {
	//		System.out.println("Lose it\n");
			return false;
		}
		else if (sum == 7 || sum == 11) {
	//		System.out.println("Win it\n");
			return true;
		}
		else {
			int point =  0;
			while(sum != point && sum != 7) {
				point = sum;				
	//			System.out.println("point is " + point);
				sum = roll();
			}
			if (sum == 7) {
	//			System.out.println("Lose it\n");
				return false;
			}
			else{
	//			System.out.println("Win it\n");
				return true;
			}
		}
	}
	
	public static int roll() {
		int num1 = (int)(Math.random() * 6 + 1);
		int num2 = (int)(Math.random() * 6 + 1);
		int sum = num1 + num2;
	//	System.out.println(num1 + " + " + num2 + " = " + sum);
		return sum;
	}
}
