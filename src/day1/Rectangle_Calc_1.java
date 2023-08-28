package day_1;

import java.util.Scanner;

public class Rectangle_Calc_1 {

	public static void areaRectangle(double len, double bre) {
		double AOR = len * bre;
		System.out.println("Area of Rectangle is :- " + AOR);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Length:-");
		double len = scanner.nextDouble();
		System.out.println("Enter the Breadth:-");
		double bre = scanner.nextDouble();
		scanner.close();

		areaRectangle(len, bre);
	}
}
