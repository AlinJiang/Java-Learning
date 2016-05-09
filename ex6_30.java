public class ex6_30 {
	public static void main(String[] args) {
		int sum = roll();
		if (sum == 2 || sum == 3 || sum == 12) System.out.println("Lose it");
		else if (sum == 7 || sum == 11) System.out.println("Win it");
		else {
			int point =  0;
			while(sum != point && sum != 7) {
				point = sum;				
				System.out.println("point is " + point);
				sum = roll();
			}
			if (sum == 7) System.out.println("Lose it");
			if (sum == point) System.out.println("Win it");
		}
	}

	public static int roll() {
		int num1 = (int)(Math.random() * 6 + 1);
		int num2 = (int)(Math.random() * 6 + 1);
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		return sum;
	}
}
