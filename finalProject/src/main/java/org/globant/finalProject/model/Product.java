package org.globant.finalProject.model;

public class Product {
	
	int productId ;
	String producName=null, productCategory=null;
	Double price;
	
	public Product(int productIdParam,String producNameParam,String productCategoryParam, Double priceParam){
		this.productId=productIdParam;
		this.producName=producNameParam;
		this.productCategory=productCategoryParam;
		this.price=priceParam;
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProducName() {
		return producName;
	}
	public void setProducName(String producName) {
		this.producName = producName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
