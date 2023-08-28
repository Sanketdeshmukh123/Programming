package day1;
import java.util.*;

class possiblePair{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int [] arr = {1,2,3};
		int count = 0;
		for(int i=0; i<arr.length; i++){
			
			for(int j=0 ; j<arr.length; j++){
				if(arr[i]+arr[j]==num){
					count++;
				}
				
			}
		
		}
		System.out.println("Possible Pair: "+count);
		
	}
}