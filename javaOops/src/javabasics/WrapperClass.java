package javabasics;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer a=10;
		
		System.out.println(a);
		
		Integer in=10;//boxing and wrapping
		
		Integer value=in.intValue();//unboxing
		System.out.println(value);
		
		Integer value1=in;//autoboxing
		System.out.println(value1);
		
		int k=value1;//autounboxing
		System.out.println(k);
		
		String num="17";
		
		int s=Integer.parseInt(num);
		
		System.out.println(s);
		
		float f=Float.parseFloat(num);
		System.out.println(f);
		
		
		
		
		
		
		
		

	}

}
