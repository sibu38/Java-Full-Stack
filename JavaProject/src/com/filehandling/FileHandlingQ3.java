package com.filehandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;

import java.io.DataInputStream;


public class FileHandlingQ3 {
	public static void main(String []args) throws IOException 
	{
		//Writting File
		File file=new File("C:\\Users\\HP\\Desktop\\Java\\Stream\\ReadFile.txt");
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(fos);
		
		
		dos.writeInt(551020);
		dos.writeDouble(50000.0);
		dos.writeUTF("Sibu");
		dos.flush();
		fos.close();
		dos.close();
		fos.close();
		
		//Reading File
		file=new File("C:\\Users\\HP\\Desktop\\Java\\Stream\\ReadFile.txt");
		FileInputStream fis=new FileInputStream(file);
		DataInputStream dis=new DataInputStream(fis);
		int accountNo=dis.readInt();
		double balance=dis.readDouble();
		String name=dis.readUTF();
		
		//Print Files
		System.out.println("Account no= "+accountNo);
		System.out.println("Balance= "+balance);
		System.out.println("Name= "+name);
		dis.close();
		
	}
}
