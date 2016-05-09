import java.util.*;
public class ex6_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String psw = input.nextLine();
		System.out.print("Your password is ");
		System.out.println(isValidPassword(psw.toUpperCase()) ? "valid" : "invalid");
	}
	public static boolean isValidPassword(String psw) {
		int count = 0;
		if (psw.length() < 8) return false;
		else {
			for (int i = 0; i < psw.length(); i++) {
				char c = psw.charAt(i);
				if (c >= '0' && c <= '9') count++;
				else if (c < 'A' || c > 'Z') return false;
			}
		}
		if (count >= 2) return true;
		else return false;
	}
}	
