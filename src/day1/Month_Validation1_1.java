package day_1;

import java.util.Scanner;

public class Month_Validation1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the month: ");
		
		String month_input = scanner.next();
		String month = month_input.toLowerCase();
		
		month_validation(month);//method calling
		
		scanner.close();
	}

	public static void month_validation(String month) {
		switch (month) {
		case "january":
		case "february":
		case "march":
		case "april":
		case "may":
		case "june":
		case "jully":
		case "august":
		case "september":
		case "octomber":
		case "november":
		case "december":
			System.out.println("Valid Month");
			break;
		default:
			System.out.println("Not Valid Month");
			break;
		}

	}

}
