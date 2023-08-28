package day1;
import java.util.Scanner;
class prime3{

	public static void prime(int num){
		int count = 0;	
		while(num>0){
			int last = num%10;
			int counter = 0;
			
			for(int i =2; i<=last; i++){
				if(last%i==0){
					counter++;
				}
			}

			if(counter==1){
				count++;
			}
			num = num/10;	
		}
		System.out.println("The count of Prime No: "+count);

	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		prime(num);

	}
}