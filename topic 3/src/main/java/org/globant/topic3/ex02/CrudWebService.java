package org.globant.topic3.ex02;

public class CrudWebService implements CrudService {
	CrudService imp = new CrudServiceImp();  
	  
	    
	 public void create() {  
	        imp.create();  
	    }
	 public void read() {  
	        imp.read();  
	    } 
	 public void update() {  
	        imp.update();  
	    } 
	 public void delete() {  
	        imp.delete();  
	    } 
	  
	    
}
