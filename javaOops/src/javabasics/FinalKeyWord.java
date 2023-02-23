package javabasics;

final class A
{
	public void show()
	{
		System.out.println("show in A");
	}
}

class B
{
	final public void show()
	{
		System.out.println("show in b");
	}
}
class C extends B
{
	public void show1()
	{
		System.out.println("show in c");
	}
}

public class FinalKeyWord {

	public static void main(String[] args) {
		final double PI=3.14;
		A a=new A();
		a.show();
		C b1=new C();
		b1.show();
		b1.show1();
		
		System.out.println(PI);
	}

}
