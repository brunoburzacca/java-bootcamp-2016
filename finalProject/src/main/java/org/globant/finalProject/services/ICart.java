package org.globant.finalProject.services;

import java.util.ArrayList;

import org.globant.finalProject.model.BillLine;
import org.globant.finalProject.model.Cart;
import org.globant.finalProject.model.Product;
import org.globant.finalProject.model.User;

public interface ICart {
	 public String savePurchase(int confirmParam, int billId);
	 public String saveCart(ArrayList<BillLine> billLine, User user);
	 public ArrayList<Cart>  showCart(int billId);
}
