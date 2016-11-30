package org.globant.finalProject.model;

public class BillLine {

	String productId;
    String cuantity;

	public BillLine(){
	}
	
	public BillLine(String productId, String cuantity){
		this.productId=productId;
		this.cuantity=cuantity;
	}

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCuantity() {
		return cuantity;
	}
	public void setCuantity(String cuantity) {
		this.cuantity = cuantity;
	}

}
