package day1;

import java.util.*;

class str{

	public static void main(String [] args){
		String str = "aaabbbccdd ee ff hh kk";
		int count ; 
		
		HashSet ch1 = new HashSet();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) !=' '){
				ch1.add(str.charAt(i));
			}
		}
		
		char [] ch = new char[ch1.length];
		for(object el : ch1 ){
			for(int i=0; i<ch.length; i++){
				ch[i]=el;
			}
		}
		
		for(int i=0; i<ch.length; i++){
			count =1;
			for(int j=1; j<str.length(); j++){
				if(ch[i]==str.charAt(j)){
					count++;
				}
			}
	
			if(count>1){
				System.out.println(ch[i]+" "+count);
			}	
		}
		
	}
}