package com.tasks;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your number");
   int n=sc.nextInt();
   sc.close();
   NumbToWord nu=new  NumbToWordImpl();
	System.out.println(nu.NumberToWord(n));
	}
}
