//program to find most frequent element in array

package day1;

import java.util.*;

class p79{

	public static void main (String [] args){
		
		int [] arr= {1,2,3,2,2,1,1,1,3,3,3,3,3,3,4,4,4,5,5};
		HashSet<Integer> hs = new HashSet<Integer>();

		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}

		int max = 0;
		int frequent = 0;
		for(int el: arr){
			int count = 0;
			for(int i=0; i<arr.length; i++){
				if(el==arr[i]){
					count++;
				}
			}
			if(count>max){
			max=count;
			frequent = el;
			}
		}

		System.out.println("The most frequent element is: "+frequent);
	}

}