package day1;
import java.util.Scanner;
class DigitalEven 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		int sum=0;
		while(num>0)
		{
				int last=num%10;
				if(num%2==0)
			{
				sum=sum+last;
			}
			
			  num=num/10;
		}
		System.out.println(sum);
		
	}
}
