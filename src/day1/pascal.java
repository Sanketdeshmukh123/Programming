package day1;
import java.util.*;

class pascal{

	public int fact(int i){
		if(i==0)
		   return 1;
		return (i * fact(i-1));	

	}

	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	int rows = s.nextInt();
	int i;
	int j;
	int k;

	pascal p = new pascal();


	for(i=0; i<=rows; i++){
		for(j=0; j<=rows-i; j++){
			System.out.print(" ");

		}

		for(k=0; k<=i; k++){
			System.out.print(" "+p.fact(i)/(p.fact(i-k)*p.fact(k)));
		}
	System.out.println();
	}

	}


}