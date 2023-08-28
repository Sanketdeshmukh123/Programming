package day1;
import java.util.Scanner;
class Power{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base value");
		int base= scanner.nextInt();
		System.out.println("Enter Power value");
		int power=scanner.nextInt();
		int res=1;

		for(int i=power ; i>=1; i--)
		{
			res=res*base;
		}
		System.out.println("Output= " +res);

	}
}
