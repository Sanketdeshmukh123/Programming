package day1;
class p88 
{
	public static void main(String[] args) 
	{
		String str ="java allows programmer to build application";
		String str2 ="";
		String [] ch = str.split(" ");
		for(String el : ch){
			for(int i=el.length()-1; i>=0; i--){
				str2+=el.charAt(i);
			}
			str2=str2+" ";
		}
		System.out.println(str2);
		
		
	}
}
