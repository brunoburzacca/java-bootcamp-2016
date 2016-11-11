package org.globant.finalProject.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserLoggin {
	public int userId;
	public String userLoggin(String name, String password){
		
		String result= null;
		
		try{
			
			
			System.out.println("trying to connect to the server ");
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
			System.out.println("successful connection");
		
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT userName,userPassword,UserId FROM user");
			
			while (rs.next()) {
				
				  String userName = rs.getString("userName");
				  String userPassword = rs.getString("userPassword");
				  
				  if (userName.equals(name) && userPassword.equals(password) ){
					  
					 userId =rs.getInt("userId");
				    
					  result = "loggin success";
					  
				  }else{
					  result = "loggin fail";
				  }
					  
				  
				}
		
	}
		catch(SQLException e){
			System.out.println("mySql error");
		}
		return result;

}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
