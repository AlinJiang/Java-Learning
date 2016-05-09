public class ex5_26 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			double e = 1;
			double term = 1;
			for (int j = 1; j <= i * 10000; j++) {
				term /= j;
				e += term;
			}
			System.out.println("e calculated by " + i * 10000 + "terms equals " + e);
		}
	}
}
