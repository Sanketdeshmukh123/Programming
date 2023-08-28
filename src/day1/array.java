package day1;

import java.util.*;

class array{

	public static void main(String [] args){

		int [] arr = {1,2,3,4,5,6,7};
		int max = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for(int i=0; i<=arr.length-1; i++){
			if(arr[i]>max){
				third = second ; 
				second = max;
				max =arr[i];
			}
			else if(arr[i]<max && arr[i]>second){
				third = second;
				second = arr[i];
				
			}
			else if(arr[i]<second && arr[i]>third){
				third = arr[i];
			}

		}
		
		if(third != Integer.MIN_VALUE){
			System.out.println(third);
		} else {
			System.out.println("not a second max no");
		}
	}

}