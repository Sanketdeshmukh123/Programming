package day1;
import java.util.Scanner;
class Sunny{
	
	public static void SunnyNumber(int num1){
		int num = num1+1;
		int count = 0; 
		for(int i =1; i*i<=num; i++){
			
			if(i*i == num){
				count++;
				break;
				
			}
		}
		if(count == 1){
			System.out.println("The num "+ num1 +" Sunny Number");
			}
		else{
			System.out.println("The num "+ num1 +" Not a Sunny Number");
			}
			
			
	}

	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scanner.nextInt();
		SunnyNumber(num);
	}

}