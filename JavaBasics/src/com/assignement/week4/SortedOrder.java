package com.assignement.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int id;
	String name,adress,email;
	int age;
	
	public Employee(int id, String name, String adress, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + ", email=" + email + ", age=" + age
				+ "]" + "\n";
	}
	@Override
	public int compareTo(Employee o) {
		
		return email.compareTo(o.name);
	}
	
	
	
}
public class SortedOrder {
	private static void sortingByNames() {
		Employee emp1 = new Employee(1, "chandradeep", "velgode", "nchandradeep1@gmail.com", 21);
		Employee emp2=new Employee(2,"anikesh","odisha","anikesh@gmail.com",22);
		Employee emp3=new Employee(3,"danish","mumbai","danish@gmail.com",21);
		Employee emp4=new Employee(4,"vinay","vijayawada","vinay@gmail.com",23);
		Employee emp5=new Employee(5,"prudhvi","nellore","prudhvi@gmail.com",22);
		Employee emp6=new Employee(6,"sashank","chittor","sashank@gmail.com",21);
		Employee emp7=new Employee(7,"vishnu","yerruguntla","vishnu@gmail.com",22);
		Employee emp8=new Employee(8,"greeshma","kurnool","greeshma@gmail.com",21);
		Employee emp9=new Employee(9,"usha","atp","usha@gmail.com",21);
		Employee emp10=new Employee(10,"krishna","hyderbad","krishna@gmail.com",23);
		
		//Employee emp11 = new Employee(1, "chandradeep", "velgode", "nchandradeep1@gmail.com", 21);
		//System.out.println(emp1.equals(emp11));
		/*
		 * System.out.println(emp1); System.out.println(emp2); System.out.println(emp3);
		 * System.out.println(emp4); System.out.println(emp5); System.out.println(emp6);
		 * System.out.println(emp7); System.out.println(emp8); System.out.println(emp9);
		 * System.out.println(emp10);
		 */
		
		Set<Employee> emp = new TreeSet<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		emp.add(emp7);
		emp.add(emp8);
		emp.add(emp9);
		emp.add(emp10);
		emp.stream().sorted().forEach(n->System.out.print(n));
		//Collections.sort(emp/* , Collections.reverseOrder() */);
		
		//System.out.println(emp);
		
		/*
		 * System.out.println();
		 * System.out.println("The collections are based on the names"); for (Employee
		 * number: emp) { System.out.println(number); }
		 */
	}
		
	public static void main(String[] args) {
		sortingByNames();
	}

}
