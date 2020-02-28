package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String []args) throws IOException
	{
		File file1=new File("C:\\Users\\HP\\Desktop\\Java\\Stream\\ReadFile.txt");
		FileInputStream fis=new FileInputStream(file1);
		StringBuilder sb=new StringBuilder("");
		int i=0;
		do
		{
			i=fis.read();
			if(i!=-1)
			{
				sb.append((char)i);
			}
		}	while(i!=-1); //-1 as End of File
		System.out.println("File Content:"+sb);
		fis.close();
		
		File file2=new File("C:\\Users\\HP\\Desktop\\Java\\Stream\\WriteFile.txt");
		FileOutputStream fos=new FileOutputStream(file2);
		String strData=sb.toString();
		fos.write(strData.getBytes());
		fos.flush();
		fos.close();
	}
}
	