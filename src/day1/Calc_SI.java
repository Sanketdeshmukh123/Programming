package day_1;

import java.util.Scanner;

public class Calc_SI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Principle Amount :-");
		int P = scanner.nextInt();
		System.out.print("Enter Rate of Interest :-");
		int R = scanner.nextInt();
		System.out.print("Enter Time Period :-");
		int T = scanner.nextInt();

		int SI = (P * R * T) / 100;

		System.out.println("Simple Interest " + SI);

		scanner.close();
	}
}
