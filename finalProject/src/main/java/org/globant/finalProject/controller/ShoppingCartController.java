package org.globant.finalProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.globant.finalProject.main.AddUser;
import org.globant.finalProject.main.BillLine;
import org.globant.finalProject.main.FindByCategory;
import org.globant.finalProject.main.FindByName;
import org.globant.finalProject.main.Product;
import org.globant.finalProject.main.SaveCart;
import org.globant.finalProject.main.UserLoggin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController implements IShoppingCart {

	@Override
	@RequestMapping("/RegisterUser")
	public String registerUser(@RequestParam(value = "name", defaultValue = "null") String name,
			@RequestParam(value = "password", defaultValue = "null") String password,
			@RequestParam(value = "mail", defaultValue = "null") String mail,
			@RequestParam(value = "phone") int phone) {

		AddUser user = new AddUser();
		user.addUser(name, password, mail, phone);

		return "user registered successful";
	}

	@Override
	@RequestMapping("/UserLoggin")
	public String loggin(@RequestParam(value = "name", defaultValue = "null") String name,
			@RequestParam(value = "password", defaultValue = "null") String password) {

		UserLoggin loggin = new UserLoggin();

		return loggin.userLoggin(name, password);
	}

	@Override
	@RequestMapping("/findByCategory")
	public ArrayList<Product>  findByCategory(@RequestParam(value = "category", defaultValue = "null") String category) {
		
		FindByCategory findedList = new FindByCategory();
		return findedList.findByCategory(category) ;
		
	}

	@Override
	@RequestMapping("/findByName")
	public ArrayList<Product> findByName(@RequestParam(value = "name", defaultValue = "null") String name) {
		FindByName findedList = new FindByName();
		return findedList.findByName(name);
	}
	//this is not finish yet
	@Override
	@RequestMapping(method = RequestMethod.POST, value = "/saveCart")
	public String saveCart(@RequestBody List<BillLine> billLine) {
		
		SaveCart cart = new SaveCart();
		cart.saveCart(billLine);
		return null;
	}

}
