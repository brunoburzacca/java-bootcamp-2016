package org.globant.finalProject.model;

public class Product {
	
	int productId ;
	String producName=null, productCategory=null;
	Double price;
	
	public Product(int productId1,String producName1,String productCategory1, Double price1){
		this.productId=productId1;
		this.producName=producName1;
		this.productCategory=productCategory1;
		this.price=price1;
		
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
