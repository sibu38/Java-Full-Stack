package com.collection_framework;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

class User
{
	private String name;
	private String password;
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
}

public class ChatRoomQ6 {
	static HashMap<String,User> hmapUsers=new HashMap<String,User>(); 	
	/*static TreeSet<User> usersList = new TreeSet<User>(); 
	static ArrayList<String> msgList = new ArrayList<String>();
	static Map<String,usersList> hmapUsers=new HashMap<String,usersList>();
	static Map<String,msgList> hmapMsg=new HashMap<String,msgList>();*/

	public static void main(String []args)
	{
		
		System.out.println("\n\n\n\t\t\t\tWelcome to ChatRoom\r\n\n");
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1.Create Chat Room.");
		System.out.println("2.Add User.");
		System.out.println("3.Send a message.");
		System.out.println("4.Display message from specific Chat Room.");
		System.out.println("5.List of users in a specified Chat Room.");
		System.out.println("6.Logout.");
		System.out.println("7.Delete a user.");
		System.out.println("8.Delete the Chat Room.");
		System.out.println("Choose your Option.");
		
		Scanner Sc=new Scanner(System.in);
		Scanner Sc1=new Scanner(System.in);
		int choice=Sc.nextInt();
		int choice1;
		String str;
		User u[]=new User[3];		
		switch(choice)
		{
			case 1: System.out.println("Enter Type of Room.");
					System.out.println("1.Sports");
					System.out.println("2.Computer");
					choice1=Sc1.nextInt();					
					if (choice1==1)
					{
					hmapUsers.put("Sports",new User("Siba","QWERTY"));
					System.out.println(hmapUsers.get("Sports"));break;
					}
					else if (choice1==2)
					{
					hmapUsers.put("Computer",new User("Siba","ASDFGH"));
					System.out.println(hmapUsers.get("Computer"));break;
					}
					else System.out.println("Invalid Choice");
					break;
			case 2:
					
					
		}
	}
}
