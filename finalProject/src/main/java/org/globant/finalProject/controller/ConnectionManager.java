package org.globant.finalProject.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class ConnectionManager {
	
	public void connection(){
	try{
		System.out.println("trying to connect to the server ");
	
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
		System.out.println("successful connection");
	}
	catch(SQLException e){
		System.out.println("mySql error");
	}
}

	
}