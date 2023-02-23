package com.assignement.week5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Company implements Serializable{
	private int numofempl,numofbranches;
	private String cmpname;
	
	
	
	public Company(int numofempl, int numofbranches, String cmpname) {
		super();
		this.numofempl = numofempl;
		this.numofbranches = numofbranches;
		this.cmpname = cmpname;
	}
	public int getNumofempl() {
		return numofempl;
	}
	public void setNumofempl(int numofempl) {
		this.numofempl = numofempl;
	}
	public int getNumofbranches() {
		return numofbranches;
	}
	public void setNumofbranches(int numofbranches) {
		this.numofbranches = numofbranches;
	}
	public String getCmpname() {
		return cmpname;
	}
	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	
	
	
}

public class SeralizationFile {
	
	private static void Serialize() throws Exception {
		Company c1=new Company(10000,10,"Innova");
		
		FileOutputStream fos = new FileOutputStream("D://java normal files//serializableoutput.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
	
		
		FileInputStream fis = new FileInputStream("D://java normal files//serializableoutput.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Company c2=(Company)ois.readObject();
		System.out.println(c2.getCmpname()+" "+c2.getNumofbranches()+" "+c2.getNumofempl());
		
		FileOutputStream fos1 = new FileOutputStream("D://java normal files//serializableoutput1.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(c2.getCmpname());
		System.out.println("sucess");
		ois.close();
		fos1.close();
		oos.close();
	}

	public static void main(String[] args) throws Exception {
		Serialize();
	

	}

}
