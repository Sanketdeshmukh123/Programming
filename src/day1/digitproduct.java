import java.util.Scanner;
class digitproduct{
	public static void digit_prod(int num){
		int prod = 1;
		while(num!=0){
			int res= num%10;
			if(res%2==0){
				prod = prod * res;
}
		num=num/10;
}
		System.out.println(prod);
}
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int num = scanner.nextInt();
		digit_prod(num);
}	
}