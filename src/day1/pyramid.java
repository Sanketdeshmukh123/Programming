package day1;
//pyrmaid 

import java.util.*;
class pyramid{

	public static void main(String [] args){
			
		Scanner s = new Scanner(System.in);

		int rows = s.nextInt();
		
		for(int i=1; i<=rows; i++){
			for(int j=1; j<=rows-i; j++){
				System.out.print(" ");
			}

			for(int k=1 ; k<=2*i-1; k++){
				System.out.print("*");
			}
			
			System.out.println();
		
		}
		
	}
}