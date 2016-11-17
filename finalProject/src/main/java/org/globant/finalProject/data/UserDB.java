package org.globant.finalProject.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.globant.finalProject.model.User;

public class UserDB {
	public boolean findUser(String name){
		boolean existingUser=false;
		
		try {
			System.out.println("trying to connect to the server ");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
			System.out.println("successful connection");
			
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT  userName FROM user WHERE userName ='"+ name+ "'" );

			while (rs.next()) {
				
					existingUser=true;
				
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return existingUser;
		
	} 	
	
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
public boolean userLoggin(User user) {
	int userId;
	String result = null;
	String userName;
	String userPassword;
	boolean userLogged=false;
	try {

		System.out.println("trying to connect to the server ");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
		System.out.println("successful connection");

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT userName,userPassword,UserId FROM user where userName='"+user.getName()+"'and userPassword='"+user.getPassword()+"'");

		while (rs.next()) {

				userId = rs.getInt("userId");
				user.setUserId(userId);
				userLogged=true;
		}

	} catch (SQLException e) {
		System.out.println("mySql error");
	}
	return userLogged;

}


}
