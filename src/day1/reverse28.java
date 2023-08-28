import java.util.Scanner;
class reverse28{

public static void reverse(int digit){
	while(digit>0){
		int last = digit%10;
		System.out.print(last);
		digit=digit/10;
} 
}

public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	int digit = scanner.nextInt();
	reverse(digit);
}	
}