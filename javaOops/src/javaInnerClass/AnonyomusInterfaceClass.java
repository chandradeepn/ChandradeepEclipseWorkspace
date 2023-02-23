package javaInnerClass;

interface Teams
{
	void meetings();
	void meetings2();
}

public class AnonyomusInterfaceClass {

	public static void main(String[] args) {
		Teams t1=new Teams() {
			public void meetings()
			{
				System.out.println("i am meeting1");
			}
			public void meetings2()
			{
				System.out.println("i am meeting2");
			}
		};
		t1.meetings();
		t1.meetings2();
		
		
	}

}
