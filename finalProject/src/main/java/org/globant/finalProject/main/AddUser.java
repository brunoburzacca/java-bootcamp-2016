package org.globant.finalProject.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.globant.finalProject.controller.ConnectionManager;


import com.mysql.jdbc.Statement;

public class AddUser {

	public void addUser(String name, String password, String mail, int phone) {
		
		try{
			
			
			System.out.println("trying to connect to the server ");
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
			System.out.println("successful connection");
			
			
		
			 PreparedStatement stmt = conn.prepareStatement("INSERT INTO user ( userName, userPassword, mail, phone) VALUES (?,?,?,?)");
			 
			 stmt.setString (1, name);
			 stmt.setString (2, password);
			 stmt.setString   (3, mail);
			 stmt.setInt(4, phone);
		
			 stmt.execute();
					
		}
		catch(SQLException e){
			System.out.println("mySql error");
		}
	}

	}



		
		
		
	


