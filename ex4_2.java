import java.util.*;
public class ex4_2 {
	public static void main(String[] args) {
		final double RADIUS = 6371.01;
		Scanner input = new Scanner(System.in);
		System.out.print("Point1 in degrees: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		System.out.print("Point2 in degrees: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("Distance = " + distance + "km");
	}
}

