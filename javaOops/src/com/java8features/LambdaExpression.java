package com.java8features;

import java.util.ArrayList;
import java.util.List;

interface School
{
	public void draw();
}
interface College
{
	public void show(int a);
}
interface College1
{
	public void create(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		School s=new School() {
			public void draw()
			{
				System.out.println("this is the method with no lambda expression");
			}
		};
		School s1=()->{
			System.out.println("this is the method with lambda expression");
		};
		
		College c=(a)->{
			System.out.println("the number of college is with single parameter "+a);
		};
		College1 c1=(a,b)->{
			System.out.println("the total  of a and b is eith double parameter "+(a+b));
		};
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(40);
		l1.add(30);
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				System.out.println("this is creating a thread class without using lambda expression");
			}
		};
		Runnable r2=()->{
			System.out.println("this is creating a thread class using lambda expression");
		};
		s.draw();
		s1.draw();
		c.show(1);
		c1.create(23, 45);
		l1.forEach((n)->{
			System.out.println("these are the values printed using the foreach loop with lambda epressionn "+n);
		});
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.run();
		t2.run();
	}

}
