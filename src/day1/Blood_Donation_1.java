package day_1;

import java.util.Scanner;

public class Blood_Donation_1 {

	static void bloodDonation(int age, double weight, char gender) {
		if (gender == 'm') {
			if (age > 18) {
				if (weight > 55) {
					System.out.println("You are eligible for the blood donation thank you..!!");
				} else {
					System.out.println(
							"You are eligible by the weight but your weight is less so you are not elligible for blood donation thank you..!!");
				}
			}
		} else if (gender == 'f') {
			if (age > 18) {
				if (weight > 45) {
					System.out.println("You are eligible for the blood donation thank you..!!");
				} else {
					System.out.println(
							"You are eligible by the weight but your weight is less so you are not elligible for blood donation thank you..!!");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your weight");
		double weight = sc.nextDouble();
		System.out.println("Enter your gender");
		char gender = sc.next().charAt(0);
		sc.close();
		bloodDonation(age, weight, gender);
	}
}
