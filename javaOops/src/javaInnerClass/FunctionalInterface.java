package javaInnerClass;

@FunctionalInerface
interface word
{
	void save();
}

interface add
{
	void sum(int i,int j);
}
public class FunctionalInterface {

	public static void main(String[] args) {
		
		word w=()->System.out.println("i am going to save the product");
		w.save();
		add a=(i,j)->System.out.println(i+j);
		a.sum(6, 7);
	}

}
