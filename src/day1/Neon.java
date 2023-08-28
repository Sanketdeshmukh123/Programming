package day1;
import java.util.Scanner;
class Neon{
	
	public static void NeonNumber(int num){
		int prod1 = num * num;
		int sum = 0;
		while(prod1>0){
			int last = prod1%10;
			sum = sum + last;
			prod1 = prod1/10;
		}

		if(num == sum) {
			 System.out.println("The number "+num+" is a Neon Number"); 
		} else{
			System.out.println("The number "+num+" is not a Neon Number"); 
		}	
			
	}

	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scanner.nextInt();
		NeonNumber(num);
	}

}