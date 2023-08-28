package day1;
import java.util.Scanner;
class Armstrong2{
	public static void Armstrong(int n){		
		for(int i= 1; i<=n; i++){
			int count = 0;
			int num_count_check = i;
			int num1 = i;
			while(num_count_check>0){
				count++;
				num_count_check /=10;	
			}
			
			int sum =0;
			while(num1>0){
				int last = num1%10;
				int prod = 1;

				while(count>0){
					prod = prod * last;
					count--;
				}
				sum = sum + prod;
				num1 /= 10;
			}
			if(sum == num1){
				System.out.println("The Armstrong Numbers are: .");
				System.out.print(num1 +" ");
			}
		} 
	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scanner.nextInt();
		Armstrong(num);
	}
		
}