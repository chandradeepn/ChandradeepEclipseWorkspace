package com.assignement.week6;

import java.util.ArrayList;
import java.util.List;

public class ArraysToList {
	
	private static List<Integer> arrays(int[] arr){
		
		List<Integer> lit = new ArrayList<>();
		for ( int num : arr ) {
			lit.add(num);
		}
		return lit;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {10,20,30,40,50,60,70};
		List<Integer> list = arrays(arr);
		System.out.println(list);
	}

}
