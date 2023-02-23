package javabasics;

class employee
{
	String name;
	String empid;
	int phno;
	static String compname;
	
	public void show() {
		System.out.println("employee name is"+name+" "+"employee id is:"+empid+" "+"employee phonenumber is:"
				+phno+" "+"company name is"+compname);
	}
	
}

public class StaticExample {

	public static void main(String[] args) {
		employee emp=new employee();
		emp.empid="is5433";
		emp.name="chandradeep";
		emp.phno=91214275;
		employee.compname="innova solutions";
		
		employee emp1=new employee();
		emp1.empid="is5434";
		emp1.name="pavan";
		emp1.phno=91824253;
		
		emp.show();
		emp1.show();
		
		
		

	}

}
