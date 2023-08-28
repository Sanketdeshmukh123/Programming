import java.util.Scanner;
class reverse29{

public static void reverse(int digit){
	int rev =0;
	while(digit>0){
		int last = digit%10;
		rev = rev*10 + last;
		digit=digit/10;

} 
System.out.println(rev);
}

public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	int digit = scanner.nextInt();
	reverse(digit);
}	
}