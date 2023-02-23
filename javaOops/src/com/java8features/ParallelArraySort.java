package com.java8features;

import java.util.Arrays;

public class ParallelArraySort {

	public static void main(String[] args) {
		
		int arr[]=new int[]{10,89,98,67,56,34,0,23};
		System.out.println("before using the parrallel sort");
		for(int i:arr)
		{
			System.out.println(i);
		}
		Arrays.parallelSort(arr);
		System.out.println("after using the parallel sort");
		for(int j:arr) {
			System.out.println(j);
		}
		Double arr1[]=new Double[]{10.5,89.4,98.3,67.2,56.0,34.6,0.7,23.8};
		System.out.println("before using the parrallel sort");
		for(Double i:arr1)
		{
			System.out.println(i);
		}
		Arrays.parallelSort(arr1);
		System.out.println("after using the parallel sort");
		for(Double j:arr1) {
			System.out.println(j);
		}

	}

}
