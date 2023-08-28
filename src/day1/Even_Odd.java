package day_1;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:-");
		
		int num = scanner.nextInt();
		scanner.close();
		
		if (num % 2 == 0) {
			System.out.println("The Given number is Even");
		} else {
			System.out.println("The Given number is Odd");
		}
	}
}
