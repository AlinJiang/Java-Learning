import java.util.*;
public class ex7_18 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length - 1; i++)
			for (int j = i; j < args.length; j++) {
				double num1 = Double.parseDouble(args[i]);
				double num2 = Double.parseDouble(args[j]);
				if (num1 > num2) {
					String temp = args[j];
					args[j] = args[i];
					args[i] = temp;
				}
			}
		System.out.println(Arrays.toString(args));
	}
}
