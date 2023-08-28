package day1;
class p91 
{
	public static void main(String[] args) 
	{

			String str ="Java Pogarming@123!@#";
			int Ucount=0; 
			int Lcount=0; 
			int Scount=0;
			int	Dcount=0;
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i)>='a' && str.charAt(i)<='z'){
					Lcount++;
				}
				else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
					Ucount++;
				}
				else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
					Dcount++;
				}
				else{
					Scount++;
				}
			}

			System.out.println("Uppercase :" + Ucount);
			System.out.println("Lowercase :" + Lcount);
			System.out.println("Digit :" + Dcount);
			System.out.println("Special :" + Scount);

		
	}
}
