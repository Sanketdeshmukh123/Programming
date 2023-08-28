package day1;
import java.util.Scanner;
class fibonacci{

	public static void fibonacci(int count){
		int num1= 0;
		int num2= 1;
		int res;
		System.out.println(num1 +" "+num2);
		System.out.println(" ");
		for(int i=2;i<count;++i){
			res=num1+num2;
			System.out.println(res);
			num1= num2;
			num2=res;
}
}

	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int count= scanner.nextInt();
		fibonacci(count);		
}
}