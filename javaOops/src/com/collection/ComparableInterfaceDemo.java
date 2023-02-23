package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Family implements Comparable<Family>
{
	int num;
	int vehicles;
	String names;
	public Family(int num, int vehicles, String names) {
		super();
		this.num = num;
		this.vehicles = vehicles;
		this.names = names;
	}
	@Override
	public String toString() {
		return "Family [num=" + num + ", vehicles=" + vehicles + ", names=" + names + "]";
	}

	public int compareTo(Family o) {
		return vehicles>o.vehicles?1:-1;
		
	}
	
	
	
}

public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		
		List<Family> l1=new ArrayList<>();
		l1.add(new Family(8,5,"nagella"));
		l1.add(new Family(3,2,"vankadara"));
		l1.add(new Family(2,1,"bochu"));
		l1.add(new Family(3,0,"kalva"));
		
		Collections.sort(l1);
		
		for(Family f:l1)
		{
			System.out.println(f);
		}
		

	}

}
