package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		//using filter method
		System.out.println("this is the filter method");
		List<Integer> l1=Arrays.asList(10,20,200,873498,32898,39290);
		System.out.println("this is the filter method with the collectors to list");
		List<Integer> sort=l1.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println(sort);
		System.out.println("this is the filter method with toset");
		Set<Integer> set1=l1.stream().filter(s->s%2==0).collect(Collectors.toSet());
		System.out.println(set1);
		System.out.println("this is the filter method with the foreach");
		l1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("this is the filter method with the reduce");
		int num=l1.stream().filter(n->n>0).reduce(0,(ans,i)->ans+i);
		System.out.println(num);
		System.out.println();
		
		System.out.println("this is the map method");
		//using map method
		List<Integer> l2=Arrays.asList(30,80,37,930);
		System.out.println("this is the map method with the collectors to list");
		List<Integer> add=l2.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(add);
		System.out.println("this is the map method with the collectors to set");
		Set<Integer> set2=l2.stream().map(n->n%2).collect(Collectors.toSet());
		System.out.println(set2);
		System.out.println("this is the map method with foreach");
		l2.stream().map(n->n>0).forEach(n->System.out.println(n));
		System.out.println("this is the map method with the reduce");
		int get=l2.stream().map(n->n*3).reduce(0,(ans,i)->ans+i);
		System.out.println(get);
		System.out.println();
		
		System.out.println("this is the sorted method");
		//sorted method
		List<Double> l3=Arrays.asList(12.3,14.5,89.5,09.89);
		System.out.println("this is the sorted method with the collectors to list");
		List<Double> sorting=l3.stream().sorted().collect(Collectors.toList());
		System.out.println(sorting);
		System.out.println("this is the sorted method with the collectors to set");
		Set<Double> s1=l3.stream().sorted().collect(Collectors.toSet());
		System.out.println(s1);
		System.out.println("this is the sorted method wit the for each method");
		l3.stream().sorted().forEach(n->System.out.println(n));
		System.out.println("this is the sorted method with the reduce method");
		Double d=l3.stream().sorted().reduce(0.0,(ans,i)->ans+i);
		System.out.println(d);
	}

}
