package javabasics;

class Company
{
	public void Managers(String name,String empid)
	{
		System.out.println("Emp name is:"+name+"Empid is:"+empid);
	}
}

class Branch extends Company
{
	@Ovverride
	public void Managers(String name,String empid)
	{
		super.Managers("laxman", "is3924");
		System.out.println("Emp name is:"+name+"Empid is:"+empid);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Branch b=new Branch();
		b.Managers("vinay", "is5933");
		
		

	}

}
