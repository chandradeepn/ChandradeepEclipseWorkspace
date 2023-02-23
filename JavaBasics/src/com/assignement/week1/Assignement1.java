package com.assignement.week1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignement1 {

	public static void main(String[] args){
//		@SuppressWarnings("resource")
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter how many elements you want in array:");
//		int n=sc.nextInt();
//		System.out.println("Enter the elemnts into array: ");
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++){
//			arr[i]=sc.nextInt();
//		}
//		int inc=0,dec,count=0;
//		while(inc<arr.length){
//			dec=inc+1;
//			while(dec<arr.length){
//				if(arr[inc]==arr[dec]){
//					count+=1;
//					break;
//				}
//				dec++;
//			}inc++;
//		}
//		int arr2[]=new int[count];
//		for(int i=0;i<n;i++){
//			for(int j=i+1;j<n;j++){
//			if(arr[i]==arr[j]){
//				arr2[i]=j;
//			}
//			}
//		}
//		Arrays.parallelSort(arr2);
//		int value=arr2[0];
//		System.out.println("The first repated value in the given array is:");
//		System.out.println(arr[value]);
		System.out.println(firstRepeatedInt());
	}

	private static int firstRepeatedInt() {
		int arr[]=new int[] {1,2,3,4,0,};
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
}
//create a employee class with id,name,adress,age,email
//create 10 employee objects print it have to store in collection and sorted base on their names

//diference between the == and equals
//what is the hashcode method