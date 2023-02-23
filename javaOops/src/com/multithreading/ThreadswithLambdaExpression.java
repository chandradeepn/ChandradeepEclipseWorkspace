package com.multithreading;

class Earth1 extends Thread
{
	public void run()
	{
		System.out.println("hii i am thread class");
	}
}
public class ThreadswithLambdaExpression {
	

	
	public class RunnableInterfaceDemo {

		public static void main(String[] args) throws Exception {
			Runnable c=()->{
					for(int i=0;i<8;i++)
					{
						System.out.println("college"+i);
						try {Thread.sleep(1000);}catch(Exception e) {}
					}
					
				};
			Runnable p=()->{
					for(int i=1;i<9;i++) {
					System.out.println();
					}
				};
			Earth1 e=new Earth1();
			Thread t1=new Thread(c);
			t1.run();
			p.run();
			e.start();
			t1.join();
			e.join();
			for(int i=0;i<8;i++)
			{
				System.out.println(i*i);
			}
		}

	}
}
