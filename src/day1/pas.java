package day1;
import java.util.*;

class pas{

	public int fact(int i){
		if(i==0)
			return 1;
		return i*fact(i-1);
	}

	public static void main(String [] args){
		int rows = 5;
		pas p = new pas();
		
		for(int i=0; i<=rows; i++){
			for(int j=0; j<=rows-i; j++){
				System.out.print(" ");
			}

			for(int k=0; k<=i; k++){
				System.out.print
		(" "+ p.fact(i)/(p.fact(i-k)*p.fact(k)));
			}

		System.out.println();
		}
	}

}

