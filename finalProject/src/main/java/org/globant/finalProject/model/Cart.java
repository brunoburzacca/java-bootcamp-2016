package org.globant.finalProject.model;

public class Cart {
	int cuantity=0;
	int productId=0;
	String productoName=null;
	float price=0;
	float subtotal=0;
	public Cart(int cuantityParam,int productIdParam,float priceParam,String productoNameParam,float subtotalParam){
		this.cuantity=cuantityParam;
		this.productId=productIdParam;
		this.price=priceParam;
		this.productoName=productoNameParam;
		this.subtotal=subtotalParam;
	}
	public int getCuantity() {
		return cuantity;
	}
	public void setCuantity(int cuantity) {
		this.cuantity = cuantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductoName() {
		return productoName;
	}
	public void setProductoName(String productoName) {
		this.productoName = productoName;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
