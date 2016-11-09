package org.globant.topic3.ex02;

public class CrudServiceProxy implements CrudService {
	CrudService implementation;  
	  
    protected CrudServiceProxy(CrudService imp) {  
        this.implementation = imp;  
    }  
  
    public void create() {  
        implementation.create();  
    }
    public void read() {  
        implementation.read();  
    }
    public void update() {  
        implementation.update();  
    }
    public void delete() {  
        implementation.delete();  
    }

	
  
   
}
