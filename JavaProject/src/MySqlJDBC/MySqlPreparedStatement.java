package MySqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlPreparedStatement {
	public static void main(String []args) throws Exception
	{
		Scanner Sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver"); //Type IV "thin" Driver
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection Established \n");
		Statement stmt=dbcon.createStatement();
		System.out.println("Enter your choice.\n1.INSERT\t\t2.DELETE");
		int sc1=Sc.nextInt();
		if(sc1==1)
		{	
			PreparedStatement pstmt=dbcon.prepareStatement("INSERT INTO PERSON VALUES(?,?,?)");
			Scanner Sc1=new Scanner(System.in);
			System.out.println("Enter Id:");
			int i1=Sc1.nextInt();			
			pstmt.setInt(1,i1);
			System.out.println("Enter Name:");
			String i2=Sc1.next();
			pstmt.setString(2,i2);
			System.out.println("Enter Age:");
			int i3=Sc1.nextInt();	
			pstmt.setInt(3, i3);
			int updates=pstmt.executeUpdate();
			System.out.println("No. of Updates= "+updates);
			ResultSet rs=stmt.executeQuery("SELECT * FROM PERSON");
			while(rs.next()) {
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				int age=rs.getInt("AGE");
				System.out.println(id+" - "+name+" - "+age);
			}
			rs.close();
			pstmt.close();
			dbcon.close();
			stmt.close();			
		}
		else if(sc1==2) 
		{//To DELETE values into Table PERSON
			Scanner Sc2=new Scanner(System.in);
			System.out.println("Enter the Id You want to Delete:");
			int d1=Sc2.nextInt();
			PreparedStatement pstmt=dbcon.prepareStatement("DELETE FROM PERSON WHERE ID=?");
			pstmt.setInt(1,d1);
			int updates=pstmt.executeUpdate();
			System.out.println(updates);
			ResultSet rs=stmt.executeQuery("SELECT * FROM PERSON");
			while(rs.next()) {
				int id=rs.getInt("ID");
				String name=rs.getString("NAME");
				int age=rs.getInt("AGE");
				System.out.println(id+" - "+name+" - "+age);
			}
		}
	}
}
