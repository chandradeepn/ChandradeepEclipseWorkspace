package com.assignement.week3;

import java.util.Scanner;

public class ReverseStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to perform reverse");
		String a=sc.nextLine();
		String b="";
		for (int i = a.length() - 1; i >= 0; i--){
			b+=a.charAt(i);
		}
		System.out.println("The reversed string is:");
		System.out.println(b);

	}
}