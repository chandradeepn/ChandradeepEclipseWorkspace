package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
//		
//		Map<Integer,Integer> m1=new HashMap<>();
//		m1.put(0, 11);
//		m1.put(1, 7);
//		m1.put(2, 50);
//		m1.put(3, 4);
//		
//		Set<Integer> s1=m1.keySet();
//		for(int i:s1)
//		{
//			System.out.println(i+" : "+m1.get(i));
//		}
//
//		Map<Integer,Integer> m2=new LinkedHashMap<>();
//		m2.put(0, 1);
//		m2.put(1, 7);
//		m2.put(2, 5);
//		m2.put(3, 4);
//		
//		Set<Integer> s2=m2.keySet();
//		for(int i:s2)
//		{
//			System.out.println(i+" : "+m1.get(i));
//		}
		
		Map<String,Object> m3 = new HashMap<>();
		Map<String,Object> m4 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ;i++) {
			String obj1 = sc.next();
			String obj2 = sc.next();
			m3.put(obj1,obj2 );
		}
			
				String sr = sc.next();
				for(int j = 0 ; j<4;j++ ) {
				String obj3 = sc.next();
				Object obj4 = sc.next();
				m4.put(obj3, obj4);
				}
				m3.put(sr, m4);
		
			
		
//		Set<String> s3 = m3.keySet();
//		for(String i:s3)
//		{
//			System.out.println(i+" : "+m3.get(i));
//		}
		System.out.println(m3);
	}

}
