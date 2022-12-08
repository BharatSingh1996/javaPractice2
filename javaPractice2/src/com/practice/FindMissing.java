package com.practice;

import java.util.Arrays;

class FindMissing{
	
	public static void main(String[] args) {
		
		int[] ar= {0,1,2,3,4,6,8,7,9}; // find missing that is 5
		Arrays.sort(ar);
		//int flag=0;
		for(int i=0;i<ar.length; i++) {
			if(ar[i]!=i) {
				System.out.println(i);
				break;
			}
		}
		
	}
}