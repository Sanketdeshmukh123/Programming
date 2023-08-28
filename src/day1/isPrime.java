package day1;
import java.util.Scanner;
class isPrime{

	public static void isPrime(int num){
		int count = 0;
		for(int i=2; i<=num; i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==1){
			System.out.println("The Num "+num+" is a prime number");
}
		else{
			System.out.println("The Num "+num+" is not a prime number");
}
}

	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		isPrime(num);	
}
}