package day1;
import java.util.Scanner;
class Xylem{
	
	public static void XylemNumber(int num){
		int num1 = num;
		int last = 0;
		int mean = 0;
		int extreme = 0;
		while(num1>0){
			last = num1 % 10;
			if(num == num1 || num1<10){
				extreme = extreme + last;
			} else{
				mean = mean + last;	
			}
			num1/=10;
		}
		
		if(mean == extreme){
			System.out.println("The num "+ num +" Xylem Number");
			}
		else{
			System.out.println("The num "+ num +" phloem Number");
			}
			
			
	}

	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scanner.nextInt();
		XylemNumber(num);
	}

}