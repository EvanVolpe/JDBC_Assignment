import java.sql.*; //for standard JDBC program
import java.util.*;
import java.math.*;
import java.sql.Connection;
import java.sql.DriverManager; //for BigDecimal and BigIntege support
//JDBC driver name: oracle.jdbc.driver.OracleDriver
//URL format: jdbc:oracle:thin:@hostname:portNumber:databaseName
public class TestClass

	public static void main(String[] args)throws SQL Exception 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver""));
		String URL = ("\"jdbc:oracle:thin:@localhost:1521:perscholas\",\"oracle\",\"oracle\");"
		Properties info = new Properties();
		// key value
		info.put("user", "sys");
		info.put("password", "oracle");
		Connection conn = DriverManager.getConnection(URL, info);
// OR		String USER = "username", PASS = "password"
//		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		//perform queries here
		conn.close();//closing connection
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		// TODO Auto-generated method stub
		}
