package day_1;

import java.util.Scanner;

public class Even_Odd_1 {

	public static void oddEven(int num) {
		if (num % 2 == 0) {
			System.out.println("The Given Number is Even");
		} else {
			System.out.println("The Given Number is Odd");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int num = scanner.nextInt();
		scanner.close();
		oddEven(num);

	}
}
