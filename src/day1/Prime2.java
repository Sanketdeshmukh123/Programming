package day1;
//import java.util.Scanner;
class Prime2{

	public static void Prime(int num){
		for(int i=10; i<=num; i++){
			int count = 0;
			for(int j=2; j<i; j++){
				if(i%j==0){
					count++;
				}	
			}
			if(count==0){
				System.out.print(i + " ");
			}
		}
}

	public static void main(String[]args){
		Prime(80);	
}
}