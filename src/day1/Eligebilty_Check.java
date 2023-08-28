package day_1;

import java.util.Scanner;

public class Eligebilty_Check {

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter gender");
		String gen = sc.next();
		sc.close();
		if (gen.equals("M") && age>=21)
		{
			System.out.println("You are eligible for marriage");
		}
		else if (gen.equals("F") && age>=18)
		{
			System.out.println("You are eligible for marriage");
		}
		else
		{
			System.out.println("You are not eligible for ");
		}
		
	}
}
