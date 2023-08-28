package day1;
class p87 
{
	public static void main(String[] args) 
	{
		String str ="java allows programmer to build application";
		int count= 0;
		String [] ch = str.split(" ");
		for(String el: ch){
				int i =0;
			
				if(el.charAt(i)=='a' || el.charAt(i)=='e' || el.charAt(i)=='i' || el.charAt(i)=='o' || el.charAt(i)=='u'){
				count++;
			
			}
		}
		System.out.println("vowels start count : "+ count);
	}
}
