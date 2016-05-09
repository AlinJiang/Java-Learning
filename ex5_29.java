import java.util.*;
public class ex5_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you want: ");
		int year = input.nextInt();
		System.out.print("What day is the first day(e.g. 1 for Sun, 7 for Sat): ");
		int firstDayOfMonth = input.nextInt() % 7;
		int numberOfDays = 0;
		for (int i = 1; i <= 12; i++) {
			String s = "";
			
			switch (i) {
				case 1: s = "January";
						numberOfDays = 31;
						break;
				case 2: s = "Febuary";
						numberOfDays = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
						break;
				case 3: s = "March";
						numberOfDays = 31;
						break;
				case 4: s = "April";
						numberOfDays = 30;
						break;
				case 5: s = "May";
						numberOfDays = 31;
						break;
				case 6: s = "June";
						numberOfDays = 30;
						break;
				case 7: s = "July";
						numberOfDays = 31;
						break;
				case 8: s = "August";
						numberOfDays = 31;
						break;
				case 9: s = "September";
						numberOfDays = 30;
						break;
				case 10: s = "October";
						 numberOfDays = 31;
						 break;
				case 11: s = "November";
						 numberOfDays = 30;
						 break;
				case 12: s = "December";
						 numberOfDays = 31;
						 break;
			}

			System.out.println("                 " + s + " " + year);
			System.out.println("————————————————————————————————————————————————————\nSun\tMon\tTue\tWed\tThu\tFri\tSat");
			for (int k = 1; k < firstDayOfMonth; k++) 
					System.out.print("\t");
			if (firstDayOfMonth == 0) System.out.print("\t\t\t\t\t\t");
			for (int j = 0; j < numberOfDays; j++) {
				System.out.print((j + 1) + "\t");
				if ((firstDayOfMonth + j) % 7 == 0) System.out.print("\n");
			}
			System.out.println();
			firstDayOfMonth = (firstDayOfMonth + numberOfDays) % 7;
		}
	}
}

