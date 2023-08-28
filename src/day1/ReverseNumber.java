package day1;
import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		System.out.println("Number after reverse=" +num);
		int last;

		while(num>0)
		{
			last = num%10;
			System.out.print(last);
			num=num/10;
			
		}
		
		
		

	}
}
