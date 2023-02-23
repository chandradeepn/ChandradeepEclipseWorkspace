package com.java8features;

interface scl
{
	public void display();
}

public class InstanceMethodreference {
	public void display()
	{
		System.out.println("new thing");
	}
	public void show()
	{
		System.out.println("show");
	}
	public static void main(String[] args) {
		InstanceMethodreference imf=new InstanceMethodreference();
		scl s=imf::display;
		Thread t1=new Thread(imf::show);
		s.display();
		t1.start();
	}

}
