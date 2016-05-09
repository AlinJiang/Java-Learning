import java.util.*;
public class ex5_2 {
	public static void main(String[] args) {
		final int NUMBER = 10;
		Scanner input = new Scanner(System.in);
		int count = 0;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < NUMBER; i++) {
			int num1 = (int)(Math.random() * 15 + 1);
			int num2 = (int)(Math.random() * 15 + 1);
			System.out.print(num1 + " + " + num2 + " = ");
			int ans = input.nextInt();
			if (num1 + num2 == ans) {
				count++;
				System.out.println("Correct!");
			}
			else System.out.println("Not correct!\n" + num1 + " + " + num2 + " should be " + (num1 + num2));
		}
		long time = System.currentTimeMillis() - startTime;
		System.out.println("You answered " + count + " questions correctly!\n" + "And you totally used " + time / 1000 + " seconds.");
	}
}
