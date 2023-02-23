package javabasics;

class Hostel
{
	private int hstlnumber;
	private String hstlname;
	
	public int getHstlnumber() {
		return hstlnumber;
	}

	public void setHstlnumber(int hstlnumber) {
		this.hstlnumber = hstlnumber;
	}

	public String getHstlname() {
		return hstlname;
	}

	public void setHstlname(String hstlname) {
		this.hstlname = hstlname;
	}
	
}

public class EncapsualationDemo {

	public static void main(String[] args) {
		Hostel h=new Hostel();
		h.setHstlname("kanchana");
		h.setHstlnumber(912142);
		System.out.println(h.getHstlname());
		System.out.println(h.getHstlnumber());
	}

}
