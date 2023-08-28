package day1;
import java.util.Scanner;
class Spy{
	public static void SpyNumber(int num){
		int num1=num;
		int last = 0;
		int sum1 = 0;
		int prod1 = 1;
		while(num1>0){
			last = num1%10;
			sum1 = sum1 + last;
			prod1 = prod1 * last;
			num1/=10;	
		}

		if(sum1 == prod1){
			System.out.println("the number "+num+" is a spy number");
		} else{
			System.out.println("the number "+num+" is not a spy number");
		}
	}

	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		SpyNumber(num);
	}


}