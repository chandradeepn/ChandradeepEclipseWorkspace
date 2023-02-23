package javaInnerClass;

class outside
{
	int count;
	int value;
	
	public void show()
	{
		count=1;
		value=2;
		System.out.println("count is:"+count);
		System.out.println("value is:"+value);
	}
	class inside//member class
	{
		int count;
		int value;
		public void details()
		{
			count=2;
			value=4;
			System.out.println("count is:"+count);
			System.out.println("value is:"+value);
		}
	}
	static class inside2
	{
		int count;
		int value;
		public void details()
		{
			count=3;
			value=9;
			System.out.println("count is:"+count);
			System.out.println("value is:"+value);
		} 
	}
}

public class InnerClasses {

	public static void main(String[] args) {
		outside out=new outside();
		out.show();
		
		outside.inside ins=out.new inside();
		ins.details();
		
		outside.inside2 ins1=new outside.inside2();
		ins1.details();
	}
}