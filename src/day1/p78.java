//p to reverse the array without using new array

package day1;
import java.util.*;

class p78{
	public static void main(String [] args){
		int [] arr= {1,2,3,4};
		int i = 0;
		int j=arr.length-1;
		while(i<j){
			
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		for(int el : arr){
			System.out.print(el+" ");
		}
	}		
}