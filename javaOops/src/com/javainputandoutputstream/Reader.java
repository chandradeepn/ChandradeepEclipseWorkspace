package com.javainputandoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class Reader {

	public static void main(String[] args) {
		try {
		Writer w=new FileWriter("D://java io files//writer.txt");
		String s="new data";
		w.write(s);
		w.close();
		System.out.println("added data");
		FileReader r=new FileReader("D://java io files//reader.txt");
		int i;
		while((i=r.read())!=-1) {
		System.out.print((char)i);}
		FileReader r1=new FileReader("D://java io files//bufferedreader.txt");
		BufferedReader b1=new BufferedReader(r1);
		int j;
		while((j=r1.read())!=-1) {
		System.out.print((char)j);}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
