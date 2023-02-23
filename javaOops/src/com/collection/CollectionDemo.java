package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection c1=new HashSet();
		c1.add("den");
		c1.add('e');
		c1.add(10);
		c1.add(23.6);
		c1.add(45.2f);
		
		System.out.println(c1);
		
		Iterator itr=c1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Collection<String> c2=new TreeSet<>();
		c2.add("chandu");
		c2.add("pavan");
		c2.add("sai krishna");
		c2.add("prudhvi");
		c2.add("sai baba");
		c2.add("suri");
		c2.add("vishnu vardhan");
		
		Iterator itr1=c2.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
