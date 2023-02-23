package com.assignement.week5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FilesIo {
	private static void file() {
		try{    
            FileInputStream fin=new FileInputStream("D:\\java io files\\fileinputstream1.txt");
            FileOutputStream fout=new FileOutputStream("D:\\java io files\\filestream.txt");    
            int increment=0;
            String matterInFile=" ";
            while((increment=fin.read())!=-1) { 
            	matterInFile+=(char)increment;
            }
            byte characters[]=matterInFile.getBytes();
            fout.write(characters);
            fin.close();
            fout.close();
          }catch(Exception e){System.out.println(e);}    
         }    
	public static void main(String[] args) {
		
	file();
		
		

	}

}
