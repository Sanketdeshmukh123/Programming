package day1;
import java.util.*;

class identical{
	public static void main(String [] args){
	
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5,6};

		if(arr1.length == arr2.length ){
			int count = 0;
			for(int i=0; i<arr1.length; i++){	
				for( int j=0; j<arr2.length; j++){
					if(arr1[i]==arr2[j]){
						count++;
					}
				}
				
			}
			if(count==arr1.length){
				System.out.println("identical");
			} else{
				System.out.println("Not identical");
			}
		} else{
			System.out.println("Not identical");
		}	

	}

}