package com.assignement.week3;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String a=sc.next();
		System.out.println("enter the second strings");
		String b=sc.next();
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println("The fisrt swapped string is");
		System.out.println(a);
		System.out.println("The second swapped string is");
		System.out.println(b);
	}
}
