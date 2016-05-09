import java.util.*;
public class ex5_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of students: ");
		int numberOfStudents = input.nextInt();
		String studentName = "";
		double studentGrade = 0;
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Input the name of student" + (i + 1) + " and grade: ");
			String nextStudentName = input.next();
			double nextStudentGrade = input.nextDouble();
			if (nextStudentGrade > studentGrade) {
				studentName = nextStudentName;
				studentGrade = nextStudentGrade;
			}
		}
		System.out.println("The highest grade student is " + studentName + ", his grade is " + studentGrade + '\n');
	}
}

