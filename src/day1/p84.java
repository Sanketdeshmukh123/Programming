//count vowels consonant, space , special character
package day1;
class p84 
{
	public static void main(String[] args) 
	{
		String str ="i have to play@!#";
		int vcount =0, ccount=0, scount=0, spcount=0;
		for(int i=0; i<=str.length()-1; i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
					vcount++;
				}else{
					ccount++;
				}
			}
			else {
				if(str.charAt(i)==' '){
					scount++;
				}else{
					spcount++;
				}
			}
		}
		System.out.println("vowels count: "+ vcount);
		System.out.println("consonent count: "+ ccount);
		System.out.println("space count: "+ scount);
		System.out.println("special character count: "+ spcount);
	}
}
