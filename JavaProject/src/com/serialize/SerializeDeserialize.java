package com.serialize;

//import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Date implements Serializable
{
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString()
	{
		return "Date:[Day="+day+" Month="+month+" Year="+year+"]";
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
}

class Account implements Serializable
{
	private String name;
	private Date dob;
	//private transient String password; //Shows password as Null
	private String password;
	public Account(String name, Date dob, String password) {
		this.name = name;
		this.dob = dob;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString()
	{
		return "Name="+name+" DOB="+dob+" Password="+password;
	}	
}

public class SerializeDeserialize {
	//private static final String Account = null;

	static void serialize()  throws Exception
	{
		File file=new File("C:\\Users\\HP\\Desktop\\Java\\Stream\\ReadFile.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Account("Sibu",new Date(25,02,1998),"Sibu#@2017"));
		oos.flush();
		oos.close();		
	}
	static void deserialize() throws Exception
	{
		
		File file=new File("C:\\Users\\HP\\Desktop\\Java\\Stream\\ReadFile.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account acc=(Account)ois.readObject();
		System.out.println("Account: "+acc);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Account a=new Account("Sibu",new Date(25,02,1998),"sibu#@2017");
		serialize();
		deserialize();
	}

}
