package com.patient.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
       static Connection con;

		public static Connection createC() {
        try{
           //load the driver
        	Class.forName("com.mysql.jdbc.Driver");
        	//create the connection
        	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_manage","root","Poo@bha123");
        }
        catch(Exception e)
        {
        	e.printStackTrace();	
        }
		return con;
}
}
