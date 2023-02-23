package com.javainputandoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferStream {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fout1=new FileOutputStream("D:\\java io files\\fileoutputstream1.txt");
			BufferedOutputStream bout1=new BufferedOutputStream(fout1);
			String s="This is Chandradeep";
			byte b[]=s.getBytes();
			bout1.write(b);
			bout1.close();
			System.out.println("finally added the data in the required class");
			FileInputStream fin1=new FileInputStream("D:\\java io files\\fileinputstream1.txt");
			BufferedInputStream bin1=new BufferedInputStream(fin1);
			int i;
			while((i=bin1.read())!=-1)
					{
						System.out.print((char)i);
					}
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
	}

}
