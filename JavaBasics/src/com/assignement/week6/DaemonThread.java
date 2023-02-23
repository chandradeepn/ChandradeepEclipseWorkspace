package com.assignement.week6;

class DaemonThrd extends Thread{
	
	public DaemonThrd(int num) {
		super();
	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" "+"is daemon Thread");
		}else {
			System.out.println(getName()+" "+"is current thread");
		}
	}
	
}

public class DaemonThread {
	
	private static void Start() {
		DaemonThrd dt=new DaemonThrd(2);
		DaemonThrd dt1=new DaemonThrd(4);
		DaemonThrd dt2=new DaemonThrd(5);
		
		dt.setDaemon(true);
		dt1.setDaemon(true);
		dt.start();
		dt1.start();
		dt2.start();
	}

	public static void main(String[] args) {
		Start();

	}

}
