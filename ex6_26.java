public class ex6_26 {
	public static void main(String[] args) {
		int i = 2, count = 0;
		while (count != 100) {
			if (isPalindrome(i) && isPrime(i)) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0) System.out.println();
			}
			i++;
		}
	}

	public static boolean isPalindrome(int n) {
		String s = "";
		int num = n;
		while (n != 0) {
			s += n % 10;
			n /= 10;
		}
		if (num == Integer.parseInt(s)) return true;
		else return false;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) 
			if (n % i == 0) return false;
		return true;
	}
}
