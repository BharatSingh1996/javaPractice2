package com.practice;

import java.util.Arrays;

public class MergeSortArray{
	
	public static void main(String[] args) {
		int[] a1= {12,23,45,64,98,74,15};
		int[] a2= {13,24,46,65,99};
		int[] a3= new int[a1.length+a2.length];
		int index =0;
		for(int i=0;i<a1.length;i++) {
			a3[index]=a1[i];
			index++;
		}
		for (int i = 0; i < a2.length; i++) {
			a3[index] = a2[i];
			index++;
			
		}

		Arrays.sort(a3);
		
for(int n:a3) {
System.out.print(n+" ");

}
	}
}