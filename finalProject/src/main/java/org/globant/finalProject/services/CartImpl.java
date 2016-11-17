package org.globant.finalProject.services;

import java.util.ArrayList;

import org.globant.finalProject.data.CartDB;
import org.globant.finalProject.model.BillLine;
import org.globant.finalProject.model.Cart;
import org.globant.finalProject.model.Product;
import org.globant.finalProject.model.User;
import org.springframework.stereotype.Service;
@Service
public class CartImpl implements ICart {

	@Override
	public String saveCart(ArrayList<BillLine> billLine, User user) {
		CartDB saveCart = new CartDB();
		return saveCart.saveCart(billLine, user);
	}

	@Override
	public String savePurchase(int confirmParam, int billId) {
		CartDB buyCart = new CartDB();
		
		return buyCart.savePurchase(confirmParam, billId);
	}

	@Override
	public ArrayList<Cart> showCart(int billId) {
		CartDB cart = new CartDB();
		if (cart.validateCart(billId)==true){
			return cart.showCart(billId);
		}
		return cart.showCart(billId);
	}

}
