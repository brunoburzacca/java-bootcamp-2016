package org.globant.finalProject.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.globant.finalProject.model.BillLine;
import org.globant.finalProject.model.Cart;
import org.globant.finalProject.model.Product;
import org.globant.finalProject.model.User;

public class CartDB {
	int userId;
	float total = 0;
	float add = 0;
	int price = 0;

	public String saveCart(ArrayList<BillLine> billLine, User user) {

		ArrayList<BillLine> bill = billLine;

		try {

			String URL = "jdbc:mysql://localhost/shoppingcart";
			String USER = "root";
			String PASS = "Globant2016";
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("successful connection");

			for (BillLine billLines : billLine) {
				Statement stmt1 = conn.createStatement();
				ResultSet rs1 = stmt1.executeQuery(
						"select productPrice from product where productId ='" + billLines.getProductId() + "'");

				while (rs1.next()) {

					price = rs1.getInt("productPrice");
				}
				add = price * Float.parseFloat(billLines.getCuantity());
				total = total + add;
			}

			PreparedStatement billStmt = conn.prepareStatement("INSERT INTO bill (userId,state,total) VALUES (?,?,?)");

			billStmt.setInt(1, user.getUserId());
			billStmt.setBoolean(2, false);
			billStmt.setFloat(3, total);
			billStmt.execute();

			int key = 0;

			ResultSet generatedKeys = billStmt.getGeneratedKeys();
			if (generatedKeys.next()) {
				key = generatedKeys.getInt(1);
			} else {
				throw new SQLException("Creating user failed, no ID obtained.");
			}

			for (BillLine billLines : billLine) {

				PreparedStatement stmt = conn
						.prepareStatement("INSERT INTO billline (productId,cuantity,billId ) VALUES (?,?,?)");

				stmt.setString(1, billLines.getProductId());
				stmt.setString(2, billLines.getCuantity());
				stmt.setInt(3, key);
				stmt.execute();

			}

		} catch (SQLException e) {
			System.out.println("mySql error");
		}
		return "shopping cart saved";
	}

	public String savePurchase(int confirmParam, int billId) {

		try {
			if (confirmParam == 1) {
				String URL = "jdbc:mysql://localhost/shoppingcart";
				String USER = "root";
				String PASS = "Globant2016";
				Connection conn = DriverManager.getConnection(URL, USER, PASS);
				System.out.println("successful connection");

				PreparedStatement st = conn.prepareStatement("UPDATE bill SET state = ? where billId=?");
				st.setInt(1, 1);
				st.setInt(2, billId);
				st.executeUpdate();

			}
		} catch (SQLException e) {
			System.out.println("mySql error");
		}
		return "your buy was successful";
	}

	public boolean validateCart(int billId) {
		boolean existingCart = false;
		int state = 0;
		try {
			String URL = "jdbc:mysql://localhost/shoppingcart";
			String USER = "root";
			String PASS = "Globant2016";
			Connection conn = DriverManager.getConnection(URL, USER, PASS);

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT  state FROM bill WHERE billId ='" + billId + "'");

			while (rs.next()) {
				state = rs.getInt("state");
			}
			if (state == 0) {
				existingCart = true;
			}
		} catch (SQLException e) {
			System.out.println("mySql error");
		}
		return existingCart;
	}

	public ArrayList<Cart> showCart(int billId) {
		Cart cart = new Cart(0,0,0,null,0);
		ArrayList<Cart> arrayCart = new ArrayList<Cart>();
		float subtotal = 0;
		try {
			String URL = "jdbc:mysql://localhost/shoppingcart";
			String USER = "root";
			String PASS = "Globant2016";
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("SELECT  cuantity,billLine.productId,productName,productPrice FROM billLine,product WHERE billLine.billId ='" + billId + "'and billLine.productId = product.productId");

			while (rs.next()) {
				
				cart.setCuantity(rs.getInt("cuantity"));
				cart.setProductId(rs.getInt("productId"));
				cart.setProductoName(rs.getString("productName"));
				cart.setPrice(rs.getFloat("productPrice"));
				subtotal= rs.getFloat("productPrice")*rs.getInt("cuantity");
				cart.setSubtotal(subtotal);
				arrayCart.add(cart);
			}
		}
		catch (SQLException e) {
			System.out.println("mySql error");
		}
		return arrayCart;
	}

}
