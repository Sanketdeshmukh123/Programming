//p to replace given element in array

package day1;
import java.util.Scanner;

class p75{
	public static void main(String [] args){
		Scanner ab= new Scanner(System.in);
		int [] arr= {1,2,3,4,5};
		System.out.println("Enter the number: ");
		int number = ab.nextInt();
		System.out.println("Enter the number has to be Replace: ");
		int replace = ab.nextInt();

		for(int i=0; i<arr.length; i++){
			if(arr[i]==number){
				arr[i]=replace;
			}
		}
		
		for(int el: arr){
			System.out.print(el+" ");
		}
	
	}

}