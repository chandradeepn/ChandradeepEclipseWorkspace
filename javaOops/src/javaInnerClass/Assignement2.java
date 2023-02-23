package javaInnerClass;

interface Colleges {
	public abstract void students(int count);
	public abstract void teachers(int num);
	public abstract void vehicles(int vehicleno);
	default void collegeName() {
		System.out.println("The college name is:"+"Vidyanikethan");
	}
	static void canteen(String location) {
		System.out.println("the location of canteen is:"+location);
	}
}

class Student implements Colleges {

	@Override
	public void students(int count) {
		System.out.println("The students in the college are:"+count);
	}

	@Override
	public void teachers(int num) 
	{	
	}
	@Override
	public void vehicles(int vehicleno) 
	{
		System.out.println("The number of vehicles of the students are:"+vehicleno);	
	}
	public void Student()
	{
		System.out.println("This is the default constructor used in student");
	}
	public void Student(int k)
	{
		System.out.println("The number of students in the class are: "+k);
	}
}
class Teacher implements Colleges
{
	@Override
	public void students(int count) 
	{
		// TODO Auto-generated method stub		
	}
	@Override
	public void teachers(int num) 
	{
		System.out.println("The teacher in the college are:"+num);	
	}
	@Override
	public void vehicles(int vehicleno) 
	{
		System.out.println("The number of teachers vehicles are:"+vehicleno);	
	}
	public void sum(int a,int b)
	{
		System.out.println("The sum of a and b is:"+(a+b));
	}
	public void sum(int a,int b,int c)
	{
		System.out.println("The sum of three numbers are:"+(a+b+c));
	}
}
class Vehicle implements Colleges
{
	@Override
	public void students(int count) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void teachers(int num) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void vehicles(int vehicleno) {
		System.out.println("The count of college vehicles are:"+vehicleno);	
	}
}
public class Assignement2 
{
	public static void main(String[] args) {
		
		Colleges.canteen("left side of the college ");
		System.out.println();
		Colleges c1=new Student();
		c1.collegeName();
		c1.students(30000);
		c1.vehicles(1000);
		c1.students(6);
		System.out.println("*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" "+"*"+" ");
		Colleges c2=new Teacher();
		c2.collegeName();
		c2.teachers(100);
		c2.vehicles(50);
		Teacher t=new Teacher();
		t.sum(5, 6);
		t.sum(5, 6, 7);
		System.out.println("$"+" "+"$"+" "+"$"+" "+"$"+" "+"$"+" "+"$"+" ");
		Colleges c3=new Vehicle();
		c3.collegeName();
		c3.vehicles(56);
	}

}
