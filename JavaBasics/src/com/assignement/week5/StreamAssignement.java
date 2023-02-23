package com.assignement.week5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employees{
	private int id;
	int  age;
	private String name,email,address;
	public Employees(int id, String name, String email, String address,int age) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + ", address=" + address
				+ "+\n]";
	}

}

public class StreamAssignement {

	public static void main(String[] args) {
		Employees emp1 = new Employees(1, "chandradeep", "velgode", "nchandradeep1@gmail.com", 21);
		Employees emp2 = new Employees(2, "anikesh", "odisha", "anikesh@gmail.com", 22);
		Employees emp3 = new Employees(3, "danish", "mumbai", "danish@gmail.com", 21);
		Employees emp4 = new Employees(4, "vinay", "vijayawada", "vinay@gmail.com", 23);
		Employees emp5 = new Employees(5, "prudhvi", "nellore", "prudhvi@gmail.com", 22);
		Employees emp6 = new Employees(6, "sashank", "chittor", "sashank@gmail.com", 21);
		Employees emp7 = new Employees(7, "vishnu", "yerruguntla", "vishnu@gmail.com", 22);
		Employees emp8 = new Employees(8, "greeshma", "kurnool", "greeshma@gmail.com", 21);
		Employees emp9 = new Employees(9, "usha", "atp", "usha@gmail.com", 21);
		Employees emp10 = new Employees(10, "krishna", "hyderbad", "krishna@gmail.com", 23);
		Employees emp11 = new Employees(10, "krishna", "hyderbad", "krishna@gmail.com", 23);
		List<Employees> streamList=new ArrayList<>();
		streamList.add(emp1);
		streamList.add(emp2);
		streamList.add(emp3);
		streamList.add(emp4);
		streamList.add(emp5);
		streamList.add(emp6);
		streamList.add(emp7);
		streamList.add(emp8);
		streamList.add(emp9);
		streamList.add(emp10);
		System.out.println(streamList);
		
		

		List<Employees> employe = streamList.stream().filter(distinctByKey(p->((Employees) p).getAge())).collect(Collectors.toList());
		System.out.println(employe);
		List<Employees> empl = employe.stream().sorted(Comparator.comparing(Employees::getAge).reversed()).collect(Collectors.toList());
		System.out.println(empl);
		System.out.println(empl.get(1));
	}

	private static <T> Predicate<? super Employees> distinctByKey(Function<? super T, ?> keyExtractor) {
		
		  Map<Object, Boolean> seen = new ConcurrentHashMap<>(); 
		    return t -> seen.putIfAbsent(keyExtractor.apply((T) t), Boolean.TRUE) == null; 
	}

}
