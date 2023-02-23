package javabasics;

import java.util.Scanner;

class Sum
{
	int result=0;
	 
	public int addition(int num1,int num2)
	{
		return result=num1+num2;
	}
}

class Sub
{
	int num1=10;
	int num2=5;
	
	
}

public class ClassAndObject {

	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println(s.addition(4, 6));
		
		
	}

}

