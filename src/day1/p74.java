//in an array elemnet separate them based on odd number and even number ex: 92186  o/p 91286

package day1;
class p74{
	public static void main (String [] args){
		int [] arr = {1,2,3,4,5,6};
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]%2!=0){
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp; 
				}
			}			
		}
		for(int el: arr){
			System.out.print(el+" ");
		}
	} 

}