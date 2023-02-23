package javabasics;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//1d array
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		System.out.print(" "+arr[i]);}
		
		System.out.println();
		//1darray for enhanced loop
		for(int s:arr)
		{
			System.out.print(" "+ s);
		}
		
		//multidimensional array
//		int row=sc.nextInt();
//		int coloumn=sc.nextInt();
//		int multi[][]=new int[row][coloumn];
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<coloumn;j++)
//			{
//				multi[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<coloumn;j++)
//			{
//				System.out.print(" "+multi[i][j]);
//			}
//			System.out.println();
//		}
//		//enchanced for loop for the multidimensional array
//		for(int sing[]:multi)
//		{
//			for(int arr1:sing)
//			{
//				System.out.print(" "+arr1);
//			}
//			System.out.println();
//		}
	}

}
