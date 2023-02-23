package javabasics;

import java.util.Scanner;

public class SelectionStatements {

	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		//if else statement
		if(i<9)
			System.out.println("that number is less than the given number");
		else
			System.out.println("given number is correct");

		//nested if else statement
		if(i%2==0)
		{
			System.out.println(i+" is a even number");
		}
		//else 
		if(i>2)
		{
			System.out.println(i+" is a positive number");
		}
		else
			System.out.println(i+"is a odd number");
		
		//tenary operator->condition?statement1:statement2;
		int t;
		t=i+j>40?1:2;
		System.out.println(t);
		
		String k="anc";
System.out.println(k+"c");
		String j1=k+"c"=="ancc"?"true":"false";
		System.out.println(j1);
		
		//switch operator
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("good");
		case 2:
			System.out.println("bad");
		case 3:
			System.out.println("vvgood");
		}
	}

}
