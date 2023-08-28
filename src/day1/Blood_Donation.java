package day_1;

import java.util.Scanner;

public class Blood_Donation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your weight");
		double weight = sc.nextDouble();
		System.out.println("Enter your gender");
		char gender = sc.next().charAt(0);
		System.out.println("Thanks for your valuable data please find your eligibility bellow");
		boolean flag = false;
		System.out.println("Check Your details you have enterd");
		System.out.println(
				"Your age is : " + age + "\n" + "Your weight is : " + weight + "\n" + "Your gender is : " + gender);
		System.out.println("If your details are correct press 1");
		int correct = sc.nextInt();
		sc.close();
		if (correct == 1) {
			flag = true;

			if (flag == true) {
				System.out.println("Thank you for confirmation..!!");
			}
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
			} else {
				System.out.println("By mistake you enterd incorrect gender please enter correct gender");
			}
		} else {
			System.out.println("Please correct your detail please refresh page to enter new details");
		}
	}
}
