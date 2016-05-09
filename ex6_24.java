import java.util.*;
public class ex6_24 {
	public static void main(String[] args) {
		printCurrentTime();
		printCurrentDate();
	}
	
	public static void printCurrentTime() {
		long totalSecond = System.currentTimeMillis() / 1000 + 3600 * 8;
		long totalMinute = totalSecond / 60;
		long totalHour = totalMinute / 60;
		int sec = (int)totalSecond % 60;
		int min = (int)totalMinute % 60;
		int hour = (int)totalHour % 24;
		System.out.printf("Current time is %d:%d:%d\n", hour, min, sec);
	}
	
	public static void printCurrentDate() {
		long totalDay = System.currentTimeMillis() / (1000 * 3600 * 24);
		System.out.print("Current date is " );
		int i = 1970;
		while (totalDay >= 0) {
			totalDay -= getYearlyDays(i);
			i++;
		}
		int year = i - 1;
		System.out.print (year + "/");
		totalDay += getYearlyDays(year);
		i = 1;
		while (totalDay >= 0) {
			totalDay -= getMonthlyDays(i, year);
			i++;
		}
		totalDay += getMonthlyDays(i - 1, year);
		System.out.println(i - 1 + "/" + (totalDay + 1));
	}
	
	public static int getYearlyDays(int year) {
		return isLeap(year) ? 366 : 365;
	}

	public static int getMonthlyDays(int i, int year) {
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) return 31;
		else if (i == 4 || i == 6 || i == 9 || i == 11) return 30;
		else if (isLeap(year)) return 29;
		else return 28;
	}

	public static boolean isLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
		else return false;
	}
}	
