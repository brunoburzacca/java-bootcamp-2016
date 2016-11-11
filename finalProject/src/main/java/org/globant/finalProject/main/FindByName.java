package org.globant.finalProject.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FindByName {

	public ArrayList<Product> findByName(String name) {
		ArrayList<Product> list = new ArrayList<>();
		
		try {

			System.out.println("trying to connect to the server ");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
			System.out.println("successful connection");

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT  *FROM product WHERE productName ='"+ name+ "'" );

			while (rs.next()) {

				int productId = rs.getInt("productId");
				String productName  = rs.getString("productName");
				String productCategory  = rs.getString("productCategory");
				Double productPrice  = rs.getDouble("productPrice");
				Product product = new Product(productId, productName, productCategory, productPrice);
				list.add(product);
				
			}
					

			

		} catch (SQLException e) {
			System.out.println("mySql error");
		}
		return  list;
		
		

	}
}
