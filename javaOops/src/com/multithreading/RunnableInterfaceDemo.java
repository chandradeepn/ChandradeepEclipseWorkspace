package com.multithreading;

class College implements Runnable
{
	public void run() {
		for(int i=0;i<8;i++)
		{
			System.out.println("college"+i);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		
	}
	
}
class Planet implements Runnable
{
	public void run()
	{
		for(int i=1;i<9;i++) {
		System.out.println();
		try { Thread.sleep(100);}catch(Exception e) {}
		}
	}
}

class Earth extends Thread
{
	public void run()
	{
		System.out.println("hii i am thread class");
	}
}
public class RunnableInterfaceDemo {

	public static void main(String[] args) {
		College c=new College();
		Planet p=new Planet();
		Earth e=new Earth();
		Thread t1=new Thread();
		c.run();
		p.run();
		e.start();

	}

}
