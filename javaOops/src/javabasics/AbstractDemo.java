package javabasics;

abstract class Writer
{
	public abstract void need();
	public abstract void matter();
	
	public void show()
	{
		System.out.println("ding dong");
	}
	
}

class Pen extends Writer
{

	@Override
	public void need() {
		System.out.println("some input");
		
		
	}

	@Override
	public void matter() {
		System.out.println("important");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Writer obj=new Pen();
		obj.need();
		obj.matter();
		obj.show();
	}

}
