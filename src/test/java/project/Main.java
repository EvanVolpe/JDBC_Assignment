import java.sql.*; 
import java.util.*;
import java.sql.*;

public class Main
{  
public static void main(String args[])
{  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:perscholas","oracle","oracle");  

System.out.println("...connected to database");
  
//step3 create the statement object  
Statement stmt=con.createStatement();  

// create Employees table
//String sql = "CREATE TABLE Employees (id NUMBER(10) GENERATED ALWAYS AS IDENTITY PRIMARY KEY, firstName VARCHAR(255), lastName VARCHAR(255), time_in VARCHAR(255), time_out VARCHAR(255)) ";

String sql = "SELECT * FROM EMPLOYEES";

stmt.execute(sql);

//stmt.executeUpdate(sql);

System.out.println("Created employee table in given database...");

stmt.executeUpdate("Insert into employees (firstName, lastName) values ('Rachel', 'Salvatore')");
System.out.println("...added entry to table");

//step4 execute query  
//ResultSet rsz=stmt.executeQuery("select * from employee");  
//while(rs.next())  
//System.out.println(rs.getInt(1) + " " + rs.getString(2)+"  "+rs.getString(3));

//ResultSet rs=stmt.executeQuery("select id from employee where first = 'Jim' ");  
//while(rs.next())  
//System.out.println(rs.getInt(1));  
//  
//step5 close the connection object  
con.close();  


  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
