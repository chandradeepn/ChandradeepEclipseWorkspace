package com.multithreading;


class Student extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++) {
		System.out.println("student"+i);
		
		}
	}
}
class Fun
{
	public void games()
	{
		for(int i=0;i<8;i++) {
		System.out.println("games"+i);}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Student st=new Student();
		Fun f=new Fun();
		st.start();
		try {Thread.sleep(100);}catch(Exception e) {}
		f.games();

	}

}
