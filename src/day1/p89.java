package day1;
class p89 
{
	public static void main(String[] args) 
	{
		String str ="java allows programmer to build application";
		String str2 ="";
		String [] ch = str.split(" ");
		for(String el : ch){
			for(int i=0; i<el.length(); i++){
				if(i==0){
					String s2 = "";
					s2+=el.charAt(i);
					str2+=s2.toUpperCase();
				}else{
					str2+=el.charAt(i);
				}
			}
			str2+=" ";
			
		}
		System.out.println(str2);
		
		
	}
}
