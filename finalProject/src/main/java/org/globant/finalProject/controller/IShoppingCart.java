package org.globant.finalProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.globant.finalProject.main.BillLine;
import org.globant.finalProject.main.Product;

public interface IShoppingCart {	 
	
	 public String registerUser(String name, String password, String mail, int phone);
	 public String loggin(String name, String password);
	 public ArrayList<Product> findByCategory(String category);
     public ArrayList<Product> findByName(String name);
	 public String saveCart(List<BillLine> billLine);
	 
}
