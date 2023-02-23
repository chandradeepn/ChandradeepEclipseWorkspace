package com.java8features;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
interface Parent
{
	public void children(int a);
}

public class ConstructorMethodReference {

	public static void main(String[] args) {
		BiConsumer<String,String> bc1=(n,k)->{
			System.out.println("first name is "+" "+n+" "+"last name is "+k);
		};
		Consumer<Integer> c1=(n)->{
			System.out.println("This is the interface of the consumer and number is "+n);
		};
		Predicate<Integer> p=(n)->n%2==0;
		Supplier s=()->{
			return "this is a supplier method";
		};
		
		bc1.accept("chandradeep", "nagella");
		c1.accept(20);
		System.out.println(p.test(12675));
		System.out.println(s.get());
}
}
