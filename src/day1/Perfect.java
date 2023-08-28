package day1;
import java.util.Scanner;
class Perfect{
	
	public static void PerfectSquare(int num){
		int count = 0; 
		for(int i =1; i*i<=9; i++){
			
			if(i*i == num){
				count++;
				break;
				
			}
		}
		if(count == 1){
			System.out.println("Perfect Square");
			}
		else{
			System.out.println("Not a Perfect Square");
			}
			
			
	}

	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = scanner.nextInt();
		PerfectSquare(num);
	}

}