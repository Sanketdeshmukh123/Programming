package day1;
class bubblesort{
	public static void main(String [] args){
		int [] arr ={9,10,11,0,55,500,2};

		for(int i =0 ; i<arr.length; i++){
			for(int j =i+1 ; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}

		for(int el: arr){
			System.out.print(el+" ");
		}
		
	}
}