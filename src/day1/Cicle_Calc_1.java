package day_1;

import java.util.Scanner;

public class Cicle_Calc_1 {

	public static void areaCircle(double radius) {
		double AC = 3.14 * (radius * radius);
		System.out.println("Area of Circle is " + AC);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Radius:-");
		double radius = scanner.nextDouble();
		scanner.close();
		areaCircle(radius);
	}
}
