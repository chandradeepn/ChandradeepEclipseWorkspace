package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class OptionalClass {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		
		Optional<Integer> o=Optional.empty();
		if(l1.isEmpty()) {
		System.out.println("list is empty");}
		
		Optional<Integer> o1=Optional.of(2);
		System.out.println(o1);
		
		int arr[]=new int[10];
		
		Optional<Integer> o2=Optional.ofNullable(arr[0]);
		if(o2.isPresent()) {
		System.out.println(arr[0]);}
		else {
			System.out.println("no array");
		}
		
	}

}
