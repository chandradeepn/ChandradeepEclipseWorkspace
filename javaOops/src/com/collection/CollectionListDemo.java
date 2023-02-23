package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionListDemo {

	public static void main(String[] args) {
		
		System.out.println("This is the array list starting");
		List l1=new ArrayList<>();
		l1.add(12);
		l1.add(23.4f);
		l1.add("str");
		
		Iterator itr1=l1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("This is the array list ending");
		System.out.println("* * * * * * * * * * * * * * *");
		System.out.println("This is the linked list starting");
		LinkedList<Float> l2=new LinkedList<>();
		l2.add(23.5f);
		l2.add(90.4f);
		l2.add(45.8f);
		l2.add(49.6f);
		l2.addFirst(34.7f);
		l2.removeFirst();
		for(Float f:l2)
		{
			System.out.println(f);
		}
		Collections.sort(l2,(i,j)-> i>j?1:-1);
		System.out.println("This is the linked list ending");
		System.out.println("* * * * * * * * * * * * * * *");
		System.out.println("This is the vector list starting");

		List<Integer> v=new Vector<>();
		v.add(67);
		v.add(89);
		v.add(90);
		Iterator itr =v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("This is the vector list ending");
		System.out.println("* * * * * * * * * * * * * * *");
		System.out.println("This is the stack of vector starting");

		Stack<Integer> v1=new Stack<>();
		v1.push(10);
		v1.push(12);
		v1.push(14);
		v1.push(15);
		v1.pop();
		System.out.println(v1.peek());
		System.out.println(v1.search(14));
		
		for(int i:v1)
		{
			if(v1.empty())
			System.out.println(i);
		}
		System.out.println("This is the stack of vector ending");
	}

}
