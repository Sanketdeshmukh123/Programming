package day1;
import java.util.Scanner;
class Armstrongn{

	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scanner.nextInt();
		Armstrong(num);
		}

	public static void Armstrong(int n){		
		for(int i= 1; i<=n; i++){
			int count = 0;
			int num_count_check = i;
			while(num_count_check>0){
				count++;
				num_count_check /=10;	
			}
			num_count_check = i;
			int sum =0;
			while(num_count_check >0){
				int last = num_count_check % 10;
				int prod = 1;
				int temp = count;
				while(temp>0){
					prod = prod * last;
					temp--;
				}
				sum = sum + prod;
				num_count_check /= 10;
			}
			if(sum == i){
				System.out.println(i);	
			}
		}
			
	}
		
}