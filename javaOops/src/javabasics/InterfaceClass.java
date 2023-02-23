package javabasics;

interface Family
{
	public abstract void show();
	public abstract void details();
	
}

abstract class Mother
{
	public abstract void sub();
	public void matter()
	{
		System.out.println("hii");
	}
}

class son extends Mother implements Family
{

	@Override
	public void show() {
		System.out.println("i am the son of my mother");
		
	}

	@Override
	public void details() {
		System.out.println("i am a boy");
		
	}

	@Override
	public void sub() {
		System.out.println("ntg");
		
	}
	
}


public class InterfaceClass {

	public static void main(String[] args) {
		
		Family f=new son();
		f.show();
		f.details();
		Mother m=new son();
		m.sub();
		m.matter();
		

	}

}
