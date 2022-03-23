	package com.Database_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnection_MySQL {
	
	@Test
	public void TestDB() throws SQLException{
		//Create connection string
		Connection con = DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username","password");
		//Create statement to execute query
		Statement smt = con.createStatement();
		//Execute query will return Result set in form of table(column and table)
		ResultSet rs = smt.executeQuery("Select * from dbo.Table");
		//rs .next pics and then keep moving till last rows
		while(rs.next()){
			
			//get data as per column name. We can get using column Index as well
			String firstColData = rs.getString("ColumnName");
			System.out.print(firstColData);
		}
		
	}

}
