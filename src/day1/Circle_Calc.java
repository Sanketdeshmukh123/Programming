package day_1;

import java.util.Scanner;

public class Circle_Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Radius:-");
		double Radius = scanner.nextDouble();

		scanner.close();
		double AC = 3.14 * (Radius * Radius);
		System.out.println("Area of Circle is " + AC);
	}
}
