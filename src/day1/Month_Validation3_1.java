package day_1;

import java.util.Scanner;

public class Month_Validation3_1 {

	public static void daysInMonths(String month) {
		switch (month) {
		case "Jan":

		case "Mar":

		case "May":

		case "Jul":

		case "Aug":

		case "Oct":

		case "Dec":
			System.out.print("Number of days present in the month are 31 ");

			break;

		case "Apr":

		case "Jun":

		case "Sep":

		case "Nov":
			System.out.println("Number of days present in the month are 30");

			break;

		case "Feb":
			System.out.println("Number of days present in the month are 28");

			break;

		default:
			System.out.println("Enter the valid Month");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Month :- ");
		String month = scanner.next();
		daysInMonths(month);
		scanner.close();
	}

}
