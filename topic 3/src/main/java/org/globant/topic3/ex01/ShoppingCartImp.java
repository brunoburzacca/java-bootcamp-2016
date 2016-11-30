package org.globant.topic3.ex01;

import java.util.Scanner;

public class ShoppingCartImp implements ShoppingCartService {
	
	protected void ShoppingCartService(){}

	public void ShoppingCart() {
		
		CartObject [] cart = ShoppingCartTest.getCart();
		CartObject  cartAux[]= ShoppingCartTest.getCart();
		
		boolean flag = false;
		String choice=null;
		int cuantity=0, itemId=0, counter=0;
		

		
		while(flag == false){
			
			System.out.println("select the item id: ");
			Scanner scanItem = new Scanner(System.in);
			itemId = scanItem.nextInt(); 
			
			System.out.println("insert the cuantity you want to purchase:");
			Scanner scan = new Scanner(System.in);
			cuantity = scan.nextInt();
			
			cartAux[counter].cuantity = cuantity;
			cartAux[counter].total = cartAux[counter].cuantity * cartAux[counter].price;
			cartAux[counter].id = itemId;
			cartAux[counter].description= cart[itemId].description;
			cartAux[counter].price= cart[itemId].price;
			counter++;
			
			System.out.println("do you wish to add another product?: y/n");
			Scanner userChoice = new Scanner(System.in);
			choice = userChoice.next();
			if (choice.equals("n")){
				flag=true;
			}
					
			
				
		}
		for(int i=0; i<=4; i++){
			if(cartAux[i].cuantity!=0){
		System.out.println( "product id: "+cartAux[i].id+ " cuantity: "+ cartAux[i].cuantity+" description."+ cartAux[i].description+" price: "+ cartAux[i].price+" total: "+cartAux[i].total );
	}
		}
	
		
	}
	
}