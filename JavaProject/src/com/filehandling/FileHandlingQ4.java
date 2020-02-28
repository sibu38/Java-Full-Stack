package com.filehandling;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class A 
	{
	public void Operation() throws IOException
	{
		//creating the FileInputStream objects for all the following files 
		FileInputStream fis1=new FileInputStream("C:\\Users\\HP\\Desktop\\Java\\Stream\\abc.txt");
		FileInputStream fis2=new FileInputStream("C:\\Users\\HP\\Desktop\\Java\\Stream\\pqr.txt");
		FileInputStream fis3=new FileInputStream("C:\\Users\\HP\\Desktop\\Java\\Stream\\xyz.txt");
		
		//adding FileInputStream obj into a vector obj
		Vector v=new Vector();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		
		//creating enumeration obj by calling elements method
		Enumeration enumeration=v.elements();
		
		//passing enumeration obj into SequesnceInputStream constructor
		SequenceInputStream sis=new SequenceInputStream(enumeration);
		
		//printing all 3 files' data
		int i=0;
		while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
			sis.close();
			fis1.close();
			fis2.close();
			fis3.close();
		}
		
	}

public class FileHandlingQ4 {
	public static void main(String []args) throws IOException
	{
		A obj=new A();
		obj.Operation();
	}
}
