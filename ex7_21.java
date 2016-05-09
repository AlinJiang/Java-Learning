import java.util.*;
public class ex7_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		int[] slot = new int[numberOfSlots];
		emulate(numberOfBalls, numberOfSlots, slot);
		for (int i = maxCount(slot); i > 0; i--) {
			for (int j = 0; j < numberOfSlots; j++) {
				if (slot[j] >= i) System.out.print("o" + "\t");
				else System.out.print("\t");
			}
			System.out.println();
		}
		for (int i = 1; i <= numberOfSlots; i++) System.out.print("________");
		System.out.println();
		for (int i = 1; i <= numberOfSlots; i++) System.out.print(i + "\t");
		System.out.println();
	}

	public static void emulate(int numberOfBalls, int numberOfSlots, int[] slot) {
		for (int i = 0, count = 0; i < numberOfBalls; i++) {
			for (int j = 0; j < numberOfSlots - 1; j++) count += (int)(Math.random() * 2);
			slot[count]++;
			count = 0;
		}
	}

	public static int maxCount(int[] slot) {
		int max = 0;
		for (int element : slot)
			if (element > max) max = element;
		return max;
	}
}
