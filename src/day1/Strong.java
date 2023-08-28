package day1;
import java.util.Scanner;
class Strong{
	public static void StrongNumber(int num){
		int last = 0;
		int num1 = num ;
		int fact = 0;
		while(num1>0){
			last = num1%10;
			int res = Fact(last);
			fact = fact + res;
			num1/=10;
		}

		if(num == fact){
			System.out.println("the number "+num+" is a strong number");
		} else{
			System.out.println("the number "+num+" is not  a strong number");
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