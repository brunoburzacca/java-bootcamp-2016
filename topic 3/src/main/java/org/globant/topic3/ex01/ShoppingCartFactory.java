package org.globant.topic3.ex01;

public class ShoppingCartFactory {
	
	private ShoppingCartFactory(){}
	
	public static ShoppingCartService getLocalService(){
		return new ShoppingCartImp();
	}
	

}
