package com.practice;
public class PalindromeString{
	
	public static void main(String[] args) {
		String s= new String("level");//radar,level,12321,
		String rev="";
		for(int i=s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev) && s.length()==rev.length()) {
System.out.println("both are equals i.e palindrome number");	
		}
		else {
			System.out.println("both are not equals i.e not palindrome number");	

		};
	
	}
}