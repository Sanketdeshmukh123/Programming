package day_1;

import java.util.Scanner;

public class Month_validation2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number between 1 to 12 :-");
		int num = scanner.nextInt();
		scanner.close();

		switch (num) {
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			break;
		case 3:
			System.out.println("MAR");
			break;
		case 4:
			System.out.println("APR");
			break;
		case 5:
			System.out.println("MAY");
			break;
		case 6:
			System.out.println("JUN");
			break;
		case 7:
			System.out.println("JUL");
			break;
		case 8:
			System.out.println("AUG");
			break;
		case 9:
			System.out.println("SEP");
			break;
		case 10:
			System.out.println("OCT");
			break;
		case 11:
			System.out.println("NOV");
			break;
		case 12:
			System.out.println("DEC");
			break;

		default:
			System.out.println("Enter valid number between 1 to 12");
			break;

		}
	}
}
