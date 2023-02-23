package javabasics;

class Web
{
	public void details(String sitename,String url,int http,int ...count)
	{
		
		System.out.println("The site name is:"+sitename+" "+"and the url is:"+url+" "+
				"the status of url is:"+http);
		for(int i:count)
		{
			System.out.println(i);
		}
		
	}
}

public class VarargsExample {

	public static void main(String[] args) {
		Web w1=new Web();
		w1.details("chrome", "www.acssolutions.com",404,1,2,3,4);
		
		

	}

}
