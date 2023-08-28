package day_1;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Java Marks :- ");
		double java = scanner.nextDouble();
		System.out.println("SQL Marks :- ");
		double sql = scanner.nextDouble();
		System.out.println("Html&Css Marks :- ");
		double hc = scanner.nextDouble();
		System.out.println("JavaScript Marks :- ");
		double js = scanner.nextDouble();
		scanner.close();
		double total = java + sql + hc + js;
		System.out.println("Total Marks :-" + total);

		double percentage = (total / 400) * 100;
		System.out.println("Percentage :- " + percentage);
	}
}
