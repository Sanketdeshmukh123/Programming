package day1;
class p86
{
	public static void main(String[] args) 
	{

		String str = "Fs8g6hu";
		int sum =0;
		for(int i=0; i<str.length(); i++ ){
			if(Character.isDigit(str.charAt(i))){
				int num = str.charAt(i)-'0' ;
				sum += num;
			}
		}
		System.out.println("sum: "+ sum);
	}
}
