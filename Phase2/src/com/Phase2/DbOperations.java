package com.Phase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DbOperations {
	public static final String DB_URL="jdbc:mysql://localhost:3306/db";
	public static final String USERNAME="root";
	public static final String PASSWORD="abcd";
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		//register my driver
		Class.forName("com.mysql.jdbc.Driver");
		//to establish connection with db
		Connection con = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		if(con!= null) {
			System.out.println(con+"connection Established");
		}
		else {
			System.out.println("connection not established ");
		}
	

	    //prepare a sql statement->Statement,PreparedStatement
	   String sql = "insert into student values(50,'Naveen','nav.gmail.com')";
	   Statement st = con.createStatement();
	 //CRUD
	 		//insert,update,delete-->executeUpdate()
	   int rows=st.executeUpdate(sql);
	   


}
}