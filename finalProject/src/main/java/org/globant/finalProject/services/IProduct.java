package org.globant.finalProject.services;

import java.util.ArrayList;

import org.globant.finalProject.model.Product;

public interface IProduct {
	public ArrayList<Product> findByCategory(String category);
	public ArrayList<Product> findByName(String name);

}
