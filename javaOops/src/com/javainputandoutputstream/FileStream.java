package com.javainputandoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStream {

	public static void main(String[] args){
		
		try {
			FileOutputStream fout1 =new FileOutputStream("D:\\java io files\\fileoutputstream.txt");
			fout1.write(19);
			fout1.write(78);
			byte arr[]=new byte[10];
//			Scanner sc=new Scanner(System.in);
//			int n=sc.nextInt();
//			for(int i=0;i<n;i++)
//			{
//				arr[i]=sc.nextByte();
//			}
//			fout1.write(arr);
			fout1.close();
			System.out.println("finally added the data in the required file");
			FileInputStream fin1=new FileInputStream("D:\\java io files\\fileinputstream.txt");
			System.out.println((char)fin1.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
