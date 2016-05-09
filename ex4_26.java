import java.util.*;
public class ex4_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int index = s.indexOf('.');
		System.out.println(s.substring(0, index) + s.substring(index + 1));
	}
}

