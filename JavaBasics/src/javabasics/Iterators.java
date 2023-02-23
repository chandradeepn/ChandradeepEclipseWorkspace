package javabasics;

public class Iterators {

	public static void main(String[] args) {
		int num=1;
		if(num%2==0)
		{
			System.out.println(num);
			num++;
		}
		
//		do {
//			System.out.println(num);
//			num++;
//		}while(num>0);
		
		for(int i=0;i<6;i++)
		{
			int sum=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1+" ");
				sum++;
			}
			System.out.println();
		}
	}

}
