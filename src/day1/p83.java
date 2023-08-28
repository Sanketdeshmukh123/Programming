//string palindrome
package day1;
class p83 
{
	public static void main(String[] args) 
	{

		String str = "nayan";
		String str2 ="";
		for(int i =str.length()-1; i>=0; i--){
			str2= str2+str.charAt(i);
		}
		if(str2.equals(str)){
			
			System.out.println("palindrome");
		} else{
			System.out.println("not a palindrome");
		}
	}
}
