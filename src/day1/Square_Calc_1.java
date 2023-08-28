package day_1;

import java.util.Scanner;

public class Square_Calc_1 {

	public static void areaSquare(double side) {
		double areaSquare = side * side;
		System.out.println(areaSquare);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Side:- ");
		double side = scanner.nextInt();
		scanner.close();
		areaSquare(side);

	}
}
