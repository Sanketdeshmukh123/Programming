import java.util.Scanner;
class palindrome{

public static void palindrome(int digit){
	int last = 0;
	while(digit>0){
		last = digit%10;
		//System.out.print(last);
		digit=digit/10;
} 
if(digit==last){
System.out.println("palindrome");
}
else{
System.out.println("not a palindrome");
}

}

public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	int digit = scanner.nextInt();
	palindrome(digit);
}	
}