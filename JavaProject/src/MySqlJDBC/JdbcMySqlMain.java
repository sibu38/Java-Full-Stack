package MySqlJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMySqlMain {
	public static void main(String []args) throws Exception
	{
	Class.forName("com.mysql.jdbc.Driver"); //Type IV "thin" Driver
	Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	System.out.println("Connection Established \n");
	Statement stmt=dbcon.createStatement();
	ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEE");
	while(rs.next()) {
		int id=rs.getInt("Id");
		String name=rs.getString("Name");
		double salary=rs.getDouble("Salary");
		System.out.println(id+" - "+name+" - "+salary);
	}
	/*rs.close();
	stmt.close();
	dbcon.close();*/
	//int c=stmt.executeUpdate("INSERT INTO EMPLOYEE(Id,Name,Salary) VALUES(4,'SOMU',52000)");
	//int c=stmt.executeUpdate("INSERT INTO EMPLOYEE(Id,Name,Salary) VALUES(5,'MANDEEP',52000)");
	/*while(rs.next()) {
		int id=rs.getInt("Id");
		String name=rs.getString("Name");
		double salary=rs.getDouble("Salary");
		System.out.println(id+" - "+name+" - "+salary);
	}*/
	//int c=stmt.executeUpdate("DELETE FROM EMPLOYEE WHERE Id=6");
	while(rs.next()) {
		int id=rs.getInt("Id");
		String name=rs.getString("Name");
		double salary=rs.getDouble("Salary");
		System.out.println(id+" - "+name+" - "+salary);
	}
	}
}
