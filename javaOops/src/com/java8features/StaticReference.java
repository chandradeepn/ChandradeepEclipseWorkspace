package com.java8features;

interface Sayable
{
	public void say();
}
interface Clg
{
	public void strong();
}
public class StaticReference {
	public static void say() {
		System.out.println("this the static method reference");
	}
	public static void Thread()
	{
		System.out.println("This is a thread class we are gng to use");
	}
	public static void strong()
	{
		System.out.println("the strong method");
	}
	public static void main(String[] args) {
		Sayable s1=StaticReference::say;
		Thread t1=new Thread(StaticReference::Thread);
		Clg c=StaticReference::strong;
		s1.say();
		t1.run();
		c.strong();
		
	}

}
