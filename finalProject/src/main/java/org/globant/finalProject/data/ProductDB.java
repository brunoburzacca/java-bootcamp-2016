package org.globant.finalProject.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.globant.finalProject.model.Product;

public class ProductDB {
	public ArrayList<Product> findByCategory(String category) {
		ArrayList<Product> productList = new ArrayList<>();
		

		try {

			System.out.println("trying to connect to the server ");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/shoppingcart", "root", "Globant2016");
			System.out.println("successful connection");

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT  *FROM product WHERE productCategory ='"+ category+ "'" );

			while (rs.next()) {

				int productId = rs.getInt("productId");
				String productName  = rs.getString("productName");
				String productCategory  = rs.getString("productCategory");
				Double productPrice  = rs.getDouble("productPrice");
				Product product = new Product(productId, productName, productCategory, productPrice);
				productList.add(product);
				
			}
					

			

		} catch (SQLException e) {
			System.out.println("mySql error");
		}
		return  productList;
		
		

	}
	public ArrayList<Product> findByName(String name) {
		ArrayList<Product> nameList = new ArrayList<>();
		
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
				nameList.add(product);
				
			}
					

			

		} catch (SQLException e) {
			System.out.println("mySql error");
		}
		return  nameList;
		
		

	}
}
