package org.globant.topic3.ex01;

public class CartObject {

	 public int id=0, price=0, cuantity=0, total=0;
	 public String description;
	 
	 public CartObject(int id1, int price1, String description1,int cuantity1 , int total1){
		 this.id =id1;
		 this.price =price1;
		 this.description=description1;
		 this.cuantity =cuantity1;
		 this.total =total1;
	 }
	 
	 
	 public CartObject() { // jpa only
	    }
	 
	public int getCuantity() {
		return cuantity;
	}
	public void setCuantity(int cuantity) {
		this.cuantity = cuantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
