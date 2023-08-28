package day1;
import java.util.Scanner;
class fibonacci2{

	public static void fibonacci(int count){
		int num1= 0;
		int num2= 1;
		
		System.out.println(num1 +" "+num2);
		System.out.println("  ");
		int res = 0;
		for(int i=1;i<count-1;i++){
			res=num1+num2;
			num1= num2;
			num2=res;
		}
		System.out.println(res);
	}

	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int count= scanner.nextInt();
		fibonacci(count);		
	}
}