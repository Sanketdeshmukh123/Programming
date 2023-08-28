package day1;
import java.util.*;

class lar{

	public static void main(String [] args){
		int [] arr = {10,11,2,3,4,1,7,9,6,8};
		int max = arr[0];
		int second = Integer.MIN_VALUE;
		

		for(int i=1; i<=arr.length-1; i++){
			if(arr[i]>max){
				second = max;
				max = arr[i];
			}
			else if(arr[i]>second && arr[i]<max){
				second = arr[i];
			}
		}
		if(second != Integer.MIN_VALUE){
			System.out.println(second);
		}

	}

}

