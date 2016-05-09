import java.util.*;
public class ex8_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] table = new int[8][8];
		int[] rank = new int[8];
		for (int i = 0; i < 8; i++) 
			for (int j = 0; j < 7; j++) {
				table[i][j] = input.nextInt();
				table[i][7] += table[i][j];
			}

		for (int i = 0; i < 8; i++) {
			int temp = 0;
			for (int j = 0; j < 8; j++) 
				if (table[i][7] < table[j][7]) temp++;
			rank[temp] = i;
		}

		for (int i = 0; i < 8; i++) {
			System.out.print("Employer " + rank[i] + '\t');
			for (int j = 0; j < 7; j++)
				System.out.printf("%4d", table[rank[i]][j]);
			System.out.println("\tTotal hour: " + table[rank[i]][7]);
		}
	}
}
