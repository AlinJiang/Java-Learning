import java.util.*;
public class ex7_23 {
	public static void main(String[] args) {
		boolean[] lock = new boolean [100];
		for (int i = 0; i < 100; i++)
			operateLocks(i, lock);
		System.out.print("Lock: ");
		for (int i = 0; i < 100; i++) 
			if (lock[i]) System.out.print((i + 1) + ", ");
		System.out.println("are open");

	}
	public static void operateLocks(int si, boolean[] lock) {
		for (int i = si; i < 100; i += si + 1)
			lock[i] = (lock[i]) ? false : true;
	}
}
