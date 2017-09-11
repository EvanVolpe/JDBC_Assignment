package test.java.project;
import java.sql.*; //for standard JDBC program
import java.util.*;
import java.math.*;
public class oracletesting
{
	//JDBC driver name and database URL
	static final String JDBC_Driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@local:host:1561";
	// Database credentials
	static final String USER = "user";
	static final String PASS = "password";
	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;
		try
		{
			//STEP 2: Register JDBC driver			
			Class.forName("con.mysql.jdbc.Driver");
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			//STEP 4:Execute a query
			System.out.println("Creating database...");
			stmt = conn.createStatement();
			String sql = "CREATE DATABASE EMPLOYEES";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		}
		catch(SQLException se)
		{
			//Handle error for JDBC
			se.printStackTrace();
		}
		catch(Exception e)
		{
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally
		{
			//finally block used to close resources
			try
			{
				if(stmt!=null)
					stmt.close();
			}
			catch(SQLException se2)
			{//nothing we can do
				try
				{
					if(conn!=null)
						conn.close();
				}
				catch(SQLException se)
				{
					se.PrintStackTrace();
				}
				//end finally try
			}//end try
			System.out.println("Goodbye");
		}
		//end main
				}

}
