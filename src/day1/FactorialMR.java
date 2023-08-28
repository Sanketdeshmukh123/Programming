package day1;
import java.util.Scanner;
class Factorial{
	public static int fact(int num)
	{
		int fact=1;
		if(num>0)
		{
			return num*fact(num-1);
		} 
		else
		{
			return 1;
		}	
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		System.out.println(fact(num));
		
	}
}
