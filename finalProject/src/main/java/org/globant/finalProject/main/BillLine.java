package org.globant.finalProject.main;

public class BillLine {
	String productId,cuantity;
	public BillLine(String productId1, String cuantity1){
		this.productId=productId1;
		this.cuantity=productId1;
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
