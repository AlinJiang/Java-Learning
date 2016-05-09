import java.util.*;
public class ex5_23 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			double pi = 0;
			for (int j = i * 10000; j >= 1; j--) pi += Math.pow(-1, j+1) / (2 * j - 1);
			System.out.println("PI calculated by " + i * 10000 + "terms equals about " + pi * 4);
		}
	}
}

