package javaInnerClass;

class A
{
	public void show()
	{
		System.out.println("i am new");
	}
}

class B extends A{
	public void show()
	{
		System.out.println("i am the middle");
	}
}


public class AnonymousBasicClass {

	public static void main(String[] args) {
		
		A obj=new A() {
			public void show()
			{
				System.out.println("i am the old");
			}

		};
		obj.show();
		
		B obj1=new B();
		obj1.show();
		
		
		

	}

}
