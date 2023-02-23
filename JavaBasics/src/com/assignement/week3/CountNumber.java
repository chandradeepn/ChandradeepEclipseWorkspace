package com.assignement.week3;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="newmethodofthestring";
		char c='o';
		int count=0;
		for (int i = 0; i < a.length(); i++){
			if(a.charAt(i)==c) {
				count+=1;
			}
		}
		System.out.println("The coun of character "+" "+c+" "+"is:");
		System.out.println(count);
	}

}
