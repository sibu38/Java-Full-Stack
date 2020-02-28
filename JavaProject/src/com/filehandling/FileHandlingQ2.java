package com.filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Timestamp;

public class FileHandlingQ2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\HP\\Desktop\\Java\\Stream");
		File files[]=file.listFiles();
		
		for(int i=0;i<files.length;i++)
		{
			System.out.println("Name= "+files[i].getName());
			System.out.println("Size= "+files[i].length()/1024+" KB");
			System.out.println("Read= "+files[i].canRead());
			System.out.println("Write= "+files[i].canWrite());
			//System.out.println("Date= "+files[i].lastModified()/36288000+" Days ago");
			System.out.println("Last Modified: "+new Timestamp(file.lastModified()).toLocalDateTime());
			System.out.println("File Permissions= "+files[i].canExecute());
			System.out.println("File? "+files[i].isFile());
			System.out.println("Directory? "+files[i].isDirectory());
		}
	}

}
