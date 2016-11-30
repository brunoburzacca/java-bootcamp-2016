package org.globant.topic3.ex02;

public class CrudWebServiceClient implements CrudService {
	CrudService webService;  
	
	    public CrudWebServiceClient() {  
	    	
	        webService = new CrudServiceImp();  
	    }  
	  
	   
	    public void create() {  
	        webService.create();  
	    }  
	    public void read() {  
	        webService.read();  
	    }  
	    public void update() {  
	        webService.update();  
	    }  
	    public void delete() {  
	        webService.delete();  
	    }  
	 
}
