package com.assignement.week6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysToList1 {
	
	private static List<String> array(String[] array){
		
		List<String> lit=Arrays.asList(array);
		return lit;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to store into array");
		int num=sc.nextInt();
		String arr[]=new String[num];
		System.out.println("Enter the data into array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		List<String> prints=array(arr);
		System.out.println(prints);
	}

}
