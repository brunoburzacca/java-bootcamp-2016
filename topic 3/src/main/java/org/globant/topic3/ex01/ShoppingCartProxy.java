package org.globant.topic3.ex01;

public class ShoppingCartProxy implements ShoppingCartService {
	ShoppingCartService implementation;

	
	protected ShoppingCartProxy(ShoppingCartService imp) {
		this.implementation = imp;
		
	}


	public void ShoppingCart() {
		implementation.ShoppingCart();
		
	}

}