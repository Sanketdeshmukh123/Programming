package day1;
import java.util.Scanner;
class Strongn{
	public static void StrongNumber(int num){
		
		System.out.print("The strong number upto "+num+" are as:");
		for(int i=1; i<=num; i++){
			int last = 0;
			int num1 = i ;
			int fact = 0;

			while(num1>0){
				last = num1%10;
				int res = Fact(last);
				fact = fact + res;
				num1/=10;
			}

			if(i == fact){
				System.out.print(i+" ");
			}
		}
		
	}	

	public static int Fact(int factnum){
		
		if(factnum>0)
		{
			return factnum*Fact(factnum-1);
		} else {
			return 1;
		}
		
	}

	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		StrongNumber(num);
	}


}