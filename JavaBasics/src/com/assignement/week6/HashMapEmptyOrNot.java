package com.assignement.week6;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmptyOrNot {

	private static String emptyOrNot(Map<Integer,String> max) {
		
		//using normal way
		if(max.size()<=0) {
			return "Hashmap is empty";
		}else {
			return "Hashmap is not empty";
		}
		//using method isempty
//		if(max.isEmpty()) {
//			return "Hashmap is empty";
//		}else {
//			return "Hashmap is not empty";
//		}
	}
	
	public static void main(String[] args) {

		Map<Integer,String> hm = new HashMap<>();
		hm.put(1, "Chandradeep");
		hm.put(2, "bhavani");
		hm.put(3, "thulasi");
		hm.put(4, "satyam");
		hm.put(5,"venkateswarlu");
		hm.put(5, "parvathi");
		
		System.out.println(emptyOrNot(hm));
	}

}
