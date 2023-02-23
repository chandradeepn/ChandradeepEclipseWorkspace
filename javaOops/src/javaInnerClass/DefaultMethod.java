package javaInnerClass;

interface School
{
	void teachers();
	default void students()
	{
		System.out.println("in my school there are so many students");
	}
}

interface College
{
	default void students()
	{
		System.out.println("in my college there are so many students");
	}
}
class Division implements School,College
{

	@Override
	public void teachers() {
		System.out.println("i am the social teacher of class 1");
		
	}

	@Override
	public void students() {
		// TODO Auto-generated method stub
		College.super.students();
	}
	
	
}

public class DefaultMethod {

	public static void main(String[] args) {
	
		Division d=new Division();
		d.teachers();
		d.students();
		
		

	}

}
