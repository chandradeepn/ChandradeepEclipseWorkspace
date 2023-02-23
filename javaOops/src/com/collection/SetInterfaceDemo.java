package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		
		Set<Integer> s1=new HashSet<>();
		s1.add(3);
		s1.add(58);
		s1.add(7);
		s1.add(90);
		System.out.println(s1.contains(9));
		for(int i:s1)
		{
				System.out.println(i);
		}
		
		TreeSet<Integer> s2=new TreeSet<>();
		s2.addAll(s1);
		s2.add(0);
		System.out.println(s2.floor(4));
		System.out.println(s2.ceiling(4));
		for(int j:s2)
		{
			System.out.println(j);
		}
		System.out.println(s2.descendingSet());
		Set<Integer> s3=new LinkedHashSet<>();
		s3.add(11);
		s3.add(21);
		s3.add(31);
		s3.add(41);
		for(int i:s3)
		{
			System.out.println(i);
		}
	}

}
