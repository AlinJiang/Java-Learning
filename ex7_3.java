import java.util.*;
public class ex7_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入1到100之间的整数, 以0作为结尾：");
		int[] numbers = new int[50];
		int[] count = new int[50];
		numbers[0] = input.nextInt();
		int countOfNumbers = 0;
		int countOfDifferentNumbers = 0;
		while(numbers[countOfNumbers] != 0) {
			countOfNumbers++;
			numbers[countOfNumbers] = input.nextInt();
		}
		Arrays.sort(numbers);
		for (int i = 0, j = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != 0) {
				if (numbers[i] == numbers[i + 1]) {
					count[j] = numbers[i];
					count[j + 1]++;
				}
				else {
					j += 2;
					count[j] = numbers[i + 1];
					count[j + 1]++;
				}
				countOfDifferentNumbers = j + 2;
			}
		}
		count[1]++;
		for (int i = 0; i < countOfDifferentNumbers; i += 2) {
			System.out.print(count[i] + " occurs " + (count[i + 1]));
			System.out.println((count[i] > 0) ? "times" : "time");
		}
	}
}
