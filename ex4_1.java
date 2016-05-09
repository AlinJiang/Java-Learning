import java.util.*;
public class ex4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Length from the center to a vertex:");
		double r = input.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
		System.out.printf("Area of the pentagon: %2.2f\n", area);
	}
}
