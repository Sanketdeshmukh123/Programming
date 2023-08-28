package day_1;

import java.util.Scanner;

public class Square_Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Side:- ");
		int side = scanner.nextInt();
		scanner.close();
		
		int AS = side * side;
		System.out.println("Area of Square is " + AS);
	}
}
