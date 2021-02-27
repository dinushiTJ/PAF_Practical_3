package com;

import java.sql.Connection;
import java.sql.DriverManager;


public class Item {

	//Step 2.2: Create a Connect method
	public Connection connect()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PAF_lab3_db", "root", "");

			//For testing
			System.out.print("Successfully connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	

}
