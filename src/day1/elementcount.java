package day1;
import java.util.HashSet;

class elementcount{
	public static void main(String [] args){
		int [] arr ={1,1,1,1,3,4,5,5,5,2,2,1,0,0,9};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i =0 ; i<arr.length; i++){
			hs.add(arr[i]);
		}

		for(int el : hs){
			int count =0;
			for(int i=0 ;i<arr.length; i++){
				if(el == arr[i]){
					count++;
				}
			}
			System.out.println(el + " = "+ count);
		}

	}
}