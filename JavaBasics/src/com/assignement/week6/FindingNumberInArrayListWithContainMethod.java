package com.assignement.week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingNumberInArrayListWithContainMethod {

	private static void findNumber(int number,List<Integer> li) {
		
	if (li.contains(number)) {
		System.out.println(number+" "+"is  found");
	}
	else {
		System.out.println(number+" "+"not found");
	}
	}
	
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(4);
		li.add(5);
		li.add(7);
		li.add(8);
		li.add(9);
		li.add(10);
		findNumber(8,li);
	}

}
