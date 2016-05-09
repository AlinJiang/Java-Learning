import java.util.*;
public class Test {
	private double radius = 1;

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public static void main(String[] args) {
		Test myTest = new Test();
		System.out.println("Radius = " + myTest.radius);
	}
}
