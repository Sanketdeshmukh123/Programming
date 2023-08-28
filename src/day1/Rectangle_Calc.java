package day_1;

import java.util.Scanner;

public class Rectangle_Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Length :-");
		double len = scanner.nextDouble();
		System.out.println("Enter a Breadth :- ");
		double bre = scanner.nextDouble();
		scanner.close();
		double AreaOfRectangle = len * bre;
		System.out.print("Area of the Rectangle is :- " + AreaOfRectangle);

	}
}
