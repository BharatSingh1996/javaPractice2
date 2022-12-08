package com.practice;

public class ReverseString {

	public static void main(String[] args) {

		String str= "12345";
		char[] ch=str.toCharArray();
		String s="";
		for(int i=ch.length-1; i>=0;i--) {
			s=s+ch[i];
		}
		
		System.out.println(s);
		
		String s1="";
		for(int i=str.length()-1;i>=0;i--) {
			s1=s1+ str.charAt(i);
		}
		System.out.println(s1);
	}

}
