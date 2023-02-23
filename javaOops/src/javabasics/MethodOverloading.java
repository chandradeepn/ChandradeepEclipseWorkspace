package javabasics;

class fun
{
	String gamename;
	int time;
	int winner;
	
	public void details()
	{
		gamename="ludo";
		time=20;
		winner=1;
		System.out.println("gamename is:"+gamename+" "+"time for game is:"+time+" "+"winner of the game is:"+winner);
	}
	
	public void details(int ti)
	{
		gamename="rummy";
		time=ti;
		winner=1;
		System.out.println("gamename is:"+gamename+" "+"time for game is:"+time+" "+"winner of the game is:"+winner);
	}
	
	public void details(int ti,int win)
	{
		gamename="pubg";
		time=ti;
		winner=win;
		System.out.println("gamename is:"+gamename+" "+"time for game is:"+time+" "+"winner of the game is:"+winner);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		fun fun1=new fun();
		fun1.details();
		fun1.details(30);
		fun1.details(25, 2);
	}

}
