//p to find union of 2 array

package day1;
import java.util.*;

class p77{
	public static void main(String [] args){
		//Scanner ab= new Scanner(System.in);
		int [] arr1= {1,2,3};
		int [] arr2 = {1,2,5};
		HashSet<Integer> hs = new HashSet<Integer>();  

		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i]==arr2[j]){
					hs.add(arr1[i]);
				}	
			}
		}
		
		for(int el: hs){
			System.out.print(el+" ");
		}
	}		
}