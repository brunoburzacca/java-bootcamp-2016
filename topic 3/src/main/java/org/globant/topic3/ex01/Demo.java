package org.globant.topic3.ex01;

public class Demo {
	
	public static void main(String[] args){
		//Calling ShoppingCart  with a local instance of the ShoppingCartService  
		ShoppingCartService shoppingCart1 = ShoppingCartFactory.getLocalService();
		shoppingCart1.ShoppingCart();
		  
	/*	//Calling ShoppingCart with a remote instance of the ShoppingCartService using Web services.  
		ShoppingCartService shoppingCart2 = ShoppingCartFactory.getRemoteServiceUsingWebService();  
		shoppingCart2.ShoppingCart();*/

		/*//Calling doThis with a remote instance of the ServiceA using Web services.  
		ShoppingCartService shoppingCart3 = ShoppingCartFactory.getRemoteServiceUsingJms();  
		shoppingCart3.ShoppingCart();*/
	}
		
}
