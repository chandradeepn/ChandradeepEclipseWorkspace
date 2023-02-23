package com.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		List<Integer> l1=new Vector<>();
		l1.add(345);
		l1.add(123);
		l1.add(678);
		
		Comparator<Integer> c=new Comparator<Integer>()
				{
					public int compare(Integer o1, Integer o2) {
						if(o1>02)
						{
							return 1;
						}
						else
							return -1;
					}
				};
		
		Collections.sort(l1, (i,j)-> i+100<j-100?1:-1);
		for(int i:l1)
		{
			System.out.println(i);
		}
		

	}

}
