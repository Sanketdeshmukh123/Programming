package day1;
class p85 
{
	public static void main(String[] args) 
	{

		String str ="java allows programmer to build application";

		int count = 0;
		for(String el: str.split(" ")){
			if(el.length()%2==0){
				count++;
			}
		}
		System.out.println("Even length word count: " +count);
	}
}
