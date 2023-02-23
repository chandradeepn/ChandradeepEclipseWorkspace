package com.assignement.week5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class NormalFiles {
	private static void Reader() throws Exception {
		FileOutputStream fos = new FileOutputStream ("D:\\java normal files\\output-data.txt " );
		PrintStream ps=new PrintStream(fos);
		ps.println("Welcome to innova solutions");
		ps.println(23.6);
		ps.close();
		
		FileInputStream fis=new FileInputStream("D:\\java normal files\\output-data.txt");
		DataInputStream dis=new DataInputStream(fis);
		int count=fis.available();
		byte b[]=new byte[count];
		dis.read(b);
		dis.close();
		FileOutputStream fos1=new FileOutputStream("D:\\java normal files\\output.txt");
		fos1.write(b);
		fos1.close();	
		System.out.println("sucess");
				
		
		}

	public static void main(String[] args) throws Exception {
		
		Reader();

	}

}
