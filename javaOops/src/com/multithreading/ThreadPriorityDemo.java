package com.multithreading;

class Earth2 extends Thread
{
	public void run()
	{
		System.out.println("hii i am thread class");
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) throws Exception {
		Runnable c1=()->{
							for(int i=0;i<8;i++)
							{
								System.out.println("college"+i);
								try {Thread.sleep(1000);}catch(Exception e) {}
							}
							
						};
					Runnable p1=()->{
							for(int i=1;i<9;i++) {
							System.out.println();
							}
						};
					Earth2 e=new Earth2();
					Thread t1=new Thread(c1);
					t1.setName("first thread");
					t1.setPriority(Thread.MIN_PRIORITY);
					System.out.println(t1.getPriority());
					System.out.println(t1.getName());
					e.setName("earth tread");
					e.setPriority(Thread.MAX_PRIORITY);
					System.out.println(e.getName());
					System.out.println(e.getPriority());
					t1.run();
					p1.run();
					e.start();
					t1.join();
					e.join();
					for(int i=0;i<8;i++)
					{
						System.out.println(i*i);
					}
				}

			}
		
