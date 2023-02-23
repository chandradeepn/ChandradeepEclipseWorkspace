package javabasics;

class chandu
{
	String name;
	int phonenumber;
	
	public chandu()
	{
		name="chandradeep";
	}
	
	public chandu(int i,int j)
	{
		int result=i+j;
		System.out.println(result);
	}
	
	public chandu(String num1)
	{
		name=num1;
	}
	
	public chandu(String name,int phonenumber)
	{
		this.name=name;
		this.phonenumber=phonenumber;
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		chandu ch=new chandu();
		System.out.println(ch.name);
		System.out.println(ch.phonenumber);
		
		chandu ch1=new chandu(10,11);
		
		chandu ch2=new chandu("chandu",9121);
		System.out.println(ch2.name);
		System.out.println(ch2.phonenumber);
		
		chandu ch3=new chandu("chand",42759);
		System.out.println(ch3.name);
		System.out.println(ch3.phonenumber);
	}

}
