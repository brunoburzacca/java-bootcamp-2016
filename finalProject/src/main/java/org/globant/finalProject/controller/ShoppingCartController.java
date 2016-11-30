package org.globant.finalProject.controller;

import java.util.ArrayList;

import org.globant.finalProject.model.BillLine;
import org.globant.finalProject.model.Cart;
import org.globant.finalProject.model.Product;
import org.globant.finalProject.model.User;
import org.globant.finalProject.services.ICart;
import org.globant.finalProject.services.IProduct;
import org.globant.finalProject.services.IUser;
import org.globant.finalProject.services.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController  {
	public int userId=0;
	public  User user = new User(null, null, userId);
	
	@Autowired
    private IUser serviceUser;
	@Autowired
    private IProduct serviceProduct;
	@Autowired
    private ICart serviceCart;
    	
	
	@RequestMapping("/registerUser")
	public String registerUser(@RequestParam(value = "name", defaultValue = "null") String name,
			@RequestParam(value = "password", defaultValue = "null") String password,
			@RequestParam(value = "mail", defaultValue = "null") String mail,
			@RequestParam(value = "phone") int phone) {

		return serviceUser.addUser(name, password, mail, phone);
	}

	
	@RequestMapping("/userLoggin")
	public String loggin(@RequestParam(value = "name", defaultValue = "null") String name,
			@RequestParam(value = "password", defaultValue = "null") String password) {	
		user = new User(name, password, userId);
		return serviceUser.logginUser(user);
		
	}

	
	@RequestMapping("/findByCategory")
	public ArrayList<Product>  findByCategory(@RequestParam(value = "category", defaultValue = "null") String category) {
		
	
		return serviceProduct.findByCategory(category) ;
		
	}

	
	@RequestMapping("/findByName")
	public ArrayList<Product> findByName(@RequestParam(value = "name", defaultValue = "null") String name) {
		return serviceProduct.findByName(name);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/saveCart" )
	public @ResponseBody String saveCart(@RequestBody ArrayList<BillLine> billLine ) {		
		return serviceCart.saveCart(billLine, user);
	}
	
	
	@RequestMapping("/savePurchase" )
	public String savePurchase(@RequestParam(value = "confirmParam", defaultValue = "" )int confirmParam,
							@RequestParam(value = "billId", defaultValue = "" )int billId)  {
		return serviceCart.savePurchase(confirmParam, billId);
	}

	@RequestMapping("/showCart" )
	public ArrayList<Cart> showCart(@RequestParam(value = "billId", defaultValue = "" )int billId)  {
		
		return serviceCart.showCart(billId);
	}
	
	@RequestMapping("/logOff" )
	public String showCart()  {
		serviceUser.logOff(user);
		return "user logged off";
	}


	

}
