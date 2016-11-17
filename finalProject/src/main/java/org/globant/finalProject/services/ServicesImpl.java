package org.globant.finalProject.services;

import java.util.ArrayList;

import org.globant.finalProject.data.ProductDB;
import org.globant.finalProject.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements IProduct {
	@Override
	public ArrayList<Product> findByCategory(String category){
			ProductDB productList = new ProductDB();
		return productList.findByCategory(category);
		
	}
	@Override
	public ArrayList<Product> findByName(String name) {
		ProductDB nameList = new ProductDB();
		return nameList.findByName(name);
	}

}
