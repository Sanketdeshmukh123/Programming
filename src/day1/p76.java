//p to find intersection of 2 array

package day1;
import java.util.*;

class p76{
	public static void main(String [] args){
		//Scanner ab= new Scanner(System.in);
		int [] arr1= {1,2,3};
		int [] arr2 = {1,2,5};
		HashSet<Integer> hs = new HashSet<Integer>();  

		for(int el : arr1){
			hs.add(el);
		}
		
		for(int el : arr2){
			hs.add(el);
		}

		
		
		for(int el: hs){
			System.out.print(el+" ");
		}
	}		
}