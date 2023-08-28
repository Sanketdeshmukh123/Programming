package day_1;

import java.util.Scanner;

public class Eligibility_Check_1 {

	public static void checkEligible(int age, String gen) {
		if (gen.equals("M") && age >= 21) {
			System.out.println("You are eligible for marriage");
		} else if (gen.equals("F") && age >= 18) {
			System.out.println("You are eligible for marriage");
		} else {
			System.out.println("You are not eligible for marriage ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Age :-");
		int age = scanner.nextInt();
		System.out.println("Enter Your Gender:- ");
		String gen = scanner.next();
		scanner.close();
		checkEligible(age, gen);
	}
}
