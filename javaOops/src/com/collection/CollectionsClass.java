package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsClass {

	public static void main(String[] args) {
		List<Integer> l1=new Vector<>();
		l1.add(3);
		l1.add(1);
		l1.add(6);
		
		Collections.sort(l1);
		for(int i:l1)
		{
			System.out.println(i);
		}
		
		

	}

}
