package org.globant.topic3.ex01;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ShoppingCartTest {
	
	static CartObject cart[] = new CartObject[5];
	
	@BeforeClass
	public static void init(){
		cart[0]= new CartObject(0, 100, "ps4",0,0);
		cart[1]= new CartObject(1, 200, "pc",0,0);
		cart[2]= new CartObject(2, 300, "xbox",0,0);
		cart[3]= new CartObject(3, 400, "wii",0,0);
		cart[4]= new CartObject(4, 500, "sega",0,0);
		
	}

	public static CartObject[] getCart() {
		return cart;
	}

	public static void setCart(CartObject[] cart) {
		ShoppingCartTest.cart = cart;
	}

	@Test
	public void test() {
		//Calling ShoppingCart  with a local instance of the ShoppingCartService  
		ShoppingCartService shoppingCart1 = ShoppingCartFactory.getLocalService();
		shoppingCart1.ShoppingCart();
		  
	/*	//Calling ShoppingCart with a remote instance of the ShoppingCartService using Web services.  
		ShoppingCartService shoppingCart2 = ShoppingCartFactory.getRemoteServiceUsingWebService();  
		shoppingCart2.ShoppingCart();*/

		/*//Calling ShoppingCart with a remote instance of the ShoppingCartService using Web services.  
		ShoppingCartService shoppingCart3 = ShoppingCartFactory.getRemoteServiceUsingJms();  
		shoppingCart3.ShoppingCart();*/
	}
		
	}


