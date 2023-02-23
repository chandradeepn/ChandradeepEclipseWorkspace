package com.assignement.week6;

import java.util.HashSet;
import java.util.Set;

public class AddElementsInHashSet {

	private static Set<String> addElements(Set<String> set) {
		
		set.add("vishnu");
		set.add("pavan");
		set.add("krishna");
		return set;
		
	}
	
	public static void main(String[] args) {
	
		Set<String> set=new HashSet<>();
		
		Set<String> prints=addElements(set);
		System.out.println(prints);
	}

}
