package org.globant.finalProject.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

// this is not finish yet------------------------------------------------

public class SaveCart {
	int userId;
	
	public void saveCart(List<BillLine> billLine){
		
		UserLoggin user= new UserLoggin();
		userId=user.getUserId();
		
		
		
try{
			
			
			System.out.println("trying to connect to the server ");
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
			System.out.println("successful connection");
			
			
			for(BillLine billLines : billLine){
			 PreparedStatement stmt = conn.prepareStatement("INSERT INTO billline (productId,cuantity,billId ) VALUES (?,?,?)");
			 
			 stmt.setString (1,billLines.getProductId() );
			 stmt.setString (2, billLines.getCuantity());
			 stmt.setInt (3, 1);
			 
		
			 stmt.execute();
			}
		}
		catch(SQLException e){
			System.out.println("mySql error");
		}
	}
		

}