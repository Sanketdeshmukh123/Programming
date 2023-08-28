package day1;
import java.util.Scanner;
class Armstrong{
	public static void armstrong(int num){
		int numc = num;
		int num_check = num;
		int count =0;
		int res=0;

	 	while(num>0){
			count++;
			num=num/10;
		}
		
		while(numc>0){
			int last = numc%10;
			int prod = 1;
			int temp_count = count;	

			while(temp_count>0){
				prod = prod * last;
				temp_count--;
			}
			res = res + prod;
			numc = numc/10; 
		}

		if(res == num_check){
			System.out.println("The Number "+num_check+" is a Armstrong Number.");
		} else{
			System.out.println("The Number "+num_check+" is not a Armstrong Number.");
		}	
	}

	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scanner.nextInt();
		armstrong(num);
	}
	

}
