package day_1;

import java.util.Scanner;

public class Calc_SI_1 {

	public static void sI(double P, double R, double T) {
		double SI = (P * R * T) / 100;

		System.out.println("Simple Interest " + SI);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Principle Amount :-");
		double P = scanner.nextDouble();
		System.out.print("Enter Rate of Interest :-");
		double R = scanner.nextDouble();
		System.out.print("Enter Time Period :-");
		double T = scanner.nextDouble();
		scanner.close();
		sI(P, R, T);
	}
}
