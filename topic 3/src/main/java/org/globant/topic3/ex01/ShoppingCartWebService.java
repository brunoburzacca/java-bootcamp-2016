package org.globant.topic3.ex01;

import javax.jws.WebService;

@WebService
public class ShoppingCartWebService implements ShoppingCartService {
	
	ShoppingCartImp imp = new ShoppingCartImp();
	

	public void ShoppingCart() {
		imp.ShoppingCart();
		
	}

}
