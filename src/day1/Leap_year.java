package day_1;

import java.util.Scanner;

public class Leap_year {

	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter a Year :- ");
		int year = scanner.nextInt();
		scanner.close();
	
		if(year%4 ==0 && year%400==0){
			System.out.println("The Given year is a Leap Year");
		}
		else{
			System.out.println("The Given year is Not a Leap Year");
		}
	}	
	
}
