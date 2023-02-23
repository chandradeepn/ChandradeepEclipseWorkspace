package javabasics;

class Hotel
{
	public Hotel()
	{
		System.out.println("It is just a normal hotel");
	}
}

class Restarunt extends Hotel{
	public Restarunt()
	{
		System.out.println("Its just a restuarant from hotel");
	}
	public Restarunt(int food)
	{
		System.out.println("The food from restarunt");
	}
	
}

class Dine_in extends Restarunt
{
	public Dine_in()
	{
		System.out.println("Its just a dine-in from the restarunt");
	}
	
	public Dine_in(int bar)
	{
		super(3);
		System.out.println("The bar from the dine in restarunt");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Dine_in r=new Dine_in(1);
	

	}

}
