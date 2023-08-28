package day1;
class p90 
{
	public static void main(String[] args) 
	{
		String str ="Hello World";
		String str2 ="";
		String [] ch = str.split(" ");
		for(String el : ch){
			for(int i=0; i<el.length(); i++){
				if(i!=0){
					String s2 = "";
					s2+=el.charAt(i);
					str2+=s2.toUpperCase();
				}else{
					String s2 = "";
					s2+=el.charAt(i);
					str2+=s2.toLowerCase();
				}
			}
			str2+=" ";
			
		}
		System.out.println(str2);
		
		
	}
}
