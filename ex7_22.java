import java.util.*;
public class ex7_22 {
	public static void main(String args[]) {
		int[] pos = new int[] {-1,-1,-1,-1,-1,-1,-1,-1};
		pos[0] = (int) (Math.random() * 8);
		int x = 1;
		while (x >= 1 && x < 8) {
			if (!search(x, pos)) {
			x--;
			}
			else x++;
		}
		if (x < 1) System.out.println("Not found.");
		else {
			for (int i = 0; i < 8; i++)
			System.out.println("(" + i + ", " + pos[i] + ")");
			printBoard(pos);
		}
	}

	public static boolean search(int x, int[] pos) {
		for (int y = 0; y < 8; y++) {
			boolean rightPos = true;
			for (int i = 0; i < x; i++)
				if (pos[i] == y || pos[i] + i == x + y || pos[i] - i == y - x) {
					rightPos = false;
					break;
				}

			if (rightPos && y > pos[x]) {
				pos[x] = y;
				return true;
			}
		}
		pos[x] = -1;
		return false;
	}

	public static void printBoard(int[] pos) {
		for (int x = 0; x < 8; x++) {
			for (int i = 0; i < pos[x]; i++) System.out.print("| ");
			System.out.print("|Q");
			for (int i = 0; i < 8 - pos[x]; i++) System.out.print("| ");
			System.out.println();
		}
	}
}
